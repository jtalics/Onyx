package com.cboe.onyx;

//
//import com.cboe.consumers.internalPresentation.UserSessionAdminConsumerFactory;
//import com.cboe.domain.property.PropertyServiceFacadeHome;
//import com.cboe.idl.cmi.Version;
//import com.cboe.idl.cmiAdmin.HeartBeatStruct;
//import com.cboe.idl.cmiAdmin.MessageStruct;
//import com.cboe.idl.cmiCallback.CMIUserSessionAdmin;
//import com.cboe.idl.cmiUser.UserLogonStruct;
//import com.cboe.idl.constants.TextMessageConstants;
//import com.cboe.idl.constants.TextMessageStates;
//import com.cboe.idl.internalApplication.SystemAdminSessionManager;
//import com.cboe.infrastructureServices.foundationFramework.HomeFactory;
//import com.cboe.infrastructureServices.foundationFramework.exceptionHandling.CBOELoggableException;
//import com.cboe.interfaces.internalApplication.SystemAdminUserAccess;
//import com.cboe.interfaces.internalApplication.SystemAdminUserAccessHome;
//import com.cboe.internalPresentation.api.SystemAdminAPIFactory;
//import com.cboe.internalPresentation.common.logging.GUILoggerSABusinessProperty;
//import com.cboe.internalPresentation.propertyService.PropertyServiceFacadeImpl;
//import com.cboe.domain.routingProperty.RoutingPropertyFactoryHome;
//import com.cboe.domain.routingProperty.RoutingPropertyFactoryImpl;
//import com.cboe.domain.util.CallbackDeregistrationInfoStruct;
//import com.cboe.presentation.common.exceptionHandling.DefaultExceptionHandlerHome;
//import com.cboe.presentation.textMessage.DestinationModel;
//import com.cboe.presentation.textMessage.MessageModel;
//import com.cboe.presentation.textMessage.MessageProcessorHome;
//import com.cboe.presentation.threading.SwingEventThreadWorker;
//import com.cboe.presentation.userSession.UserSession;
//import com.cboe.presentation.userSession.UserSessionLoginInfo;
//import com.cboe.presentation.windowManagement.SBTFrame;
//import com.cboe.presentation.windowManagement.WindowManagerFactory;
import com.cboe.presentation.api.APIFactoryImpl;
import com.cboe.presentation.api.APIHome;
import com.cboe.presentation.common.logging.GUILoggerHome;
import com.cboe.presentation.common.properties.AppPropertiesFileFactory;
import com.cboe.presentation.product.ProductClassFactory;
import com.cboe.presentation.product.ProductClassFactoryHome;
import com.cboe.presentation.product.ProductFactory;
import com.cboe.presentation.product.ProductFactoryHome;
import com.cboe.presentation.product.ReportingClassFactory;
import com.cboe.presentation.product.ReportingClassFactoryHome;
import com.cboe.util.ChannelKey;
import com.cboe.util.ChannelType;
import com.cboe.util.channel.ChannelEvent;
import com.cboe.util.event.EventChannelAdapterFactory;
import com.cboe.util.event.EventChannelListener;

/**
 * Responsible for building homes for home patterns for the client presentation.
 */
public class MockHomeBuilder
{
    static EventChannelListener channelListener = new EventChannelListener()
    {
        private boolean lockEventHandler = true;

        public void channelUpdate(ChannelEvent event)
        {
            int channelType = ((ChannelKey)event.getChannel()).channelType;
            Object eventData = event.getEventData();
            if(channelType == ChannelType.CB_LOGOUT)
            {
            }
            else if(channelType == ChannelType.CB_HEARTBEAT)
            {
            }
            else if(channelType == ChannelType.CB_UNREGISTER_LISTENER)
            {
            }
            else if(channelType == ChannelType.CB_TEXT_MESSAGE)
            {
            }
        }
    };

    public static char getLoginOperationMode()
    {
        char loginOperationMode = '0';

        if( AppPropertiesFileFactory.isAppPropertiesAvailable() )
        {
            String modeName = AppPropertiesFileFactory.find().getValue("Session","LoginOperationMode");

            if( modeName != null && modeName.length() > 0 )
            {
                loginOperationMode = modeName.charAt(0);
            }
            else
            {
                throw new IllegalArgumentException("Login Operation Mode missing.");
            }
        }

        return loginOperationMode;
    }

//    private static void startSA() throws Exception
//    {
//        // following lifted from see com.cboe.internalPresentation.api.SystemAdminUserAccessFactory.logon(UserLogonStruct, EventChannelListener)
//        // SystemAdminUserAccess.registerClientListener(channelListener);
//        PropertyServiceFacadeHome.create(PropertyServiceFacadeImpl.class, true);
//        CMIUserSessionAdmin  userSessionAdminConsumer = UserSessionAdminConsumerFactory.create(EventChannelAdapterFactory.find());
//        SystemAdminUserAccessHome home = (SystemAdminUserAccessHome)HomeFactory.getInstance().findHome(SystemAdminUserAccessHome.HOME_NAME);
//        SystemAdminUserAccess userAccess = home.find();
//        UserLogonStruct logonStruct = new UserSessionLoginInfo("HD13", "HD13", Version.CMI_VERSION, getLoginOperationMode(),UserSession.LOGIN_SESSION_TYPE_SECONDARY).toUserLogonStruct();
//        SystemAdminSessionManager  userSessionMgr = userAccess.logon(logonStruct, userSessionAdminConsumer);
//        SystemAdminAPIFactory.create(userSessionMgr, userSessionAdminConsumer, null/*clientListener*/);
//        RoutingPropertyFactoryHome.create(RoutingPropertyFactoryImpl.class, null);
//    }

    /**
     * Initializes the homes for factories.
     * @throws Exception 
     */
    public static void initialize() throws Exception
    {
        
        // DefaultExceptionHandlerHome.create(DefaultExceptionHandlerImpl.class);
        // AppPropertiesFileFactory.create(AppPropertiesFileImpl.class);
        GUILoggerHome.create(MockGUILoggerImpl.class);
        //startSA();
        APIHome.create(APIFactoryImpl.class);
        ReportingClassFactoryHome.create(ReportingClassFactory.class);
        ProductFactoryHome.create(ProductFactory.class);
        ProductClassFactoryHome.create(ProductClassFactory.class);
        // EnvironmentManagerFactory.create(CommonEnvironmentManagerImpl.class);
        // UserSessionFactory.create(UserSessionImpl.class);
        // WindowManagerFactory.create(WindowManagerImpl.class);
        // MessageProcessorHome.create(MessageProcessorFactoryImpl.class);
        // OrderBookAPIHome.create(OrderBookAPIFactoryImpl.class);
        // GUIUserTradingParametersAPIHome.create(GUIUserTradingParametersAPIFactory.class);
        // CBOEReportGeneratorFactory.initialize();
        // AudibleAlertGeneratorFactory.initialize();
        // StatusListModelFactory.initialize();
        // TranslatorInitializer.initialize();
    }

}
