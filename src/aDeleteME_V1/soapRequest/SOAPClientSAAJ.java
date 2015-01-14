/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aDeleteME_V1.soapRequest;

import javax.xml.soap.*;


/**
 *
 * 
 * @author my301
 */
public class SOAPClientSAAJ {
     public static void main(String args[]) throws Exception {
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

    private static SOAPMessage createSOAPRequest() throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String serverURI = "http://ws.cdyne.com/";

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("example", serverURI);

        
       String [] e = {"email","LicenseKey"};
        
       String [] v = {"mutantninja@gmail.com","123" };
       
       SOAPBody soapBody = envelope.getBody();
       SOAPElement soapBodyElem = soapBody.addChildElement("VerifyEmail", "example");
       
       // my code
        for (int i = 0; i < v.length; i++) {
           
            SOAPElement soapBodyElem1 = soapBodyElem.addChildElement(e[i], "example");
            soapBodyElem1.addTextNode(v[i]);
            
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
