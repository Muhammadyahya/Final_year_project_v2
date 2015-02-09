/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aDeleteME;

/**
 *
 * @author my301
 */
import groovy.xml.MarkupBuilder;
import java.io.StringWriter;
import java.util.HashMap;
 
import com.predic8.wsdl.*;
import com.predic8.wstool.creator.*;
 
public class CreateSOAPRequest {
            
            /******************    doesn't work.... don;t waste time on this    ********************************/
 
  public static void main(String[] args) {
 
    WSDLParser parser = new WSDLParser();
     
    Definitions wsdl = parser.parse("http://www.webservicex.net/BibleWebservice.asmx?WSDL");
     
    StringWriter writer = new StringWriter();
     
    HashMap<String, String> formParams = new HashMap<String, String>();
    formParams.put("xpath:http://www.webserviceX.NET/GetBookTitles", "");

     
    //SOARequestCreator constructor: SOARequestCreator(Definitions, Creator, MarkupBuilder)
    SOARequestCreator creator = new SOARequestCreator(wsdl, new RequestCreator(), new MarkupBuilder(writer));
    creator.setFormParams(formParams);
     
    //creator.createRequest(PortType name, Operation name, Binding name);
    Object ob = creator.createRequest("BibleWebserviceSoap", "GetBookTitles", "BibleWebserviceSoap");

      System.out.println("----------------");
      System.out.println(ob);
      System.out.println("----------------------");
    System.out.println(writer);
  }
  
  
  
}