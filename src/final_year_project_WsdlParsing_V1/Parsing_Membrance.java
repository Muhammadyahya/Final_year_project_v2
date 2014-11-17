/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_year_project_WsdlParsing_V1;

import com.predic8.schema.ComplexType;
import com.predic8.schema.Element;
import com.predic8.soamodel.Consts;
import com.predic8.wsdl.*;
import javax.wsdl.WSDLException;

/**
 *
 * @author my301
 */
public class Parsing_Membrance {
    
    
    public static void main(String[] args) {
        
        //http://www.webservicex.net/geoipservice.asmx?WSDL
        // http://www.webservicex.net/sendsmsworld.asmx?WSDL
        test2();
        out("************************ THE END ****************************");
    }
    
    public static void test1 ()throws WSDLException{
        
        WSDLParser parser = new WSDLParser();
        
        Definitions defs = parser
                .parse("http://www.webservicex.net/sendsmsworld.asmx?WSDL");
        
        for (PortType pt : defs.getPortTypes()) {
            out("pt.getname   : "+pt.getName());
            for (com.predic8.wsdl.Operation op : pt.getOperations()) {
                System.out.println("op.getName -" + op.getName());
                Element request = op.getInput().getMessage().getParts().get(0).getElement();
                
                
                out("request:  "+request);
            }
        }
        
        
        
    }
    
    public static void test2 (){
        String portSOAP;
        
        WSDLParser parser = new WSDLParser();
        
        Definitions defs = parser.parse("http://www.webservicex.net/sendsmsworld.asmx?WSDL");
        
        for (PortType pt : defs.getPortTypes()) {
            
            portSOAP = pt.getName();
            
            if (portSOAP.endsWith("Soap")) {
                
                System.out.println(pt.getName());
                
                for (Operation op : pt.getOperations()) {
                    
                    System.out.println("--" + op.getName());
                    
                    System.out.println("Request Parameters");
                    
                    Element x =   op.getInput().getMessage().getParts().get(0).getElement();
                    
                    listParameters(defs.getElement(op.getInput().getMessage().getParts().get(0).getElement().getQname()));
                    /* we don't need next two lines yet */
                    //System.out.println("Response Parameters");
                    
                   // listParameters(defs.getElement(op.getOutput().getMessage().getParts().get(0).getElement().getQname()));
                    
                    System.out.println("======= Next operation============");
                    
                }
                
            }
            
        }
        
    }
    
    private static void listParameters(Element element) {
        
        //        ComplexType ct = (ComplexType) element.getEmbeddedType();
        //
        //        for (Element e : ct.getSequence().getElements()) {
        //
        //            System.out.println(e.getName() + " " + e.getType());
        //
        //        }
        
        
        
        ComplexType ct = (ComplexType) element.getEmbeddedType();
        if (ct == null){
            
            ct = element.getSchema().getComplexType(element.getType().getLocalPart());
        }
        if(ct.getModel()!=null){
            
            for (Element e : ct.getSequence().getElements()) {
                
                // Fix for invalid schema
                
                if (e.getType() == null) {
                    
                    System.out.println("Element: " + element.getName());
                    
                    return;
                    
                }
                
                if (e.getType().getNamespaceURI() == Consts.SCHEMA_NS) {
                    
                    System.out.println(e.getName() + " " + e.getType());
                    
                } else {
                    
                    listParameters(e);
                    
                }
                
            }
        }
        
    }
    
    
    
    
    private static void out(String str) {
        System.out.println(str);
    }
    
}
