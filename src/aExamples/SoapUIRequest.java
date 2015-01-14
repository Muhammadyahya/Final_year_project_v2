/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aExamples;

import com.eviware.soapui.SoapUI;
import com.eviware.soapui.StandaloneSoapUICore;
import com.eviware.soapui.impl.wsdl.*;
import com.eviware.soapui.model.iface.Response;


/**
 *
 * @author my301
 */
public class SoapUIRequest {
    
    public static void main(String args[]) throws Exception
            
    {
        SoapUIRequest s = new SoapUIRequest();
        s.runSoap();
    }
    
    public void runSoap() throws Exception
            
    {
        
        String projectFile = "http://ws.cdyne.com/emailverify/Emailvernotestemail.asmx?WSDL";
        
        SoapUI.setSoapUICore(new StandaloneSoapUICore(true));
        
        WsdlProject project = new WsdlProject(projectFile);
        
        int c = project.getInterfaceCount();
        
        System.out.println("The interface count   ="+c);
        
        for(int i=0;i<c;i++)
            
        {
            
            WsdlInterface wsdl = (WsdlInterface) project.getInterfaceAt(i);
            
            String soapVersion = wsdl.getSoapVersion().toString();
            
            System.out.println("The SOAP version ="+soapVersion);
            
            System.out.println("The binding name = "+wsdl.getBindingName());
            
            int opc = wsdl.getOperationCount();
            
            System.out.println("Operation count ="+opc);
            
            String result="";
            
            for(int j=0;j<opc;j++)
                
            {
                
                WsdlOperation op = wsdl.getOperationAt(j);
                
                String opName = op.getName();
                
                System.out.println("OPERATION:"+opName);
                
                WsdlRequest req = op.getRequestByName("Req_"+soapVersion+"_"+opName);
                
                System.out.println("REQUEST :"+req.getName());
                
                System.out.println("The request content is ="+req.getRequestContent());
                
                System.out.println("The action is ="+req.getAction());
                
                req.setEndpoint("your_end_Point");
                
                //Assigning u/p to an operation: Generate
                
                if(opName.equals("Generate"))
                    
                {
                    
                    // req.setAuthType("Preemptive"); //Setting the Authorization type
                    
                    //   req.setUsername("u1″);
                    
                    //  req.setPassword("u1″);
                    
                }
                
                WsdlSubmitContext wsdlSubmitContext = new WsdlSubmitContext(req);
                
                WsdlSubmit<?> submit = (WsdlSubmit<?>) req.submit(wsdlSubmitContext, false);
                
                Response response = submit.getResponse();
                
                result = response.getContentAsString();
                
                System.out.println("The result ="+result);
                
            }
            
        }
        
    }
}

