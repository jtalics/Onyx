package com.cboe.onyx.verb;

import com.cboe.application.shared.RemoteConnection;
import com.cboe.application.shared.RemoteConnectionFactory;

public class Connect extends Verb
{
    private String hostName;
    private RemoteConnection connection;
    private String toTarget;
    protected static Connect self;

    public synchronized static Connect getInstance()
    {
        if (self == null)
        {
            self = new Connect();
        }
        return self;
    }

    public String getHostName()
    {
        return hostName;
    }


    public void connectToCAS()
    {
        System.out.println("EXECUTING CONNECT");
        System.setProperty("IOR_PATH", "http://" + hostName + ":8003"); // default is 8003
        System.setProperty("ORB.IIOPTransport.PortNum", "9101"); // default is 8101
        System.setProperty("ORB.BindingSequence", "Local:Event:Iiop");
        System.setProperty("ORB.FlowControl", "none");
        System.setProperty("ORB.IIOPTransport.Listener.NumThreads", "12");
        // System.setProperty("LoginOperationMode","2");
        // System.setProperty("EventService.SmartSockets.OptionsFileXXX","./cboe.ssconfig.cm");
        // EnvironmentProperties ep=EnvironmentManagerFactory.find().getEnvironment("ATGTEST4");
        // EnvironmentManagerFactory.find().setCurrentEnvironment(ep);
        connection = RemoteConnectionFactory.create(null);
        if (connection != null)
        {
            System.out.println("Connection established " + connection);
        }
        else
        {
            throw new RuntimeException("could not connect to " + hostName);
        }
    }

    public RemoteConnection getConnection()
    {
        return connection;
    }

    public void setHostName(String hostName)
    {
        this.hostName = hostName;
    }
}
