/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_year_project_code_v1;

import java.util.*;

/**
 *
 * @author my301
 */
public class StoreWsdlData {
    
    private String methodName;
    private ArrayList <String> elementType;
    private ArrayList <String> elementName;
    
    
    public StoreWsdlData(String methodName){
        this.methodName = methodName;
        this.elementName = new ArrayList<>();
        this.elementType = new ArrayList<>();
    }
    
    public void addElmentName(String elementName)
    {
        this.elementName.add(elementName);
    }    
    
    public void addElmentType(String elementType)
    {
        if(elementType.charAt(1)=='b'){
        this.elementType.add(elementType);
        }
        else{
        this.elementType.add(elementType.substring(34,elementType.length()));
        }
        
    }
    
    public ArrayList<String> getElmentType()
    {
        return this.elementType;
    }
    
    public ArrayList<String> getElmentName()
    {
        return this.elementName;
    }
    
    public String getMethodName()
    {
        return this.methodName;
    }
    
}
