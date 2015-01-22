/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package Logic.GenerateTestData;

import Data.WSDL.StoreWsdlData;
import java.util.ArrayList;

/**
 *
 * @author my301
 */
public class DecryptArrayList {
    
    StoreWsdlData storeWsdlDataObj;
    ArrayList<String> userInputDataArrayList;
    
    /*
    * To change this template, choose Tools | Templates
    * and open the template in the editor.
    */
    
    public DecryptArrayList(StoreWsdlData storeWsdlDataObj, ArrayList<String> userInputDataArrayList)
    {
        this.storeWsdlDataObj = storeWsdlDataObj;
        this.userInputDataArrayList = userInputDataArrayList;
    }
    
    public void startDecoding(int count)
    {
        String className = userInputDataArrayList.get(0);
        
        switch (className) {
            case "Custom Int":
                
                System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                
                for(String a: userInputDataArrayList)
                {
                    System.out.println("   Custom int   "+a);
                }
                break;
                
            case "Custom String":
                
                System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                for(String a: userInputDataArrayList)
                {
                    System.out.println("   Custom String   "+a);
                }
                
                break;
            case "Enum":
                
                System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                for(String a: userInputDataArrayList)
                {
                    System.out.println("   Enum   "+a);
                }
                
                break;
                
            case "String":
                
                decryptButtonValue(userInputDataArrayList.get(0));
                
                break;
            case "Int":
                decryptButtonValue(userInputDataArrayList.get(0));
                break;
            case "Char":
                decryptButtonValue(userInputDataArrayList.get(0));
                break;
            case "Boolean":
                decryptButtonValue(userInputDataArrayList.get(0));
                break;
            case "Date":
                decryptButtonValue(userInputDataArrayList.get(0));
                break;
        }// end Switch
        
    }// end method start decoding
    
    
    public void decryptButtonValue(String buttonValue)
    {
        switch (buttonValue) {
            case "Random":
                
                break;
            case "betweenTwoValue":
                
                break;
            case "Specific":
                
                break;
        }// end switch
    }// end decryptbuttonvalue
    
    publicd // need to somehow work out how to decryt the value... some way generic  
    
    /* delete at the end of project*/
    public static void main(String [] args)
    {
        String randomWith ="RANDOMOUT";
        
        coder(randomWith);
    }
    
    
    public static void coder(String a)
    {
        String temp = "$%&£*-^";
        boolean checked = false;
        
        String[] parts = a.split("");
        
        for (int i = 1; i < parts.length; i++) {
            
            
            if(checked)
            {
                temp=temp+"@"+parts[i];
                checked = false;
            }
            else
            {
                temp=temp+"!"+parts[i];
                checked= true;
            }
            
        }
        
        temp = temp+"$%&£*-^";
        
        System.out.println("coder result : "+temp);
        
    }
} // end class


