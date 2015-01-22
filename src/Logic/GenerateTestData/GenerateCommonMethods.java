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
public class GenerateCommonMethods {
    
    public static int intGen(int rangeFrom, int rangeTo)
    {
        Random randomGenerator = new Random();
        int randomInt  = randomGenerator.nextInt(rangeTo - rangeFrom + 1) + rangeFrom;        
        System.out.println("Generated : " + randomInt);
        return randomInt;
    }
    
    public static int charToInt(String pram)
    {
        return (int) pram.charAt(0);
    }
    
    public static String intTochar(int pram)
    {
         return ""+Character.toChars(pram);
    }
    
    
    
    public static  void main(String [] agrs)
    {
        char character = '0'; // This gives the character 'a'
        int ascii = (int) character;
        System.out.println(ascii);
        
        System.out.println();
    }

}
