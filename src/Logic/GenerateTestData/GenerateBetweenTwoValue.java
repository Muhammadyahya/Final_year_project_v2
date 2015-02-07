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
    
    public String generateValue(String pramOne, String pramTwo)
    {
        String className = pramOne;
        String userValue = pramTwo;
        int size=0;
        String temp="";
        String parts [];
        int valueOne;
        int valueTwo;
        
        System.out.println("ref#  GenerateBetweenTwoValue...  pramTwo : "+pramTwo);
        switch (className) {
            
            case "Custom Int":
                temp = ""+CommonMethodsTwo.intGen(Integer.parseInt(""+pramTwo.charAt(0)),Integer.parseInt(""+pramTwo.charAt(2)));
                break;
                
            case "Custom String":
                parts = userValue.split("-");                
                valueOne = Integer.parseInt(""+CommonMethodsTwo.charToInt(parts[1]));
                valueTwo = Integer.parseInt(""+CommonMethodsTwo.charToInt(parts[2]));
                temp = CommonMethodsTwo.intTochar(CommonMethodsTwo.intGen(valueOne,valueTwo));
                
//                System.out.println("value one : "+ valueOne);
//                System.out.println("value two : "+ valueTwo);
//                System.out.println("temp : "+ temp);
                break;                
                
            case "String":
                
                parts = userValue.split("-");
                size =  Integer.parseInt(parts[0]);
                valueOne = Integer.parseInt(""+CommonMethodsTwo.charToInt(parts[1]));
                valueTwo = Integer.parseInt(""+CommonMethodsTwo.charToInt(parts[2]));
                for (int i = 0; i < size ; i++) 
                {
                    temp = temp+CommonMethodsTwo.intTochar(CommonMethodsTwo.intGen(valueOne, valueTwo));
                }
                break;
                
            case "Int":
                
                parts = userValue.split("-");
                size =  Integer.parseInt(parts[0]);
                for (int i = 0; i < size ; i++) 
                {
                    temp = temp+CommonMethodsTwo.intGen(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                }
                break;
                
            case "Char":
                parts = userValue.split("-");                
                valueOne = Integer.parseInt(""+CommonMethodsTwo.charToInt(parts[1]));
                valueTwo = Integer.parseInt(""+CommonMethodsTwo.charToInt(parts[2]));
                temp = CommonMethodsTwo.intTochar(CommonMethodsTwo.intGen(valueOne,valueTwo));
                break;
                
            case "Date":
                parts = userValue.split("&");
                
                if(parts[0].equals("spaces"))
                    parts[0]= " ";
                
                if(parts[0].equals("."))
                    parts[0] = "\\.";
                
                String [] formatParts = parts[1].split(parts[0]);
                // generate random date here.
               // /./.
                
                
                
                
                
                
                
                
                break;
                
            default :

                break;
                
        }// end Switch
        
        return temp;
    }
    
     /* delete at the end of project... use only for testing */
    public static void main(String [] args)
    {
        GenerateBetweenTwoValue obj = new GenerateBetweenTwoValue();
        obj.generateValue("Custom String", "4-d-e");
    }
    
    
    
}
