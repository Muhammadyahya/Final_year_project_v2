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
 * This class is for parsing WSDL and for storing WSDL data into class called StoreWSDLData
 * @author my301
 */
public class ParsingWsdl
{
    
    private ArrayList<StoreWsdlData> wsdlData; // not sure why i have array for StoreWSDLDATA
    
    
    public ParsingWsdl()// constractor
    {
        wsdlData = new ArrayList<>();
    }
    
    
    public void parseWsdl (String wsdl) // for parsing WSDL type one
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
                        listParameters(defs.getElement(op.getInput().getMessage().getParts().get(0).getElement().getQname()),storeWsdlDataObj);
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
    
    private void wsdlTypeTwo (String wsdl) // for parsing WSDL type Two
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
                listParameters(defs.getElement(op.getInput().getMessage().getParts().get(0).getElement().getQname()),storeWsdlDataObj);
            }
        }
    }// End of the method
    
    /*
     * ListParameters method takes a element( which is method name) and storeWsdlData object to store all the parameters name and type
     * 
     */
    private void listParameters(Element element, StoreWsdlData storeWsdlDataObj) {
                
        ComplexType ct = (ComplexType) element.getEmbeddedType();
        if (ct == null){
            try{
                ct = element.getSchema().getComplexType(element.getType().getLocalPart());
                
            }catch(Exception e){ // need to work on this... I have to take the code out of the exception
                
                if (element.getSchema().getSimpleTypes().size() > 0) 
                {
                    int x=0;
                    for (SimpleType st : element.getSchema().getSimpleTypes()) 
                    {
                        if(element.getType().getLocalPart().equalsIgnoreCase(element.getSchema().getSimpleTypes().get(x).getName()))// checks if the complex type is not entered 
                        {
                            storeWsdlDataObj.addElementName(element.getName());
                            storeWsdlDataObj.addElementType(storeWsdlDataObj.addEnumValue(st.getRestriction().getEnumerationFacets(), element.getName()));
                            break;
                        }
                        x++;
                    }
                }
                return;
            }
        }
        
        
        if(ct.getModel()!=null){
            
            for (Element e : ct.getSequence().getElements()) {
                  
                // Fix for invalid schema
                if (e.getType() == null) {
                    return;
                }
                if (e.getType().getNamespaceURI() == Consts.SCHEMA_NS) {
                    storeWsdlDataObj.addElementName(e.getName());
                    storeWsdlDataObj.addElementType(e.getType().toString());
                }
                else {
                    listParameters(e, storeWsdlDataObj);
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
        obj.parseWsdl(v);
        
                
          
        String [] c = {"http://www.webservicex.net/usaddressverification.asmx?WSDL","http://www.webservicex.net/stockquote.asmx?WSDL","http://www.webservicex.net/GenericNAICS.asmx?WSDL","http://www.webservicex.net/FedACH.asmx?WSDL","http://www.webservicex.net/MortgageIndex.asmx?WSDL","http://www.webservicex.net/sunsetriseservice.asmx?WSDL","http://www.webservicex.net/FedWire.asmx?WSDL","http://www.webservicex.net/medicareSupplier.asmx?WSDL","http://www.webservicex.net/RealTimeMarketData.asmx?WSDL","http://www.webservicex.net/LondonGoldFix.asmx?WSDL","http://www.webservicex.net/Statistics.asmx?WSDL","http://www.webservicex.net/FinanceService.asmx?WSDL","http://www.webservicex.net/BibleWebservice.asmx?WSDL"};
        String [] b = {"http://www.webservicex.net/TranslateService.asmx?WSDL","http://www.webservicex.net/ConvertComputer.asmx?WSDL","http://www.webservicex.net/Astronomical.asmx?WSDL","http://www.webservicex.net/ConverPower.asmx?WSDL","http://www.webservicex.net/ConvertAngle.asmx?WSDL","http://www.webservicex.net/RssToHTML.asmx?WSDL","http://www.webservicex.net/uklocation.asmx?WSDL","http://www.webservicex.net/periodictable.asmx?WSDL","http://www.webservicex.net/country.asmx?WSDL"}; 
         for (int i = 0; i < c.length; i++) {
             obj.parseWsdl(c[i]);

        }
         
        for (int i = 0; i < b.length; i++) {
             obj.parseWsdl(b[i]);

        }

    }
    
}// end class

