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
public class ParsingWsdlNotWorking1
{
    
    private ArrayList<StoreWsdlData> wsdlData;
    
    // constractor
    public ParsingWsdlNotWorking1()
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
                        Element q = defs.getElement(op.getInput().getMessage().getParts().get(0).getElement().getQname());
                        listParameters(q,0,storeWsdlDataObj);
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
    
    public void wsdlTypeTwo (String wsdl)
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
        
        System.out.println("eeeee   "+ element.getName());
        ComplexType ct = (ComplexType) element.getEmbeddedType();
        if (ct == null){
            try{
                String elemetType = element.getType().getLocalPart();
                if(element.getSchema().getComplexTypes().contains(elemetType))
                {
                    ct = element.getSchema().getComplexType(elemetType);
                    System.out.println("cttttt   "+ct.getName());
                }
                else{
                    if (element.getSchema().getSimpleTypes().size() > 0) {
                        for (SimpleType st : element.getSchema().getSimpleTypes()) {
                             //if(st.getName().equals(element.getSchema().getSimpleTypes().get(i).getName())){
                            storeWsdlDataObj.addElmentName(st.getName());
                            storeWsdlDataObj.addElmentType(storeWsdlDataObj.addEnumValue(st.getRestriction().getEnumerationFacets(), st.getName()));
                            //break;
                                             //     }
                            
                        }
                    }
                    return;
                }
                
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
        
        
        ParsingWsdlNotWorking1 obj = new ParsingWsdlNotWorking1();
        String a = "http://www.webservicex.net/genericbarcode.asmx?WSDL";
        String v = "http://www.webservicex.net/ConvertComputer.asmx?WSDL";
        obj.parseWsdl(a);
        //     System.out.println("      : "+obj.wsdlData.get(0).getElmentName());
        
        //       CheckWsdl c = new CheckWsdl();
        //System.out.println(c.checkWSDLAvailable("http://developer.ebay.com/webservices/latest/ebaysvc.wsdl"));
        //obj.parseWsdl("http://developer.ebay.com/webservices/latest/ebaysvc.wsdl");
        //System.out.println("sssss :  "+obj.getWsdlData().get(0).getServerURI());
    }
    
}// end class
