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
public class GenerateSpecific {
    
    public GenerateSpecific()
    {
        // I don't think i need this... delete it at that the end
    }
    
    public void generateValue(String pram)
    {
        String className = pram;
        String temp="";
        switch (className) {
            
            case "Custom Int":
                temp = ""+CommonMethodsTwo.intGen(0, 9);
                break;
                
            case "Custom String":
                temp = CommonMethodsTwo.intTochar(CommonMethodsTwo.intGen(1, 26));
                break;
                
            case "Enum":
                
                break;
                
            case "String":
                temp = CommonMethodsTwo.intTochar(CommonMethodsTwo.intGen(1, 26));
                break;
                
            case "Int":
                temp = ""+CommonMethodsTwo.intGen(0, 9);
                break;
                
            case "Char":
                temp = CommonMethodsTwo.intTochar(CommonMethodsTwo.intGen(1, 26));
                break;
            case "Boolean":

                break;
                
            case "Date":
                temp = "02/10/2005";
                break;
                
            default :

                break;
                
        }// end Switch
    }
}
