// DOMAIN SPECIFIC LANGUAGE FOR CBOE
// Author: talafous
grammar Onyx;

options {
language=Java;
output=AST;
}

tokens {
// verbs ----------------------------
  ACCEPT='accept';
    CANCEL='cancel';
    CONNECT ='connect';
    CREATE='create';
    GET='get';
    LOGIN='login';
    LOGOUT = 'logout';
    REPLACE='replace';
    SELECT='select';
    SEND='send';
    SUBSCRIBE='subscribe';
    WAIT = 'wait';
    // nouns ---------------------------------
    BOOK='book';
    BUY='buy';
    CAS='cas';
    DURATION='duration';
    HOSTNAME='hostname';
    CURRENT_MARKET='currentMarket';
    FILENAME='filename';  
    FIRM='firm';
    KEY='key';
    MARKET_DATA='marketData';
    MESSAGE='message';
    NAME='name';
    NBBO='nbbo';
    OPTION='option';
    ORDER='order';
    ORDER_HISTORY='orderHistory';
    PASSWORD='password';
    PREFERENCES='preferences';
    PRICE='price';
    PRODUCT='product';
    PRODUCTS='products';
    PRODUCT_CLASS='productClass';
    PRODUCT_CLASSES='productClasses';
    PRODUCT_TYPE='productType';
    PRODUCT_TYPES='productTypes';
    QUANTITY='quantity';
    QUOTE='quote'; 
    RECAP='recap';
    RFQ='rfq';
    ROLE='role';
    SELL='sell';
    SESSION='session';
    SESSIONS='sessions';
    SEQUENCE_NUMBER='sequenceNumber';
    SIDE='side';
    STRATEGY='strategy';
    SYMBOL='symbol';
    TICKER='ticker';
    TIME='time';
    TRADER_PRODUCT_HISTORY='traderProductHistory';
    USERNAME='username';
    USER_MARKET='userMarket';
    // adjectives ------------------------------------------
    RANDOM='random';
    NEW='new';
    // prepositions -----------------------------------------
    BY='by';
    FOR='for';
    FROM='from';
    OF='of';
    TO='to';
    // conjunctions --------------------------------------------
    AND='and';
    OR='or';
// adverbs ------------------------------------------------
  WHERE='where';
  // non-language
  COMMENT='#';
// misc
}
@header {
package com.cboe.onyx;
import com.cboe.onyx.verb.*;
}

@lexer::header{ 
package com.cboe.onyx;
}

@members {
//private List<Integer[]> sentences;
}

command
  : NEWLINE!* (sentence|comment!)? (NEWLINE!+ (sentence|comment!))* NEWLINE!* EOF! 
  {
    System.out.println($command.text);
  }
  ;
  
comment
  : COMMENT (~NEWLINE)*
  {
    System.out.println("UNPARSED COMMENT: "+$comment.text +": DONE");
  }
  ;

sentence 
: WS!? verb^ (WS! directObjectPhrase)? ((WS! prepositionalPhrase)|(WS! whereClause))* WS!? 
{
System.out.println($sentence.text);
}
;

directObjectPhrase 
: nounPhrase
;

prepositionalPhrase
: preposition^ WS! nounPhrase
;

nounPhrase
:  nounAdjectivesPhrase (WS! conjunction! WS! nounAdjectivesPhrase)* 
;

nounAdjectivesPhrase
: (adjective WS!)* noun^
;

whereClause
  : WHERE^ WS! keyVal (WS! keyVal)*
  ;

keyVal returns [String key, String val]
: a=noun^ WS!? '='! WS!? b=(QVALUE|noun) {$key = $a.text; $val = $b.text;}
;

verb
  : ACCEPT  
  | CANCEL
  | CONNECT
  | CREATE
  | GET
  | LOGIN
  | LOGOUT
  | REPLACE
  | SELECT
  | SEND
  | SUBSCRIBE
  | WAIT
  ;

noun
  : BOOK
| BUY
| CAS
| CURRENT_MARKET
| DURATION
| FILENAME
| FIRM
| HOSTNAME
| KEY
| MARKET_DATA
| MESSAGE
| NAME
| NBBO
| OPTION
| ORDER
| ORDER_HISTORY
| PASSWORD
| PREFERENCES
| PRICE
| PRODUCT
| PRODUCTS
| PRODUCT_CLASS
| PRODUCT_CLASSES
| PRODUCT_TYPE
| PRODUCT_TYPES
| QUANTITY
| QUOTE
| RECAP
| RFQ
| ROLE
| SELL
| SEQUENCE_NUMBER
| SESSION
| SESSIONS
| SIDE
| STRATEGY
| SYMBOL
| TICKER
| TIME
| TRADER_PRODUCT_HISTORY
| USERNAME
| USER_MARKET
;

conjunction
: AND
| OR
;

preposition
: BY
| FOR
| FROM
| OF
| TO
;

adjective
: RANDOM
| NEW
;

//INT
//: '0'..'9'+
//;

//STRING2
//: ('a'..'z'|'A'..'Z'|'_'|'0'..'9')+
//;

FILE 
: ('a'..'z'|'A'..'Z'|'0'..'9'|'.'|'_')+ 
;

NEWLINE 
: ('\r'? '\n')
;

WS 
: (' '|'\t')+
;

// IDENTIFIER : ( 'a'..'z'| ... ) { $type = CheckKeywordsTable(getText()) };

//@lexer::members 
//{
//    private int CheckKeywordsTable(string lexeme)
//    {
//        // Your custom logic goes here
//        // In most cases, this would be a map/dictionary lookup
//        return lexeme;
//    }
//}

QVALUE: // Quoted value 
  ( '"' (~'"')* '"'
    | '\'' (~'\'')* '\''
  )
  ;
