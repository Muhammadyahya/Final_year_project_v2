/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_year_project_SoupUI_V1;

/**
 *
 * @author my301
 */

import com.eviware.soapui.impl.WsdlInterfaceFactory;
import com.eviware.soapui.impl.wsdl.*;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.ModelItem;
import com.eviware.soapui.model.iface.Operation;
import com.eviware.soapui.model.iface.Request;
import com.eviware.soapui.support.SoapUIException;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLModel.WSDLParser;
import groovy.util.NodeList;
import java.io.*;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.impl.xb.substwsdl.DefinitionsDocument.Definitions;
import org.wsI.testing.x2004.x07.analyzerConfig.WsdlElementType;
import org.wsI.testing.x2004.x07.analyzerConfig.impl.WsdlElementTypeImpl;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class Wsdl_Parsing {
    
    

    
    
    public static void main(String[] args) throws ParserConfigurationException, FileNotFoundException, XmlException, IOException, SoapUIException {
        /*  try {
         
          String wsldInput = JOptionPane.showInputDialog("please enter the WSLD");
          // this wsldinput will go instead of wsld 2 lines below.
          WsdlProject project = new WsdlProject();
          
          WsdlInterface iface = WsdlInterfaceFactory.importWsdl(project, "http://www.webservicex.net/geoipservice.asmx?WSDL", true)[0];
          
          List<Operation> operationlist = iface.getOperationList();
          
          System.out.println(""+iface.getName());
          
          
          
          List<AbstractWsdlModelItem<?>> abc = iface.getAllMessages();
          for(AbstractWsdlModelItem<?> m : abc){
          //out("abstract zzzzzzzzzzzzzzzzz"+m.getChildren().get(0).getName());
          for(ModelItem mx : m.getChildren()){
          
          out("mxxxxx:   "+ mx.getName());
          
          
          
          
          }
          }
          for (Operation opObj : operationlist) {
          System.out.println("1111111: "+opObj.getName());
          WsdlOperation operation1 = (WsdlOperation) iface.getOperationByName(opObj.getName());
          
          //WsdlRequest request = operation1.addNewRequest("request one");
          
          System.out.println("oprtation type tttttt:  "+operation1.getType());
          
          
          System.out.println("555555555:  "+ operation1.getBindingOperation().getBindingInput());
          List<? extends ModelItem> modellist = opObj.getChildren();
          for(ModelItem modelObj:modellist)
          {
          System.out.println("222222: "+modelObj.getName());
          }
          
          List<Request> childrens = opObj.getRequestList();
          for (Request c : childrens) {
          System.out.println("333333333:  "+c.getRequestContent());
          }
          
          org.apache.xmlbeans.SchemaType sType = null;
          
          WsdlElementType et = new WsdlElementTypeImpl(sType);
          
          }
          
          
          } catch (XmlException | IOException | SoapUIException ex) {
          Logger.getLogger(Wsdl_Parsing.class.getName()).log(Level.SEVERE, null, ex);
          
          }
         
         */
        
        WsdlProject project = new WsdlProject();
        WsdlInterface iface = WsdlInterfaceFactory.importWsdl(project,
                "http://www.webservicex.net/geoipservice.asmx?WSDL", true)[0];
        
        Operation[] operations = iface.getAllOperations();
        
        for (Operation o : operations) {
            System.out.println("\n");
            System.out.println("Method :"+o.getName());
            List<Request> childrens = o.getRequestList();
            for (Request c : childrens) {
                System.out.println(c.getRequestContent());
                
                
            }
        }
        
        
    }
    
    public static void test2(){
     int elementSize = 0;
     String address = "http://www.webservicex.net/geoipservice.asmx?WSDL";
    
        try{
            Document doc = Jsoup.connect(address).get();
            
            
        
            Elements img = doc.getElementsByTag("s:element");
            elementSize = img.size();
            String str1 = "type";
            
            
            for(Element el: img){
                
            
                //System.out.print(el.toString());
                
                //real = real.replace("type"+ '"', "");
                
                if(el.hasAttr("type")){
                    
                    //System.out.println(el.toString());
                    int position = el.toString().indexOf(str1);
                    String real = el.toString().substring(position);
                    real = real.replace("type="+'"', "");
                    position = real.indexOf('"');
                    real = real.substring(0,position);
                    System.out.println(real);
                    
                }
                
                
                // URL url = new URL(el.absUrl("type").trim());
                //BufferedImage image = ImageIO.read(url);
                
            }
            
        }catch(Exception ce){
            ce.printStackTrace();
        }
    }
    
    
    private static void out(String str) {
        System.out.println(str);
    }
    
    
    
}
