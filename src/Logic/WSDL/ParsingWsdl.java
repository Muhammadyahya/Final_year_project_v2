/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.WSDL;

import Data.WSDL.StoreWsdlData;
import com.predic8.schema.*;
import com.predic8.soamodel.*;
import com.predic8.wsdl.*;
import java.util.*;

/**
 *
 * @author my301
 */
public class ParsingWsdl
{
    
    private ArrayList<StoreWsdlData> wsdlData;
    
    // constractor
    public ParsingWsdl()
    {
        wsdlData = new ArrayList<>();
    }
    
    public void parseWsdl (String wsdl)
    {
        System.out.println("111111");
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
                String elemetType = element.getType().getLocalPart();
                if(element.getSchema().getComplexTypes().contains(elemetType))
                {
                     ct = element.getSchema().getComplexType(elemetType);
                }
                
                else if (element.getSchema().getSimpleTypes().size() > 1) {
                    for (SimpleType st : element.getSchema().getSimpleTypes()) {
                        //if(st.getName().equals(element.getSchema().getSimpleTypes().get(i).getName())){
                            storeWsdlDataObj.addElmentName(st.getName());
                            storeWsdlDataObj.addElmentType(storeWsdlDataObj.addEnumValue(st.getRestriction().getEnumerationFacets(), st.getName()));
                            break;
                       // }
                    }
                }
                
                else
                {
                     ct = element.getSchema().getComplexType(element.getType().getLocalPart());
                }
                return;
            }catch(Exception e){
                e.printStackTrace(); 
            }
        }
        
        
        if(ct.getModel()!=null){
            
            for (Element e : ct.getSequence().getElements()) {
                
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
        ParsingWsdl obj = new ParsingWsdl();
        String a = "http://www.webservicex.net/genericbarcode.asmx?WSDL";
        String v = "http://www.webservicex.net/ConvertComputer.asmx?WSDL";
        obj.parseWsdl(a);

    }
    
}// end class
