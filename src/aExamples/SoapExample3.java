/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aExamples;

import javax.xml.soap.*;


/**
 *
 * code copied from : http://stackoverflow.com/questions/15948927/working-soap-client-example
 * @author my301
 */
public class SoapExample3 {
     public static void main(String args[]) throws Exception {
        // Create SOAP Connection
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();

        // Send SOAP Message to SOAP Server
        String url = "http://www.webservicex.net/geoipservice.asmx?WSDL";
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

        String serverURI = "http://www.webservicex.net/";


        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("example", serverURI);

       String [] e = {"IPAddress"};
        
       String [] v = {"131.228.17.26" };
       
       SOAPBody soapBody = envelope.getBody();
       SOAPElement soapBodyElem = soapBody.addChildElement("GetGeoIP", "example");
       

        for (int i = 0; i < v.length; i++) {
           
            SOAPElement soapBodyElem1 = soapBodyElem.addChildElement(e[i], "example");
            soapBodyElem1.addTextNode(v[i]);
        }

           
        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", serverURI  + "GetGeoIP");


        soapMessage.saveChanges();

        /* Print the request message */
        System.out.print("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println();

        return soapMessage;
    }
}
