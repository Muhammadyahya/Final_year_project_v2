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
    
    public DecryptArrayList(StoreWsdlData storeWsdlDataObj, ArrayList<String> userInputDataArrayList)
    {
        this.storeWsdlDataObj = storeWsdlDataObj;
        this.userInputDataArrayList = userInputDataArrayList;
    }
    
    public void startDecoding(int count)
    {
        
        if(userInputDataArrayList.get(0).equals("Custom Int") )
        {
            System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));

            for(String a: userInputDataArrayList)
            {
                System.out.println("   Custom int   "+a);
            }
        }
        
        else if( userInputDataArrayList.get(0).equals("Custom String"))
        {
            System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
            for(String a: userInputDataArrayList)
            {
                System.out.println("   Custom String   "+a);
            }
            
        }
        else if( userInputDataArrayList.get(0).equals("Enum"))
        {
            System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
            for(String a: userInputDataArrayList)
            {
                System.out.println("   Enum   "+a);
            }
            
        }
        else if(userInputDataArrayList.size()<=1)
        {
            System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count) +"         value "+userInputDataArrayList.get(0));
            System.out.println("");

        }
        else
        {
            System.out.println("else case");
        }
        
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
