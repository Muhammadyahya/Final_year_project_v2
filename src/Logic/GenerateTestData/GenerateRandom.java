/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package Logic.GenerateTestData;

import Logic.Common.CommonMethodsTwo;


/**
 *
 * @author my301
 */
public class GenerateRandom {
    
    private String temp;
    public GenerateRandom()
    {
        temp="";
    }
    
    public String generateRandomValue(String parm,String userValue)
    {
        String className = parm;
        int size=0;
        switch (className) {
            
            case "Custom Int":
                temp = ""+CommonMethodsTwo.intGen(0, 9);
                break;
                
            case "Custom String":
                temp = CommonMethodsTwo.intTochar(CommonMethodsTwo.intGen(97,122));
                break;
                
            case "Enum": // i don't think i need this
                temp = ""+CommonMethodsTwo.intGen(0, 9);
                break;
                
            case "String":
                size =  Integer.parseInt(userValue);
                
                for (int i = 0; i < size ; i++)
                {
                    temp = temp+CommonMethodsTwo.intTochar(CommonMethodsTwo.intGen(97,122));
                }
                break;
                
            case "Int":
                size =  Integer.parseInt(""+userValue.charAt(0));
                for (int i = 0; i < size ; i++) {
                    temp = temp+CommonMethodsTwo.intGen(0, 9);
                }
                break;
                
                
            case "Decimal":
                String []  parts = userValue.split("-");
                size =  Integer.parseInt(parts[0]);
                int decimalPosition = Integer.parseInt(parts[1]);
                for (int i = 1; i < size+1 ; i++) {
                    if(i==decimalPosition)
                    {
                        temp = temp+".";
                    }
                    else
                    {
                        temp = temp+CommonMethodsTwo.intGen(0, 9);
                    }
                }
                break;
                
            case "Custom Decimal":
                temp = ""+CommonMethodsTwo.intGen(0, 9);
                break;
                
            case "Char":
                temp = CommonMethodsTwo.intTochar(CommonMethodsTwo.intGen(97,122));
                break;
                
            case "Date":
                parts = userValue.split("&");
                
                if(parts[0].equals("spaces"))
                    parts[0]= " ";
                
                if(parts[0].equals("."))
                    parts[0] = "\\.";
                
                String [] formatParts = parts[1].split(parts[0]);
                // generate random date here.
                // ./././//************************************************************************************************************************//
                
                temp = userValue;
                break;
                
            default :
                
                break;
                
        }// end Switch
        
        return temp;
    } // end method
    
    
    
    public String generateRandomWithOut()
    {
        
        temp = CommonMethodsTwo.intTochar(CommonMethodsTwo.intGen(97,122));
        return temp;
    }
    
    public String generateRandomWith()
    {
        int valueOne = 0;
        int valueTwo = 0;
        int randomValue =  CommonMethodsTwo.intGen(1,2);
        if(randomValue == 1)
        {
            valueOne = 33;
            valueTwo = 64;
        }
        else if (randomValue == 2)
        {
            valueOne = 91;
            valueTwo = 126;
        }
        temp = CommonMethodsTwo.intTochar(CommonMethodsTwo.intGen(valueOne, valueTwo));
        return temp;
    }
    
    
    /* delete at the end of project... use only for testing */
    public static void main(String [] args)
    {
        GenerateRandom obj = new GenerateRandom();
        for (int i = 0; i < 1000; i++) {
            System.out.println(obj.generateRandomWith());
        }
        
    }
    
    
    
    
}// end class
