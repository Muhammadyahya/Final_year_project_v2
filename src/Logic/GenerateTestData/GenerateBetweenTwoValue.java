/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.GenerateTestData;

/**
 *
 * @author my301
 */
public class GenerateBetweenTwoValue {
    
    public GenerateBetweenTwoValue()
    {
        
    }
    
    public void generateValue(String pram)
    {
        String className = pram;
        String temp="";
        switch (className) {
            
            case "Custom Int":
                temp = ""+GenerateCommonMethods.intGen(0, 9);
                break;
                
            case "Custom String":
                temp = GenerateCommonMethods.intTochar(GenerateCommonMethods.intGen(1, 26));
                break;
                
            case "Enum":
                
                break;
                
            case "String":
                temp = GenerateCommonMethods.intTochar(GenerateCommonMethods.intGen(1, 26));
                break;
                
            case "Int":
                temp = ""+GenerateCommonMethods.intGen(0, 9);
                break;
                
            case "Char":
                temp = GenerateCommonMethods.intTochar(GenerateCommonMethods.intGen(1, 26));
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
