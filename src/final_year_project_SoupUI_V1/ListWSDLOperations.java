/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_year_project_SoupUI_V1;

/**
 *
 * @author my301
 */
//package sample.wsdl;


import com.eviware.soapui.config.ServiceConfig.Type;
import com.predic8.schema.ComplexType;
import com.predic8.schema.Element;
import com.predic8.schema.Schema;
import com.predic8.soamodel.Consts;
import com.predic8.wsdl.*;
import java.util.List;
import javax.xml.namespace.QName;

public class ListWSDLOperations {
    
    public static void main(String[] args) {
        
        String portSOAP;
        WSDLParser parser = new WSDLParser();
        
        Definitions defs = parser
                .parse("http://www.webservicex.net/geoipservice.asmx?WSDL");
        
        
        
        for (PortType pt : defs.getPortTypes()) {
            System.out.println("pt -"+pt.getName());
            for (Operation op : pt.getOperations()) {
                
                //System.out.println("  Message -" + defs.getMessage(op.getName()));
                System.out.println("            op -" + op.getName());
                
                out("Messages: ");
                for (Message msg : defs.getMessages()) {
                    out("  Message Name: " + msg.getName());
                    out("  Message Parts: ");
                    for (Part part : msg.getParts()) {
                        out("    Part Name: " + part.getName());
                        out("    Part Element: " + ((part.getElement() != null) ? part.getElement() : "not available!"));
                        for (Types ty : defs.getTypes()) {
                            
                            out("xxxxxxxxxxxxxxxxxxxxxxx"+ ty.getName());
                        }
                        out("    Part Type: " + ((part.getType() != null) ? part.getType() : "not available!" ));
                        out("");
                    }
                }
                out("");
                
                System.out.println("                    -" + op.getElementName());
                
            }
        }
        
        
        out("(**************** new code  ********************");
        
        /*
         * out("-------------- WSDL Details --------------");
         * out("TargenNamespace: \t" + defs.getTargetNamespace());
         * // out("Style: \t\t\t" + defs.getStyle());
         * if (defs.getDocumentation() != null) {
         * out("Documentation: \t\t" + defs.getDocumentation());
         * }
         * out("\n");
         *
         * /* For detailed schema information see the FullSchemaParser.java sample.*/
        /*  out("Schemas: ");
         * for (Schema schema : defs.getSchemas()) {
         * out("  TargetNamespace: \t" + schema.getTargetNamespace());
         * }
         * out("\n");
         * 
         * out("Messages: ");
         * for (Message msg : defs.getMessages()) {
         * out("  Message Name: " + msg.getName());
         * out("  Message Parts: ");
         * for (Part part : msg.getParts()) {
         * out("    Part Name: " + part.getName());
         * out("    Part Element: " + ((part.getElement() != null) ? part.getElement() : "not available!"));
         * out("    Part Type: " + ((part.getType() != null) ? part.getType() : "not available!" ));
         * out("");
         * }
         * }
         * out("");
         */
    }
    
    
    
    
    
    
    
    private static void out(String str) {
        System.out.println(str);
    }
    
}