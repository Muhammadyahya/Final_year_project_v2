/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.WSDL;

/**
 *
 * @author my301
 */
import Data.WSDL.StoreWsdlData;
import com.predic8.schema.*;
import com.predic8.soamodel.*;
import com.predic8.wsdl.*;
import java.util.*;

/**
 *
 * @author my301
 */
public class ParsingWsdlWorking
{
    
    private ArrayList<StoreWsdlData> wsdlData;
    
    // constractor
    public ParsingWsdlWorking()
    {
        wsdlData = new ArrayList<>();
    }
    
    public void parseWsdl (String wsdl)
    {
        try{
            String portSOAP;
            boolean checkTypeTwo = false;
            boolean checkTypeOne = false;
            WSDLParser parser = new WSDLParser();
            Definitions defs = parser.parse(wsdl);
            
            
            for (PortType pt : defs.getPortTypes()) {
                portSOAP = pt.getName();
                
                if (portSOAP.endsWith("Soap")) {
                    checkTypeOne = true;
                    for (Operation op : pt.getOperations()) {
                        
                        Element x =   op.getInput().getMessage().getParts().get(0).getElement();
                        StoreWsdlData storeWsdlDataObj = new StoreWsdlData(op.getName());
                        wsdlData.add(storeWsdlDataObj);
                        storeWsdlDataObj.setServerURI(defs.getTargetNamespace());
                        storeWsdlDataObj.setUrl(wsdl);
                        listParameters(defs.getElement(op.getInput().getMessage().getParts().get(0).getElement().getQname()),0,storeWsdlDataObj);
                    }
                }
                else if(!checkTypeOne){
                    checkTypeTwo = true;
                    break;
                }
            }
            
            if(checkTypeTwo){
                wsdlTypeTwo(wsdl);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    private void wsdlTypeTwo (String wsdl)
    {
        WSDLParser parser = new WSDLParser();
        Definitions defs = parser.parse(wsdl);
        
        for (PortType pt : defs.getPortTypes()) {
            
            for (Operation op : pt.getOperations()) {
                Element x =   op.getInput().getMessage().getParts().get(0).getElement();
                StoreWsdlData storeWsdlDataObj = new StoreWsdlData(op.getName());
                wsdlData.add(storeWsdlDataObj);
                storeWsdlDataObj.setServerURI(defs.getTargetNamespace());
                storeWsdlDataObj.setUrl(wsdl);
                listParameters(defs.getElement(op.getInput().getMessage().getParts().get(0).getElement().getQname()),0,storeWsdlDataObj);
            }
        }
    }// End of the method
    
    
    private void listParameters(Element element, int i, StoreWsdlData storeWsdlDataObj) {
        
        System.out.println(element.getName());
        
        ComplexType ct = (ComplexType) element.getEmbeddedType();
        if (ct == null){
            try{
                ct = element.getSchema().getComplexType(element.getType().getLocalPart());
                
            }catch(Exception e){
                
                if (element.getSchema().getSimpleTypes().size() > 0) 
                {
                    for (SimpleType st : element.getSchema().getSimpleTypes()) 
                    {
                        if(st.getName().equals(element.getSchema().getSimpleTypes().get(i).getName()))
                        {
                            System.out.println("  -- "+st.getName());   
                            storeWsdlDataObj.addElmentName(st.getName());
                            storeWsdlDataObj.addElmentType(storeWsdlDataObj.addEnumValue(st.getRestriction().getEnumerationFacets(), st.getName()));
                            break;
                        }
                    }
                }
                return;
            }
        }
        
        
        if(ct.getModel()!=null){
            
            for (Element e : ct.getSequence().getElements()) {
                
                System.out.println("  -e- "+e.getName());   
                // Fix for invalid schema
                if (e.getType() == null) {
                    return;
                }
                if (e.getType().getNamespaceURI() == Consts.SCHEMA_NS) {
                    storeWsdlDataObj.addElmentName(e.getName());
                    storeWsdlDataObj.addElmentType(e.getType().toString());
                }
                else {
                    listParameters(e,i, storeWsdlDataObj);
                    i++;
                }
            }
        }
    } // end method
    
    public ArrayList<StoreWsdlData> getWsdlData()
    {
        return this.wsdlData;
    }
    
    /* for testing porpose */
    public static void main(String [] args)
    {
        ParsingWsdlWorking obj = new ParsingWsdlWorking();
        String a = "http://www.webservicex.net/genericbarcode.asmx?WSDL";
        String v = "http://www.webservicex.net/ConvertComputer.asmx?WSDL";
        obj.parseWsdl(a);

    }
    
}// end class

