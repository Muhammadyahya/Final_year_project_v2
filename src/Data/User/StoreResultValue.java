/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.User;

import Data.WSDL.*;
import java.util.ArrayList;

/**
 *
 * @author my301
 */
public class StoreResultValue {
    
    private ArrayList<String> tagName;
    private ArrayList<String> tagValue;
    private ArrayList<String> actualTagValue;
    private ArrayList<String> resultList;
   
    
    /* i don't think i need this.
    public StoreResultValue()
    {
        
        this.actualTagValue = new ArrayList<>();
        this.resultList= new ArrayList<>();
    }
    
    */
    
    public ArrayList<String> getTagName() {
        return tagName;
    }
    
    public void setTagName(ArrayList<String> tagName) {
        this.tagName = tagName;
    }
    
    public ArrayList<String> getTagValue() {
        return tagValue;
    }
    
    public void setTagValue(ArrayList<String> tagValue) {
        this.tagValue = tagValue;
    }
    
    public ArrayList<String> getResultList() {
        return resultList;
    }
    
    public void setResultList(ArrayList<String> resultList) {
        this.resultList = resultList;
    }
    
    public ArrayList<String> getActualTagValue(){
        return this.actualTagValue;
    }
    public void setActualTagValue(ArrayList<String> actualResultArray){
        this.actualTagValue = actualResultArray;
    }
}
