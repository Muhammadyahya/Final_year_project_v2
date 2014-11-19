/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_year_project_WsdlParsing_V1;

/**
 *
 * @author my301
 */

import com.eviware.soapui.impl.WsdlInterfaceFactory;
import com.eviware.soapui.impl.wsdl.*;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.iface.Operation;
import com.eviware.soapui.model.iface.Request;
import com.eviware.soapui.support.SoapUIException;
import java.io.*;
import java.io.IOException;
import java.util.*;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.xmlbeans.XmlException;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;



public class Wsdl_Parsing {
    
    

    /*
    
    public static void main(String[] args) throws ParserConfigurationException, FileNotFoundException, XmlException, IOException, SoapUIException {
        
        
        WsdlProject wsdlObj = new WsdlProject();
        WsdlInterface iface = WsdlInterfaceFactory.importWsdl(wsdlObj,"http://www.webservicex.net/geoipservice.asmx?WSDL", true)[0];
        
        Operation[] operations = iface.getAllOperations();
        
        for (Operation opObj : operations) {
            out("\n");
            out("Method :"+opObj.getName());
            List<Request> childrens = opObj.getRequestList();
            for (Request reqObj : childrens) {
                System.out.println(reqObj.getRequestContent());

            }
        }
        
        
        out("********************************************* BINGO **********************************************");
        
        test2();
        
        
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
                    
                  //  System.out.println(el.toString());
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
    */
    
    
}
