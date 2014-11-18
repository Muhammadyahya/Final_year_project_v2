/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_year_project_WsdlParsing_V1;

import com.predic8.schema.Appinfo;
import com.predic8.schema.Attribute;
import com.predic8.schema.ComplexContent;
import com.predic8.schema.ComplexType;
import com.predic8.schema.Derivation;
import com.predic8.schema.Element;
import com.predic8.schema.ModelGroup;
import com.predic8.schema.SchemaComponent;
import com.predic8.schema.SimpleType;
import com.predic8.soamodel.Consts;
import com.predic8.wsdl.*;
import java.util.ArrayList;

/**
 *
 * @author my301
 */
public class ParsingWsdl {
    
    
    // constractor
    public ParsingWsdl(){
        
    }
    
    public void listOfMethod(String wsdl)
    {
        System.out.println("***********************************************");
        String portSOAP;
        WSDLParser parser = new WSDLParser();
        
        Definitions defs = parser.parse(wsdl);
        
        for (PortType pt : defs.getPortTypes()) {
            
            portSOAP = pt.getName();
            
            if (portSOAP.endsWith("Soap")) {
                
                System.out.println(pt.getName());
                
                for (Operation op : pt.getOperations()) {

                    System.out.println("-444444444444-" + op.getName());
                    
                    System.out.println("22221222");
                }
                
            }
        }
        
        
    }
    
    
    public void parseWsdl (String wsdl){
        
        
        ArrayList<String> methodNames = new ArrayList<>();
        
        // delete this: wsdl = "http://www.webservicex.net/sendsmsworld.asmx?WSDL";
        String portSOAP;
        
        WSDLParser parser = new WSDLParser();
        
        Definitions defs = parser.parse(wsdl);
        
        for (PortType pt : defs.getPortTypes()) {
            
            portSOAP = pt.getName();
            
            if (portSOAP.endsWith("Soap")) {
                
                System.out.println(pt.getName());
                
                for (Operation op : pt.getOperations()) {
                    
                    methodNames.add(op.getName());
                    
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
        
        
        ComplexType ct = (ComplexType) element.getEmbeddedType();
        if (ct == null){            
            try{                
                ct = element.getSchema().getComplexType(element.getType().getLocalPart());
               
            }catch(Exception e){
                
                if (element.getSchema().getSimpleTypes().size() > 0) {
                    out("  Schema SimpleTypes: ");
                    for (SimpleType st : element.getSchema().getSimpleTypes()) {
                        out("    SimpleType Name: " + st.getName());
                        out("    SimpleType Restriction: " + st.getRestriction());
                        out("    SimpleType Union: " + st.getUnion());
                        out("    SimpleType List: " + st.getList());
                    } 
                }
                
                System.out.println("****************************the end*************************************");
                return;
            }
           
        }
        if(ct.getModel()!=null){
            
            for (Element e : ct.getSequence().getElements()) {
                
                // Fix for invalid schema                
                if (e.getType() == null) {
                    System.out.println("Element eeeeeeeeeeeeeeeeeeee: " + element.getName());
                    return;
                }
                
                if (e.getType().getNamespaceURI() == Consts.SCHEMA_NS) {
                    
                    System.out.println("bbbbbbbbbbbbbbbb"+e.getName() + " " + e.getType());
                    
                } else {
                    
                    out("eeeeeeeeeeeeeeeeeeeeee: "+e.getType());                   
                    listParameters(e);
                }
                
            }
        }
        
    }
    
    // delete this method
    private static void completextype(Element element)
    {
        out("*****************************remove the stuff between the starts and comment the top line **********************************");
        
        out("  Schema ComplexTypes: ");
        for (ComplexType ct1 : element.getSchema().getComplexTypes()) {
            out("    ComplexType Name: " + ct1.getName());
            if (ct1.getAnnotation() != null)
                annotationOut(ct1);
            if (ct1.getAttributes().size() > 0) {
                out("    ComplexType Attributes: ");
                /*
                 * If available, attributeGroup could be read as same as attribute in
                 * the following.
                 */
                for (Attribute attr : ct1.getAttributes()) {
                    out("      Attribute Name: " + attr.getName());
                    out("      Attribute Form: " + attr.getForm());
                    out("      Attribute ID: " + attr.getId());
                    out("      Attribute Use: " + attr.getUse());
                    out("      Attribute FixedValue: " + attr.getFixedValue());
                    out("      Attribute DefaultValue: " + attr.getDefaultValue());
                }
            }
            /*
             * ct1.getModel() delivers the child element used in complexType. In case
             * of 'sequence' you can also use the getSequence() method.
             */
            out("    ComplexType Model: " + ct1.getModel().getClass().getSimpleName());
            if (ct1.getModel() instanceof ModelGroup) {
                out("    Model Particles: ");
                for (SchemaComponent sc : ((ModelGroup) ct1.getModel()).getParticles()) {
                    out("      Particle Kind: " + sc.getClass().getSimpleName());
                    //out("      particle Type: " + sc.);
                    out("      Particle Name: " + sc.getName() + "\n");
                }
            }
            
            if (ct1.getModel() instanceof ComplexContent) {
                Derivation der = ((ComplexContent) ct1.getModel()).getDerivation();
                out("      ComplexConten Derivation: " + der.getClass().getSimpleName());
                out("      Derivation Base: " + der.getBase());
            }
            
            if (ct1.getAbstractAttr() != null)
                out("    ComplexType AbstractAttribute: " + ct1.getAbstractAttr());
            if (ct1.getAnyAttribute() != null)
                out("    ComplexType AnyAttribute: " + ct1.getAnyAttribute());
            
            out("");
        }
        
        if (element.getSchema().getSimpleTypes().size() > 0) {
            out("  Schema SimpleTypes: ");
            for (SimpleType st : element.getSchema().getSimpleTypes()) {
                out("    SimpleType Name: " + st.getName());
                out("    SimpleType Restriction: " + st.getRestriction());
                out("    SimpleType Union: " + st.getUnion());
                out("    SimpleType List: " + st.getList());
            }
        }
        
        
        out("***********************************************************************************");
        
    }
    
     // delete this method
    private static void annotationOut(SchemaComponent sc) {
        if (sc.getAnnotation().getAppinfos().size() > 0) {
            System.out
                    .print("    Annotation (appinfos) available with the content: ");
            for (Appinfo appinfo : sc.getAnnotation().getAppinfos()) {
                out(appinfo.getContent());
            }
        } else {
            System.out
                    .print("    Annotation (documentation) available with the content: ");
            for (com.predic8.schema.Documentation doc : sc.getAnnotation().getDocumentations()) {
                out(doc.getContent());
            }
        }
    }
    
    private static void out(String str) {
        System.out.println(str);
    }
    
}
