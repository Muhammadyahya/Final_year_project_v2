package final_year_project_WsdlParsing_V1;

import com.eviware.soapui.config.DefinitionCacheTypeConfig;
import com.eviware.soapui.config.DefintionPartConfig;
import com.eviware.soapui.impl.WsdlInterfaceFactory;
import com.eviware.soapui.impl.support.definition.InterfaceDefinitionPart;
import com.eviware.soapui.impl.wsdl.*;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.support.wsdl.WsdlContext;
import com.eviware.soapui.support.SoapUIException;
import java.io.*;
import java.io.IOException;
import java.util.*;
import javax.wsdl.Definition;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.xmlbeans.XmlException;

/**
 *
 * @author Muhammad Yahya
 */
public class Wsdl_Parsing_context {
    
    public static void main(String[] args) throws ParserConfigurationException, FileNotFoundException, XmlException, IOException, SoapUIException, Exception {
        
        WsdlProject project = new WsdlProject();
        WsdlInterface iface = WsdlInterfaceFactory.importWsdl(project, "http://www.webservicex.net/sendsmsworld.asmx?WSDL", true)[0];
        
        out("Print Iface Name: "+iface.getName());
        
        
        WsdlContext wp = new WsdlContext("http://www.webservicex.net/sendsmsworld.asmx?WSDL", iface);
        
        
        Definition def = wp.getDefinition();//.getAllPortTypes());
        
        Map pt = def.getAllPortTypes();
        
        //pt.(iface);
        out("***********************************************************");
        
        DefintionPartConfig config = null;
        
        config= DefintionPartConfig.Factory.newInstance();
        DefinitionCacheTypeConfig.Enum type = null;
        
        //type = type.
        
        List<InterfaceDefinitionPart> list = wp.getDefinitionParts();
        for(InterfaceDefinitionPart l: list)
        {
            
            out("2222222222222: "+ l.getContent());
            out("3333333333333: "+ l.getType());
            out("4444444444444: "+ l.getUrl());
            
            // config
            
            // ConfigInterfaceDefinitionPart(config,false, type);
        }
        
        
        out("******End of the story ********");
        
        System.exit(0);
        
    }
    
    private static void out(String str) {
        System.out.println(str);
    }
}