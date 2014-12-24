// Author: talafous
tree grammar OnyxWalker;

options {
  tokenVocab   = Onyx;
  ASTLabelType = CommonTree;
}

@header {
  package com.cboe.onyx;
  import java.util.Map;
  import java.util.HashMap;
  import com.cboe.onyx.verb.*;
  import com.cboe.interfaces.presentation.api.MarketMakerAPI;
  import com.cboe.idl.cmiSession.TradingSessionStruct;
  import com.cboe.idl.cmiConstants.ProductTypesOperations;
  import com.cboe.idl.cmiConstants.Sides;
  import com.cboe.interfaces.presentation.product.SessionProduct;
  import com.cboe.idl.cmiStrategy.StrategyRequestStruct;
}

@members {
  private Map<String,Object> names;
  private MarketMakerAPI mmAPI;
  private OnyxCASCallback casCallback = new OnyxCASCallback("Onyx");
  private TradingSessionStruct[] sessions;
  private TradingSessionStruct currentSession;
  private SessionProduct selectedSessionProduct;
  Accept accept;
  Cancel cancel;
  Connect connect;
  Create create;
  Get get;
  Login login;
  Logout logout;
  Query query;
  Select select;
  Send send;
  Subscribe subscribe;
  Wait wait;
}

commands
  : command*
  ;

command
  :
  COMMENT
  |
  ^(COMMENT LINE)
  {
    System.out.println("WALKER: "+$COMMENT.text);
  }
  |
  ^(CONNECT ^(TO CAS) ^(WHERE ^(HOSTNAME QVALUE)))
  { 
    connect = Connect.getInstance();
    connect.setHostName(Util.dq($QVALUE.text));
    connect.connectToCAS();
  }
  |
  ^(LOGIN ^(WHERE ^(USERNAME a=QVALUE) ^(PASSWORD b=QVALUE)))
  {
    login = Login.getInstance();
    login.setUserName(Util.dq($a.text));
    login.setPassword(Util.dq($b.text));
    login.setCasCallback(casCallback);
    login.login();
    mmAPI = login.getMmAPI();
  }
  |
  ^(WAIT ^(WHERE ^(DURATION QVALUE)))
  {
    wait = Wait.getInstance();
    wait.setDuration(Util.dq($QVALUE.text));
    wait.wait2();
  }
  |
  LOGOUT
  {
    logout = Logout.getInstance();
    logout.setMmAPI(mmAPI);
    logout.logout();
  }
  |
  ^(GET SESSIONS)
  {
    get = Get.getInstance();
    get.setMmAPI(mmAPI);
    sessions = get.getSessions(casCallback);
    for (TradingSessionStruct session : sessions) {
      System.out.println(session.sessionName);
    }
  }
  |
  ^(SELECT SESSION ^(WHERE ^(NAME a=QVALUE)))
  {
    select = Select.getInstance();
    select.setMmAPI(mmAPI);
    select.selectCurrentSession(Util.dq($a.text));
    currentSession = select.getCurrentSession();
  }
  |
  ^(GET PRODUCT_TYPES )
  {
    get = Get.getInstance();
    get.setCurrentSession(currentSession);
    get.setMmAPI(mmAPI);
    get.getProductTypes();
  }
  |
  ^(GET PRODUCT_CLASSES ^(WHERE ^(PRODUCT_TYPE OPTION)))
  {
    get = Get.getInstance();
    get.setCurrentSession(currentSession);
    get.setMmAPI(mmAPI);
    get.setCasCallback(casCallback);
    get.getProductClassesForSession(ProductTypesOperations.OPTION);
  }
  |
  ^(GET PRODUCTS ^(WHERE ^(PRODUCT_TYPE OPTION) ^(SYMBOL a=QVALUE)))
  {
    get = Get.getInstance();
    get.setCurrentSession(currentSession);
    get.setMmAPI(mmAPI);
    get.setCasCallback(casCallback);
    get.getProductsForSessionWithSymbolOfType(Util.dq($a.text),ProductTypesOperations.OPTION);
  }
  |
  ^(SELECT ^(PRODUCT RANDOM) ^(WHERE ^(PRODUCT_TYPE OPTION) ^(SYMBOL a=QVALUE)))
  {
    get = Get.getInstance();
    get.setCurrentSession(currentSession);
    get.setMmAPI(mmAPI);
    get.setCasCallback(casCallback);
    get.getProductsForSessionWithSymbolOfType(Util.dq($a.text),ProductTypesOperations.OPTION);
    SessionProduct[] sessionProducts = get.getSessionProducts();
    selectedSessionProduct = sessionProducts[Util.getRandomInt(sessionProducts.length)];
  }
  |
  ^(ACCEPT QUOTE ^(WHERE ^(QUANTITY a=QVALUE) ^(ASK b=QVALUE) ^(BID c=QVALUE)))
  {
    accept = Accept.getInstance();
    accept.setCurrentSession(currentSession);
    accept.setMmAPI(mmAPI);
    int quantity = Integer.parseInt(Util.dq($a.text));
    double ask = Double.parseDouble(Util.dq($b.text));
    double bid = Double.parseDouble(Util.dq($c.text));
    accept.acceptQuote(selectedSessionProduct.getProductKey(), quantity, ask, bid);
  }
  |
  ^(ACCEPT ORDER ^(WHERE ^(SEQUENCE_NUMBER b=QVALUE) ^(QUANTITY c=QVALUE) ^(PRICE d=QVALUE) ^(SIDE BUY)))
  {
    accept = Accept.getInstance();
    accept.setCurrentSession(currentSession);
    accept.setMmAPI(mmAPI);
    int seqNum = Integer.parseInt(Util.dq($b.text));
    int quantity = Integer.parseInt(Util.dq($c.text));
    double price = Double.parseDouble(Util.dq($d.text));
    accept.acceptOrder(selectedSessionProduct.getProductKey(),login.getUserName(), seqNum, quantity, price, Sides.BUY);
  }
  |
  ^(CREATE ^(RANDOM STRATEGY) ^(WHERE ^(NAME a=QVALUE)))
  {
    create = Create.getInstance();
    if (names.containsKey(Util.dq($a.text))) {
      throw new RuntimeException("duplicate name");
    }
    
    names.put(Util.dq($a.text), create.createRandomStrategy());
  }
  ^(ACCEPT STRATEGY ^(WHERE ^(NAME a=QVALUE))) {
    accept = Accept.getInstance();
    accept.setMmAPI(mmAPI);
    accept.setCurrentSession(currentSession);
    accept.acceptSessionStrategy((StrategyRequestStruct)names.get(Util.dq($a.text)));
  }
  ;

