/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_year_project_WsdlParsing_V1;

import com.ibm.wsdl.InputImpl;
import com.predic8.wsdl.Definitions;
import com.predic8.wsdl.PortType;
import com.predic8.wsdl.WSDLParser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.wsdl.Definition;
import javax.wsdl.Operation;
import javax.wsdl.WSDLException;
import javax.wsdl.xml.WSDLReader;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.jsoup.nodes.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author my301
 */
public class Paring_Wsdl4j {
    
    
    public static void main(String[] args) throws WSDLException{
        readWSDLFile1();
        
        out("****************************************************");
        
        WSDLParser parser = new WSDLParser();
        
        Definitions defs = parser
                .parse("http://www.webservicex.net/sendsmsworld.asmx?WSDL");
        
        for (PortType pt : defs.getPortTypes()) {
            System.out.println(pt.getName());
            for (com.predic8.wsdl.Operation op : pt.getOperations()) {
                System.out.println(" -" + op.getName());
            }
        }
        
        //out(""+listOperations());
    }
    
    
    
    public static void readWSDLFile1() throws  WSDLException {
        
        javax.wsdl.xml.WSDLReader wsdlReader11 = javax.wsdl.factory.WSDLFactory.newInstance().newWSDLReader();
        Definition def = wsdlReader11.readWSDL( "http://www.webservicex.net/sendsmsworld.asmx?WSDL" );
        
        Map ma = def.getAllPortTypes();
        
        
        
        
        
      
                
                
        out("**************************************************8");
        for( Object o : def.getTypes().getExtensibilityElements()) {
            
            out("1111111"+o);
            
            if( o instanceof javax.wsdl.extensions.schema.Schema ) {
                org.w3c.dom.Element elt = ((javax.wsdl.extensions.schema.Schema) o).getElement();
                
                out("222222222222222222222"+elt.getBaseURI());
                // Navigate in the DOM model of the schema
                // You can use Schema#getImport() to work with imports
            }
        }
        
       /* 
        List operations = def.getAllPortTypes().getOperations();
               Iterator opIterator = operations.iterator();
               while (opIterator.hasNext())
               {
                    Operation operation = (Operation)opIterator.next();
                    if (!operation.isUndefined())
                    {
                         System.out.println("\n\t_______"+operation.getInput());
          
                         Object Obj = operation.getInput();
                         InputImpl Inputclass = (InputImpl) Obj;
                         System.out.println("\n\t_____inputclass : ____" +Inputclass);
                         System.out.println("\n\t_____inputclass message_____" +Inputclass.getMessage());
                    
                         if (operation.getInput() != null && operation.getOutput() != null)
                         {
                              OperationType = "REQUEST_RESPONSE";
                         }
                         else if (operation.getInput() != null && operation.getOutput() == null)
                         {
                              OperationType = "ONE_WAY";
                         }
                    }
                    QName inPartTypeName = null;
                    // display request parameters
                    Map inputPartsMap = operation.getInput().getMessage().getParts();
                    Collection inputParts = inputPartsMap.values();
                    Iterator inputPartIter = inputParts.iterator();
                    System.out.print("\tRequest: ");
                    while (inputPartIter.hasNext())
                    {
                         Part part = (Part)inputPartIter.next();
                         String inPartName = part.getName();
                         inPartTypeName = part.getTypeName();
                         System.out.println(inPartName + ":" + inPartTypeName.getLocalPart() + " , " + inPartTypeName.getNamespaceURI());
                    }

                    // display response parameters
                    Map outputPartsMap = operation.getOutput().getMessage().getParts();
                    Collection outputParts = outputPartsMap.values();
                    Iterator outputPartIter = outputParts.iterator();
                    System.out.print("\tResponse: ");
                    while (outputPartIter.hasNext())
                    {
                         Part part = (Part)outputPartIter.next();
                         String outPartName = part.getName();
                         QName outPartTypeName = part.getTypeName();
                         System.out.println(outPartName + ":" + outPartTypeName.getLocalPart() + " , " + inPartTypeName.getNamespaceURI());
                    }

               } */
        
    }
    
    /*
    public Definition readWSDLFile() throws  WSDLException {
        WSDLReader reader = getWsdlFactoryInstance().newWSDLReader();
        // switch off the verbose mode
        reader.setFeature(JAVAX_WSDL_VERBOSE_MODE, false);
        reader.setFeature("javax.wsdl.importDocuments", true);
        
        Definition wsdlDefinition;
        if (log.isDebugEnabled()) {
            log.debug("Reading  the WSDL. Base uri is " + baseURI);
        }
        wsdlDefinition = reader.readWSDL(baseURI);
        return wsdlDefinition;
        
    }
   
    
    public String[] listOperations(String filename) throws FileNotFoundException, SAXException, IOException, ParserConfigurationException {
        
          WSDLParser parser = new WSDLParser();
 
    Definitions defs = parser.parse("http://ws.xwebservices.com/XWebBlog/V2/XWebBlog.wsdl");
 
        
        
        Document d = (Document) DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream(filename));
        NodeList elements;
        elements = (NodeList) defs.get();
        ArrayList<String> operations = new ArrayList<String>();
        for (int i = 0; i < elements.getLength(); i++) {
            operations.add(elements.item(i).getAttributes().getNamedItem("name").getNodeValue());
        }
        return operations.toArray(new String[operations.size()]);
    }
     */
    
    
     private static void out(String str) {
        System.out.println(str);
    }
}
