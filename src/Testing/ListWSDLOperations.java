/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author my301
 */
import com.predic8.wsdl.*;
 
public class ListWSDLOperations {
 
  public static void main(String[] args) {
    WSDLParser parser = new WSDLParser();
 
    Definitions defs = parser
        .parse("http://www.webservicex.net/ConvertComputer.asmx?WSDL");
 
    for (PortType pt : defs.getPortTypes()) {
      System.out.println(pt.getName());
      for (Operation op : pt.getOperations()) {
        System.out.println(" -" + op.getName());
      }
    }
  }
}