/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SaveReport;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.Transformer;
import java.io.File;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 *
 * @author my301
 */
public class SaveReportExcel {
    
    
    public SaveReportExcel(){
        
    }
    /* i will try this later
    
    public static void main(String [] args) throws TransformerConfigurationException
    {
        Transformer transformer = (Transformer) TransformerFactory.newInstance().newTransformer();
        Result output = new StreamResult(new File("/homes/my301/year3/Project/other/output.xml"));
        Source input = new DOMSource();
        transformer.transform(input,output);
    }
    
    */
    
}
