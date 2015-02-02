/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.CheckResult;

import Data.User.StoreReportData;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.StringReader;
import org.xml.sax.InputSource;

/**
 *
 * @author my301
 */
public class ResultChecker {
    
    private StoreReportData storeReportDataObj;
    private int position;
    
    public ResultChecker(StoreReportData storeReportDataObj, int position){
        
        this.storeReportDataObj= storeReportDataObj;
        this.position = position;
    }
    
    public ResultChecker(){
        
    }
    
    
    public String checkResponse()
    {
        
        String result = "Failed";
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(storeReportDataObj.getOutPutResponse().get(position)));
            Document doc = dBuilder.parse(is);
            doc.getDocumentElement().normalize();
            String responce = doc.getElementsByTagName(storeReportDataObj.getCollectTestData().getTagName()).item(0).getTextContent();
            
            if(responce.equals(storeReportDataObj.getCollectTestData().getTagValue()))
            {
                result= "Passed";
            }
            
        } catch (Exception e) {
            result = "No such tag found.";
        }
        
        return result;
        
    }
    
    
    
    /* for testing porpose */
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
        
        
        ResultChecker obj = new ResultChecker();
        obj.testmethod(output);
    }
    
    
}
