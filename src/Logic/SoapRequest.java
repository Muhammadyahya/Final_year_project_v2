/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.User.StoreGeneratedValue;
import java.util.ArrayList;
import javax.xml.soap.*;


/**
 *
 * code copied from : http://stackoverflow.com/questions/15948927/working-soap-client-example
 * @author my301
 */
public class SoapRequest {
    
    private StoreGeneratedValue storeGeneratedValueObj;
    
    public SoapRequest(StoreGeneratedValue obj)
    {
        this.storeGeneratedValueObj = obj;
    }
     
    public void soapConnectionRequest() throws Exception {
        // Create SOAP Connection
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();

        // Send SOAP Message to SOAP Server
        String url = "http://ws.cdyne.com/emailverify/Emailvernotestemail.asmx?WSDL";
        SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(), url);
        // print SOAP Response
        System.out.print("Response SOAP Message:");
        soapResponse.writeTo(System.out);

        soapConnection.close();
    }

    private  SOAPMessage createSOAPRequest() throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String serverURI = "http://ws.cdyne.com/";

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("example", serverURI);

        
        ArrayList<String> e = storeGeneratedValueObj.getParameterNameList();
        ArrayList<String> v = storeGeneratedValueObj.getGeneratedValueList();
       
       SOAPBody soapBody = envelope.getBody();
       SOAPElement soapBodyElem = soapBody.addChildElement("VerifyEmail", "example");
       
       // my code
        for (int i = 0; i < v.size(); i++) {
           
            SOAPElement soapBodyElem1 = soapBodyElem.addChildElement(e.get(i), "example");
            soapBodyElem1.addTextNode(v.get(i));
        }

        // end of my code
           
        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", serverURI  + "VerifyEmail");

        soapMessage.saveChanges();

        /* Print the request message */
        System.out.print("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println();

        return soapMessage;
    }
}
