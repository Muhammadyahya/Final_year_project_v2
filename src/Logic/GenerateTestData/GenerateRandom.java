/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.GenerateTestData;


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
    
    public String generateRandomValue(String pram,String userValue)
    {
        String className = pram;
        int size=0;
        switch (className) {
            
            case "Custom Int":
                temp = ""+GenerateCommonMethods.intGen(0, 9);
                break;
                
            case "Custom String":
                temp = GenerateCommonMethods.intTochar(GenerateCommonMethods.intGen(97,122));
                break;
                
            case "Enum":
                temp = ""+GenerateCommonMethods.intGen(0, 9);
                break;
                
            case "String":
                size =  Integer.parseInt(userValue);
                
                for (int i = 0; i < size ; i++)
                {
                    temp = temp+GenerateCommonMethods.intTochar(GenerateCommonMethods.intGen(97,122));
                }
                break;
                
            case "Int":
                size =  Integer.parseInt(""+userValue.charAt(0));
                for (int i = 0; i < size ; i++) {
                    temp = temp+GenerateCommonMethods.intGen(0, 9);
                }
                break;
                
            case "Char":
                temp = GenerateCommonMethods.intTochar(GenerateCommonMethods.intGen(97,122));
                break;
                
            case "Date":
                temp = userValue;
                break;
                
            default :
                
                break;
                
        }// end Switch
        
        return temp;
    } // end method
    
    
    
    public String generateRandomWith()
    {
       
        temp = GenerateCommonMethods.intTochar(GenerateCommonMethods.intGen(97,122));
        //System.out.println("class generateRandom... method GenereRandomWith :    "+ temp);
        return temp;
    }
    
    public String generateRandomWithOut()
    {
        int valueOne = 0;
        int valueTwo = 0;
        int randomValue =  GenerateCommonMethods.intGen(1,2);
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
        temp = GenerateCommonMethods.intTochar(GenerateCommonMethods.intGen(valueOne, valueTwo));
        
        //System.out.println("class generateRandom... method GenereRandomWith :    "+ temp);
        return temp;
    }
    
    
    /* delete at the end of project... use only for testing */
    public static void main(String [] args)
    {
        GenerateRandom obj = new GenerateRandom();
        obj.generateRandomValue("String", "12");
    }
    
    
    
    
}// end class
