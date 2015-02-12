/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Common;

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
        return randomInt;
    }
    
   
    public static double doubleGen(double rangeMin, double rangeMax)
    {        
        // copied below two lines of code from : http://stackoverflow.com/questions/3680637/how-to-generate-a-random-double-in-a-given-range
        Random r = new Random();
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();      
        return randomValue;
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
    }

}
