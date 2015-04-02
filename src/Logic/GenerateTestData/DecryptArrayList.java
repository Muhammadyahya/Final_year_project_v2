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
        switch (className) {
            
            case "Custom Int":
                for (int i = 1; i < userInputDataArrayList.size(); i++) {
                    generatedValue=generatedValue+decryptButtonValue(userInputDataArrayList.get(i),++i); // decryptButtonValue private method in this class
                }

                break;
                
            case "Custom String":

                for (int i = 1; i < userInputDataArrayList.size(); i++) {
                    generatedValue=generatedValue+decryptButtonValue(userInputDataArrayList.get(i),++i);
                }

                break;
                
            case "Enum":

                int x = CommonMethodsTwo.intGen(1, userInputDataArrayList.size()-1);
                    generatedValue = userInputDataArrayList.get(x);

                break;
                
            case "String":

                generatedValue = decryptButtonValue(userInputDataArrayList.get(1),2);
                
                break;
                
            case "Int":

                generatedValue = decryptButtonValue(userInputDataArrayList.get(1),2);
                break;
                
            case "Char":

                generatedValue = decryptButtonValue(userInputDataArrayList.get(1),2);
                break;
            case "Boolean":

                generatedValue = decryptButtonValue(userInputDataArrayList.get(1),2);
                break;
                
            case "Date":

                generatedValue =  decryptButtonValue(userInputDataArrayList.get(1),2);

                break;
                
            case "Custom Decimal":
                

                for (int i = 1; i < userInputDataArrayList.size(); i++) {
                    generatedValue=generatedValue+decryptButtonValue(userInputDataArrayList.get(i),++i); // decryptButtonValue private method in this class
                }

                break;
                
            case "Decimal":

                generatedValue = decryptButtonValue(userInputDataArrayList.get(1),2);
                break;
                
            default :

                break;
                
        }// end Switch
        
        this.storeGeneratedValueObj.addParameterName(storeWsdlDataObj.getElementName().get(count));
        this.storeGeneratedValueObj.addGeneratedValue(generatedValue);
        
        

        
    }// end method start decoding
    
    
    private String decryptButtonValue(String buttonValue, int position)
    {
        String userValue = userInputDataArrayList.get(position); // need to change this
        String className = userInputDataArrayList.get(0);
        String temp="";
        GenerateRandom generateRandomObj = new GenerateRandom();
        
        switch (buttonValue) {
            case "Random":

                temp = generateRandomObj.generateRandomValue(className, userValue);
                break;
            case "BetweenTwoValue":

                GenerateBetweenTwoValue generateBetweenTwoValueObj = new GenerateBetweenTwoValue();
                temp = generateBetweenTwoValueObj.generateValue(className, userValue);
                break;
            case "Random withOut":
                temp = generateRandomObj.generateRandomWithOut();
                break;
            case "Random with":
                temp = generateRandomObj.generateRandomWith();
                break;
            case "Specific":
                temp = userValue;
                break;
            case "Today":
                String [] parts = userValue.split("&");
                temp = new GenerateDate().genTodayDate(parts[0], parts[1]);
                break;
            default :
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


