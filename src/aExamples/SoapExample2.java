/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aExamples;

import Logic.Common.CommonMethodsOne;
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
        String url = "http://www.webservicex.net/ConvertAngle.asmx?WSDL";
        SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(), url);
        // print SOAP Response
        System.out.print("Response SOAP Message:");
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        soapResponse.writeTo(os);
        String aString = new String(os.toByteArray(),"UTF-8");

         System.out.println(CommonMethodsOne.format(aString));

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
       String [] e = {"AngleValue","fromAngleUnit","toAngleUnit" };
        
       String [] v = {"9.1","fullCircle","gradients"};
       
       SOAPBody soapBody = envelope.getBody();
       SOAPElement soapBodyElem = soapBody.addChildElement("ChangeAngleUnit", "example");
       
       // my code
        for (int i = 0; i < v.length; i++) {
            System.out.println("111");
            SOAPElement soapBodyElem1 = soapBodyElem.addChildElement(e[i], "example");
            soapBodyElem1.addTextNode(v[i]);
            
        }

        // end of my code
           
        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", serverURI  + "/ChangeAngleUnitHttpPostIn");
        /* end of not working code*/

        soapMessage.saveChanges();

        /* Print the request message */
        
        
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        soapMessage.writeTo(os);
        String aString = new String(os.toByteArray(),"UTF-8");

        System.out.print("Request SOAP Message:");
        System.out.println(CommonMethodsOne.format(aString));
              
        System.out.println();
        System.out.println();
        System.out.println();

        return soapMessage;
    }
}
