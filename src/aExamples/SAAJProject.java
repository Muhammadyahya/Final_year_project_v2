/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aExamples;

/**
 *
 * @author my301
 */
 
import java.io.IOException;
 
import javax.xml.namespace.QName;
import javax.xml.soap.*;
public class SAAJProject {
    public static void main(String[] args){
        try {
            SOAPConnectionFactory sFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection conn = sFactory.createConnection();
            MessageFactory mFactory = MessageFactory.newInstance();
            SOAPMessage request= mFactory.createMessage();
            SOAPPart part = request.getSOAPPart();
            SOAPHeader header = request.getSOAPHeader();
            header.detachNode();
            SOAPBody body = part.getEnvelope().getBody();
            QName qBody = new QName("http://ws.cdyne.com/","add","ns");
            SOAPBodyElement bodyElement = body.addBodyElement(qBody);
            QName parm1 = new QName("http://ws.cdyne.com/","parm1","ns");
            QName parm2 = new QName("http://ws.cdyne.com/","parm2","ns");
            SOAPElement parm1Element = bodyElement.addChildElement(parm1);
            SOAPElement parm2Element = bodyElement.addChildElement(parm2);
            parm1Element.addTextNode("5");
            parm2Element.addTextNode("4");
            request.writeTo(System.out);
            System.out.println("\n");
            SOAPMessage response = conn.call(request,"http://www.webservicex.net/geoipservice.asmx?WSDL");
            response.writeTo(System.out);
            conn.close();
        } catch (UnsupportedOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SOAPException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
    }
}
