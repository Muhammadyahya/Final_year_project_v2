/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.CheckResult;

import Data.User.StoreReportData;
import GrahpicalUserInterface.Report.*;
import Logic.Common.CommonMethodsOne;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.xml.sax.InputSource;

/**
 *
 * @author my301
 */
public class ResultChecker {
    
                
    public String checkResponse(StoreReportData storeReportDataObj, int position)
    {
        String result="Passed";
        int count =0;
        
        ArrayList<String> resultList = storeReportDataObj.getStoreCheckValueDataList().get(position).getResultList();
        for (int i = 0; i < resultList.size(); i++) {
            if(resultList.get(i).equals("Failed"))
            {
                count++;
                result = "Failed/Passed";
            }            
        }
        if(count == resultList.size())
        {
            result = "Failed";
        }
       return result;
    }
    
    
    
    
    
    
    
    
    
    
    
    /* for testing porpose */
    public String checkTag(String parm, String parm2){
         String result = "Failed";
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(parm));
            Document doc = dBuilder.parse(is);
            
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName(parm);
            System.out.println(""+doc.getElementsByTagName(parm2).item(0).getTextContent());
            
        } catch (Exception e) {
            result = "No such tag found. <"+parm2+">";
            System.out.println("2222  "+parm2);
            parm2 = JOptionPane.showInputDialog(result+"\n"+"\n"+ CommonMethodsOne.format(parm)+"\n"+"\n"+"Please enter a new Tag.");  
            checkTag(parm,parm2);
        }  
        return result;
    }
    
    
    /**** testing purpose only */
    
    public String testmethod(String a)
    {
        String result = "Failed";
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(a));
            Document doc = dBuilder.parse(is);
            
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("GoodEmail");
            System.out.println(""+doc.getElementsByTagName("VerifyEmailResponse").item(0).getTextContent());
            
        } catch (Exception e) {
            System.out.println("dfdadsf");
        }
        
        
        return result;
    }
    
    
    public static void main(String [] args)
    {
        String input = "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:example=\"http://ws.cdyne.com/\">\n" +
                "   <SOAP-ENV:Header/>\n" +
                "   <SOAP-ENV:Body>\n" +
                "      <example:VerifyEmail>\n" +
                "         <example:email>mtqm</example:email>\n" +
                "         <example:LicenseKey>zeh</example:LicenseKey>\n" +
                "      </example:VerifyEmail>\n" +
                "   </SOAP-ENV:Body>\n" +
                "</SOAP-ENV:Envelope>";
        
        String output ="<?xml version=\"1.0\" encoding=\"UTF-16\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "   <soap:Body>\n" +
                "      <VerifyEmailResponse>\n" +
                "         <VerifyEmailResult>\n" +
                "            <ResponseText>Invalid Email Address</ResponseText>\n" +
                "            <ResponseCode>0</ResponseCode>\n" +
                "            <LastMailServer/>\n" +
                "            <GoodEmail>false</GoodEmail>\n" +
                "         </VerifyEmailResult>\n" +
                "      </VerifyEmailResponse>\n" +
                "   </soap:Body>\n" +
                "</soap:Envelope>";
        
   
    }
    
    
}
