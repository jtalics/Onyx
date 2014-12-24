package com.cboe.onyx.verb;

import java.util.Properties;

import org.antlr.runtime.tree.Tree;

import com.cboe.exceptions.AuthorizationException;
import com.cboe.exceptions.DataValidationException;
import com.cboe.idl.cmi.VersionOperations;
import com.cboe.idl.cmiConstants.LoginSessionModesOperations;
import com.cboe.idl.cmiConstants.LoginSessionTypesOperations;
import com.cboe.idl.cmiUser.UserLogonStruct;
import com.cboe.interfaces.presentation.api.MarketMakerAPI;
import com.cboe.onyx.OnyxParser;
import com.cboe.onyx.OnyxCASCallback;
import com.cboe.presentation.api.UserAccessFactory;
import com.cboe.onyx.validator.Validator;

public class Login extends Verb
{
    private MarketMakerAPI mmAPI;
    private OnyxCASCallback casCallback;
    private String firmKey;
    private String username;
    private String password;
    protected static Login self;
    public synchronized static Login getInstance() {
        if (self == null) {
            self = new Login();
        }
        return self;
    }
    
    public void login()
    {
        initUserSession();
    }


    public void parse(Tree node, String[] tokenNames)
    {
        Validator.childCountEquals1(node);
        for (int i = 0; i < node.getChildCount(); i++)
        {
            Tree child = node.getChild(i);
            Validator.childCountGreaterThan0(child);
            if (child.getType() != OnyxParser.WHERE)
            {
                throw new IllegalArgumentException("not a valid qualifier type for " + tokenNames[OnyxParser.LOGIN] + ": " + child.getText());
            }
            for (int j = 0; j < child.getChildCount(); j++)
            {
                Tree gchild = child.getChild(j);
                Validator.childCountGreaterThan0(gchild);
                int type = gchild.getType();
                if (type == OnyxParser.USERNAME)
                {
                    Tree ggchild = gchild.getChild(0);
                    Validator.childCountEquals0(ggchild);
                    if (ggchild.getType() != OnyxParser.WHERE)
                    {
                        throw new IllegalArgumentException("not a valid qualifier type (" + tokenNames[ggchild.getType()] + ") for " + tokenNames[OnyxParser.USERNAME] + ": " + ggchild.getText());
                    }
                    username = ggchild.getText();
                }
                else if (type == OnyxParser.PASSWORD)
                {
                    Tree ggchild = gchild.getChild(0);
                    Validator.childCountEquals0(ggchild);
                    if (ggchild.getType() != OnyxParser.WHERE)
                    {
                        throw new IllegalArgumentException("not a valid qualifier type (" + tokenNames[ggchild.getType()] + ") for " + tokenNames[OnyxParser.PASSWORD] + ": " + ggchild.getText());
                    }
                    password = ggchild.getText();
                }
                else
                {
                    throw new IllegalArgumentException("not a valid qualifier type for " + tokenNames[OnyxParser.WHERE] + ": " + gchild.getText());
                }
            }
        }
    }

    private void initUserSession()
    {
        try
        {
            firmKey = getSystemProperty("FIRMKEY");
            UserLogonStruct logonStruct = new UserLogonStruct(username, password, VersionOperations.CMI_VERSION, LoginSessionModesOperations.NETWORK_TEST);
            // casCallback = new TestCASCallback();
            System.out.println("Attempting to logon to CAS");
            mmAPI = UserAccessFactory.marketMakerLogon(logonStruct, LoginSessionTypesOperations.PRIMARY, casCallback);
            System.out.println("-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-");
            System.out.println("User Information");
            System.out.println("-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-");
            System.out.println("-= Fullname = " + mmAPI.getValidUser().getFullName());
            System.out.println("-= Firm = " + mmAPI.getValidUser().getFirm());
            System.out.println("-= Role = " + mmAPI.getValidUser().getRole().getName());
            System.out.println("-= Userid = " + mmAPI.getValidUser().getUserId());
            System.out.println("-= Username = " + mmAPI.getValidUser().getFullName());
            System.out.println("-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-");
        }
        catch (DataValidationException e)
        {
            System.err.println(e.getMessage());
            System.err.println("Exception Accepting Strategy : " + e.details.message + " " + e.details.error);
            e.printStackTrace();
            System.err.println("\n\nHINT: ANOTHER ONE RUNNING?");
            System.exit(1);
        }
        catch (AuthorizationException e)
        {
            System.err.println(e.getMessage());
            System.err.println("Exception Accepting Strategyr : " + e.details.message + " " + e.details.error);
            e.printStackTrace();
            System.exit(1);
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static String getSystemProperty(String propertyName)
    {
        Properties props = System.getProperties();
        String theProperty = props.getProperty(propertyName);
        return theProperty;
    }

    public MarketMakerAPI getMmAPI()
    {
        return mmAPI;
    }

    public OnyxCASCallback getCasCallback()
    {
        return casCallback;
    }

    public void setCasCallback(OnyxCASCallback casCallback)
    {
        this.casCallback = casCallback;
    }

    public String getFirmKey()
    {
        return firmKey;
    }

    public void setFirmKey(String firmKey)
    {
        this.firmKey = firmKey;
    }

    public String getUserName()
    {
        return username;
    }

    public void setUserName(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
