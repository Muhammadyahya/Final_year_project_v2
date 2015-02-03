/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.GenerateTestData;

import java.util.Random;

/**
 *
 * @author my301
 */
public class CommonMethodsTwo {
    
    public static int intGen(int rangeFrom, int rangeTo)
    {
        Random randomGenerator = new Random();
        int randomInt  = randomGenerator.nextInt(rangeTo - rangeFrom + 1) + rangeFrom;        
        //System.out.println("Generated : " + randomInt);
        return randomInt;
    }
    
    public static int charToInt(String pram)
    {
        return (int) pram.charAt(0);
    }
    
    public static String intTochar(int pram)
    {
         char c[] = Character.toChars(pram);
         return ""+c[0];
    }
    
    
    /* delete at the end of project... use only for testing */
    public static  void main(String [] agrs)
    {
        char character = 'a'; // This gives the character 'a'
        int ascii = (int) character;
        System.out.println(ascii);
        
        System.out.println(charToInt("a"));
        
        System.out.println(intTochar(122));
    }

}
