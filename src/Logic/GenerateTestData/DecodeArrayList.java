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
public class DecodeArrayList {
    
    StoreWsdlData storeWsdlDataObj;
    ArrayList<String> userInputDataArrayList;
    
    public DecodeArrayList(StoreWsdlData storeWsdlDataObj, ArrayList<String> userInputDataArrayList)
    {
      this.storeWsdlDataObj = storeWsdlDataObj;
      this.userInputDataArrayList = userInputDataArrayList;
    }
    

    
    
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
    
}
