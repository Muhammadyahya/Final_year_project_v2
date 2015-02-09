/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aExamples;

import java.io.ByteArrayOutputStream;
import javax.xml.soap.*;


/**
 *
 * code copied from : http://stackoverflow.com/questions/15948927/working-soap-client-example
 * @author my301
 */
public class SoapExample2 {
     public static void main(String args[]) throws Exception {
        // Create SOAP Connection
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();

        // Send SOAP Message to SOAP Server
        String url = "http://www.webservicex.net/BibleWebservice.asmx?WSDL";
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

        String serverURI = "http://www.webserviceX.NET";


        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("example", serverURI);

        
        /* not working code */
       String [] e = {};
        
       String [] v = {};
       
       SOAPBody soapBody = envelope.getBody();
       SOAPElement soapBodyElem = soapBody.addChildElement("GetBookTitles", "example");
       
       // my code
        for (int i = 0; i < v.length; i++) {
           
            SOAPElement soapBodyElem1 = soapBodyElem.addChildElement(e[i], "example");
            soapBodyElem1.addTextNode(v[i]);
            
        }

        // end of my code
           
        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", serverURI  + "/GetBookTitles");
        /* end of not working code*/

        soapMessage.saveChanges();

        /* Print the request message */
        
        
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        soapMessage.writeTo(os);
        String aString = new String(os.toByteArray(),"UTF-8");
        
        String z;

        String s = "llllllllllllll     "+aString;
        
        //System.out.println("ssss"+ s);
        
        System.out.println("");
        System.out.println("");
        
        System.out.print("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println();

        return soapMessage;
    }
}
