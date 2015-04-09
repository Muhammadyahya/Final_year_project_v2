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
        //the if statments are for making sure that max and min values are included...

        if(rangeTo==2147483647)
            rangeTo= rangeTo-1;
        if(rangeFrom==-2147483648){
            rangeFrom= rangeFrom+2;
        }

        Random rand = new Random();
        int randomInt=2;
            if(rangeFrom >= 0 && rangeTo >= 0){
                randomInt = rand.nextInt(rangeTo-rangeFrom+1)+rangeFrom;
            }            
            else if(rangeTo <= 0 && rangeFrom<=0){
                rangeFrom = -rangeFrom;
                rangeTo = -rangeTo;
                if(rangeFrom<=rangeTo){
                   randomInt = -(rand.nextInt(rangeTo-rangeFrom+1)+rangeFrom); 
                }
                else{
                    randomInt = -(rand.nextInt(rangeFrom-rangeTo+1)+rangeTo);
                }
            }
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
        char character = 'a'; //http:// This gives the character 'a'
        int ascii = (int) character;
        for (int i = 0; i < 100; i++) {
            int a = -50;
            int b = -60;
            int c = intGen(a, b);
            System.out.println(c);
        }
    }

}
