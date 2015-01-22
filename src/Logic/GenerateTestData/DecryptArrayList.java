/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.GenerateTestData;

import Data.WSDL.StoreWsdlData;
import java.util.ArrayList;
import java.util.Random;

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
        System.out.println("");
        System.out.println("");
        System.out.println("------ Start --------");
        System.out.println("");
        
        
        switch (className) {
            
            case "Custom Int":
                
                System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                String createValue = "";
                for(String a: userInputDataArrayList)
                {
                    System.out.println("   Custom int   "+a);
                    decryptButtonValue(userInputDataArrayList.get(1));
                }
                break;
                
            case "Custom String":
                
                System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                for(String a: userInputDataArrayList)
                {
                    System.out.println("   Custom String   "+a);
                    decryptButtonValue(userInputDataArrayList.get(1));
                }
                break;
                
            case "Enum":
                
                System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                for(String a: userInputDataArrayList)
                {
                    System.out.println("   Enum   "+a);
                    //decryptButtonValue(userInputDataArrayList.get(1));
                }
                break;
                
            case "String":
                System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                decryptButtonValue(userInputDataArrayList.get(1));
                
                break;
                
            case "Int":
                System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                decryptButtonValue(userInputDataArrayList.get(1));
                break;
                
            case "Char":
                System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                decryptButtonValue(userInputDataArrayList.get(1));
                break;
            case "Boolean":
                System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                decryptButtonValue(userInputDataArrayList.get(1));
                break;
                
            case "Date":
                System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                //decryptButtonValue(userInputDataArrayList.get(1));
                break;
                
            default :
                System.out.println("default case... method: startDecoding");
                break;
                
        }// end Switch
        
        System.out.println("");
        System.out.println("------ end --------");
    }// end method start decoding
    
    
    public String decryptButtonValue(String buttonValue)
    {
        String userValue = userInputDataArrayList.get(2); // need to change this
        String className = userInputDataArrayList.get(0);
        String temp="";
        int size = 0;
        GenerateRandom generateRandomObj = new GenerateRandom();
        
        switch (buttonValue) {
            case "Random":
                System.out.println("value is : " + userValue);               
                temp = generateRandomObj.generateRandomValue(className, userValue);
                break;
            case "BetweenTwoValue":
                System.out.println("value is : " + userValue);
                GenerateBetweenTwoValue generateBetweenTwoValueObj = new GenerateBetweenTwoValue();
                temp = generateBetweenTwoValueObj.generateValue(className, userValue);
                break;
            case "Random withOut":
                System.out.println("value is : " + userValue);
                temp = generateRandomObj.generateRandomWithOut();
                break;
            case "Random with":
                System.out.println("value is : " + userValue);
                temp = generateRandomObj.generateRandomWith();
                break;
            default :
                System.out.println("default case... method: decryptButtonValue");
                temp = userValue;
                break;
        }// end switch
        System.out.println("tttttttttttttt    :"+ temp);
        return temp;
    }// end decryptbuttonvalue
    
    
    
    
    
    /* delete at the end of project*/
    public static void main(String [] args)
    {
        String randomWith ="RANDOMOUT";
        Random r = new Random();
        
        String alphabet = "123xyz";
        for (int i = 0; i < 5; i++) {
            System.out.println(alphabet.charAt(r.nextInt(alphabet.length())));
        }
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


