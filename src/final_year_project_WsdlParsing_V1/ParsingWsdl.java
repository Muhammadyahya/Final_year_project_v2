/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_year_project_WsdlParsing_V1;

import com.predic8.schema.ComplexType;
import com.predic8.schema.Element;
import com.predic8.schema.SimpleType;
import com.predic8.schema.restriction.facet.EnumerationFacet;
import com.predic8.soamodel.Consts;
import com.predic8.wsdl.*;
import final_year_project_code_v1.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author my301
 */
public class ParsingWsdl {
    
    private ArrayList<StoreWsdlData> wsdlData;
    
    // constractor
    public ParsingWsdl(){
        wsdlData = new ArrayList<>() ;
    }
    
    public ArrayList<StoreWsdlData> getWsdlData()
    {
        return this.wsdlData;
    }
    
    public void parseWsdl (String wsdl){
        
        String portSOAP;
        boolean checkTypeTwo = false;
        boolean checkTypeOne = false;
        WSDLParser parser = new WSDLParser();
        Definitions defs = parser.parse(wsdl);
        
        for (PortType pt : defs.getPortTypes()) {
            
            portSOAP = pt.getName();
            
            if (portSOAP.endsWith("Soap")) {
                checkTypeOne = true;
                System.out.println(pt.getName());
                for (Operation op : pt.getOperations()) {
                    System.out.println("--" + op.getName());
                    System.out.println("Request Parameters");
                    Element x =   op.getInput().getMessage().getParts().get(0).getElement();
                    StoreWsdlData storeWsdlDataObj = new StoreWsdlData(op.getName());
                    wsdlData.add(storeWsdlDataObj);
                    listParameters(defs.getElement(op.getInput().getMessage().getParts().get(0).getElement().getQname()),0,storeWsdlDataObj);
                    /* we don't need next two lines yet */
                    //System.out.println("Response Parameters");
                    
                    // listParameters(defs.getElement(op.getOutput().getMessage().getParts().get(0).getElement().getQname()));
                    
                    System.out.println("======= Next Method============");
                }
            }
            else if(!checkTypeOne)
            {
                System.out.println("nothing");
                checkTypeTwo = true;
                break;
            }
        }
        
        if(checkTypeTwo)
        {
            wsdlTypeTwo(wsdl);
        }
    }
    

    
    
    private void wsdlTypeTwo (String wsdl)
    {        
        WSDLParser parser = new WSDLParser();
        Definitions defs = parser.parse(wsdl);
        
        for (PortType pt : defs.getPortTypes()) {
            
            for (Operation op : pt.getOperations()) {
                System.out.println("--" + op.getName());
                System.out.println("Request Parameters");
                Element x =   op.getInput().getMessage().getParts().get(0).getElement();
                StoreWsdlData storeWsdlDataObj = new StoreWsdlData(op.getName());
                wsdlData.add(storeWsdlDataObj);
                listParameters(defs.getElement(op.getInput().getMessage().getParts().get(0).getElement().getQname()),0,storeWsdlDataObj);
                /* we don't need next two lines yet */
                //System.out.println("Response Parameters");
                
                // listParameters(defs.getElement(op.getOutput().getMessage().getParts().get(0).getElement().getQname()));
                
                System.out.println("======= Next Method============");
            }
        }
    }// End of the method
    
    
    private static void listParameters(Element element, int i, StoreWsdlData storeWsdlDataObj) {
        
        ComplexType ct = (ComplexType) element.getEmbeddedType();
        if (ct == null){
            try{
                ct = element.getSchema().getComplexType(element.getType().getLocalPart());
                
            }catch(Exception e){
                
                if (element.getSchema().getSimpleTypes().size() > 0) {
                    out("  Schema SimpleTypes: ");
                    for (SimpleType st : element.getSchema().getSimpleTypes()) {
                        if(st.getName().equals(element.getSchema().getSimpleTypes().get(i).getName())){
                            storeWsdlDataObj.addElmentName(st.getName());
                            
                            StoreEnum ss = storeWsdlDataObj.addEnumValue(st.getRestriction().getEnumerationFacets(), st.getName());
                            
                            
                            
                            storeWsdlDataObj.addElmentType(ss);
      
                            break;
                        }
                    }
                }
                     for (ComplexType ct1 : element.getSchema().getComplexTypes()) {
                                out("    ComplexType Name nnnnnnnnnnnnnnn    : " + ct1.getName() + " kkkkkkk   "+ ct1.getBuildInTypeName());
                             }
                
                return;
            }
        }
        if(ct.getModel()!=null){
            
            for (Element e : ct.getSequence().getElements()) {
                
                // Fix for invalid schema
                if (e.getType() == null) {
                    System.out.println("Element: " + element.getName());
                    return;
                }
                if (e.getType().getNamespaceURI() == Consts.SCHEMA_NS) {
                    
                    System.out.println("Element Name:  "+e.getName() + "Element Type: " + e.getType());
                    storeWsdlDataObj.addElmentName(e.getName());
                    storeWsdlDataObj.addElmentType(e.getType().toString());
                }
                else {
                    System.out.println("/n");
                    System.out.println("Element Name:  "+e.getName() + "Element Type: " + e.getType());
                    listParameters(e,i, storeWsdlDataObj);
                    i++;
                }
            }
        }
    }
    
    private static void out(String str) {
        System.out.println(str);
    }
    
}
