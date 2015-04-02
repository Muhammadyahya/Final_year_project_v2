/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.WSDL;

import com.predic8.schema.restriction.facet.EnumerationFacet;
import java.util.*;
import javax.swing.JOptionPane;

/**
 * This class store all the Wsdl Data for each element, such as method Name, it prammeters and data types.
 * All the variables are private user has to use getters and setters to get and save data.
 * @author my301
 */
public class StoreWsdlData {
    
    private String methodName;
    private ArrayList <Object> elementType;
    private ArrayList <String> elementName;
    private String serverURI;
    private String url;
    
    
   
    public StoreWsdlData(String methodName){ // Constructor of this class. it requires method name.
        this.methodName = methodName;
        this.elementName = new ArrayList<>();
        this.elementType = new ArrayList<>();
    }
    
    // This method store input prammeter elment Name.
    public void addElementName(String elementName)
    {
        this.elementName.add(elementName);
    }
    
    // This method store input prammeter element data type.
    
    // i need to work on storing complex types sepratly.
    public void addElementType(Object elementType)
    {
        if(elementType instanceof StoreEnum){
            this.elementType.add((StoreEnum)elementType);
        }
        else if(elementType instanceof String){
            String castElementType = (String)elementType;
            this.elementType.add(castElementType.substring(34,castElementType.length()));
        }
        else{
            JOptionPane.showMessageDialog(null, "Warning! Unable to add element Type!. Please check class name: StoreWsdl and method name: addElement Type."); // for error detection
        }
    }
    
    public StoreEnum addEnumValue(List<EnumerationFacet> enumValue, String elementName)
    {
        StoreEnum storeEnumObj = new StoreEnum(elementName);
        for(EnumerationFacet ef: enumValue)
        {
            storeEnumObj.addEnumValue(ef.getValue());
        }
        return storeEnumObj;
    }
    
    // This method get input prammeter elment data type. It returns Arraylist.
    public ArrayList<Object> getElementType()
    {
        return this.elementType;
    }
    
    // This method get input prammeter elment name. It returns Arraylist.
    public ArrayList<String> getElementName()
    {
        return this.elementName;
    }
    
    //This method get method name.
    public String getMethodName()
    {
        return this.methodName;
    }
    
    public String getServerURI()
    {
        return this.serverURI;
    }
    
    public void setServerURI(String parm)
    {
        this.serverURI = parm;;
    }
    public String getUrl()
    {
        return this.url;
    }
    
    public void setUrl(String parm)
    {
        this.url = parm;;
    }
}
