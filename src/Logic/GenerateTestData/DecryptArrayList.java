/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package Logic.GenerateTestData;

import Data.User.StoreGeneratedValue;
import Data.WSDL.StoreWsdlData;
import Logic.Common.CommonMethodsOne;
import Logic.Common.CommonMethodsTwo;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author my301
 */
public class DecryptArrayList {
    
    private StoreWsdlData storeWsdlDataObj;
    private ArrayList<String> userInputDataArrayList;
    public StoreGeneratedValue storeGeneratedValueObj;
    
    /*
    * To change this template, choose Tools | Templates
    * and open the template in the editor.
    */
    
    public DecryptArrayList(StoreWsdlData storeWsdlDataObj, ArrayList<String> userInputDataArrayList, StoreGeneratedValue storeGeneratedValueObj)
    {
        this.storeWsdlDataObj = storeWsdlDataObj;
        this.userInputDataArrayList = userInputDataArrayList;
        this.storeGeneratedValueObj = storeGeneratedValueObj;
    }
    
    public void startDecoding(int count)
    {
        String generatedValue="";
        String className = userInputDataArrayList.get(0);
        
//        System.out.println("");
//        System.out.println("------ Start --------");
//        System.out.println("");
        
        switch (className) {
            
            case "Custom Int":
                
                //System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                for (int i = 1; i < userInputDataArrayList.size(); i++) {
                    generatedValue=generatedValue+decryptButtonValue(userInputDataArrayList.get(i),++i); // decryptButtonValue private method in this class
                }
                System.out.println("temp :  "+generatedValue);
                break;
                
            case "Custom String":
                
                //System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                for (int i = 1; i < userInputDataArrayList.size(); i++) {
                    generatedValue=generatedValue+decryptButtonValue(userInputDataArrayList.get(i),++i);
                }
                System.out.println("temp :  "+generatedValue);
                break;
                
            case "Enum":
                
                //System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                int x = CommonMethodsTwo.intGen(1, userInputDataArrayList.size()-1);
                    generatedValue = userInputDataArrayList.get(x);
                    System.out.println("ref decyptArrayList : "+generatedValue);
                break;
                
            case "String":
                //System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                generatedValue = decryptButtonValue(userInputDataArrayList.get(1),2);
                
                break;
                
            case "Int":
                //System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                generatedValue = decryptButtonValue(userInputDataArrayList.get(1),2);
                break;
                
            case "Char":
                //System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                generatedValue = decryptButtonValue(userInputDataArrayList.get(1),2);
                break;
            case "Boolean":
                //System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                generatedValue = decryptButtonValue(userInputDataArrayList.get(1),2);
                break;
                
            case "Date":
                //System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                generatedValue =  decryptButtonValue(userInputDataArrayList.get(1),2);
                //decryptButtonValue(userInputDataArrayList.get(1));
                break;
                
            case "Custom Decimal":
                
                //System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                for (int i = 1; i < userInputDataArrayList.size(); i++) {
                    generatedValue=generatedValue+decryptButtonValue(userInputDataArrayList.get(i),++i); // decryptButtonValue private method in this class
                }
                System.out.println("temp :  "+generatedValue);
                break;
                
            case "Decimal":
                //System.out.println("Elemnet Name " + storeWsdlDataObj.getElmentName().get(count));
                generatedValue = decryptButtonValue(userInputDataArrayList.get(1),2);
                break;
                
            default :
                System.out.println("default case... method: startDecoding");
                break;
                
        }// end Switch
        
        this.storeGeneratedValueObj.addParameterName(storeWsdlDataObj.getElmentName().get(count));
        this.storeGeneratedValueObj.addGeneratedValue(generatedValue);
        
        
//        System.out.println("");
//        System.out.println("------ end --------");
        
    }// end method start decoding
    
    
    private String decryptButtonValue(String buttonValue, int position)
    {
        String userValue = userInputDataArrayList.get(position); // need to change this
        String className = userInputDataArrayList.get(0);
        String temp="";
        GenerateRandom generateRandomObj = new GenerateRandom();
        
        switch (buttonValue) {
            case "Random":
                //System.out.println("value is : " + userValue);
                temp = generateRandomObj.generateRandomValue(className, userValue);
                break;
            case "BetweenTwoValue":
                //System.out.println("value is : " + userValue);
                GenerateBetweenTwoValue generateBetweenTwoValueObj = new GenerateBetweenTwoValue();
                temp = generateBetweenTwoValueObj.generateValue(className, userValue);
                break;
            case "Random withOut":
                //System.out.println("value is : " + userValue);
                temp = generateRandomObj.generateRandomWithOut();
                break;
            case "Random with":
                //System.out.println("value is : " + userValue);
                temp = generateRandomObj.generateRandomWith();
                break;
            case "Specific":
                //System.out.println("value is : " + userValue);
                temp = userValue;
                break;
            default :
                //System.out.println("default case... method: decryptButtonValue");
                temp = userValue;
                break;
        }// end switch
        
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


