/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic.Common;

import com.predic8.wsdl.WSDLParser;
import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.InputSource;


/**
 * I have made this class to make my life easy. All the commonly used methods will be store in this class.
 * It will save time and code will be less complex to read and understand.
 * @author Muhammad Yahya
 */
public class CommonMethodsOne {
    
    
    private static boolean next;
    
    
    /************************ I have copied this code from ref # http://stackoverflow.com/questions/139076/how-to-pretty-print-xml-from-java **********************************/
    /* Time 12:39 Date 29/01/2015 */
    public static String format(String xml) {        
        try {
            final InputSource src = new InputSource(new StringReader(xml));
            final Node document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(src).getDocumentElement();
            final Boolean keepDeclaration = Boolean.valueOf(xml.startsWith("<?xml"));
            
            //May need this: System.setProperty(DOMImplementationRegistry.PROPERTY,"com.sun.org.apache.xerces.internal.dom.DOMImplementationSourceImpl");

            final DOMImplementationRegistry registry = DOMImplementationRegistry.newInstance();
            final DOMImplementationLS impl = (DOMImplementationLS) registry.getDOMImplementation("LS");
            final LSSerializer writer = impl.createLSSerializer();
            
            writer.getDomConfig().setParameter("format-pretty-print", Boolean.TRUE); // Set this to true if the output needs to be beautified.
            writer.getDomConfig().setParameter("xml-declaration", keepDeclaration); // Set this to true if the declaration is needed to be outputted.
            
            return writer.writeToString(document);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }// end of format method
    
    /**********************************************************/
    
    public static String smallerChar(Object pramOne, Object pramTwo)
    {
        String TempOne = (String)pramOne;
        String TempTwo = (String)pramTwo;
        
        if(TempOne.charAt(0)>TempTwo.charAt(0))
        {
            return TempTwo;
        }
        else
        {
            return TempOne;
        }
    }
    
    public static String biggerChar(Object pramOne, Object pramTwo)
    {
        String TempOne = (String)pramOne;
        String TempTwo = (String)pramTwo;
        
        if(TempOne.charAt(0)>TempTwo.charAt(0))
        {
            return TempOne;
        }
        else
        {
            return TempTwo;
        }
    }
    
    /**********************************************************/
    
    public static String concatenateString(String pram)
    {
        String temp="["+pram+"]";
        return temp;
    }
    
    
    
    // this method checks if the given value is an int or not.
    public static boolean isInt(String pram)
    {
        try{
            Integer.parseInt(pram);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
    /**********************************************************/
    
    
    /*******************************************************/
    
    public static void stopLoop()
    {
        next = false;
        while(!CommonMethodsOne.getNext())
        {
            
        }
    }
    
    public static void StartLoop()
    {
        next = true;
    }
    
    public static boolean getNext()
    {
        return next;
    }
    
    /*********************************************************/
    
    public static boolean checkConfirm(int pram)
    {
        if(pram==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
