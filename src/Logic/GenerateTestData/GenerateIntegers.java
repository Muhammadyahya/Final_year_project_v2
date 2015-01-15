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
public class GenerateIntegers {
    
    private int rangeFrom, rangeTo;
    public GenerateIntegers(String rangeFrom, String rangeTo)
    {
        this.rangeFrom = Integer.parseInt(rangeFrom);
        this.rangeTo = Integer.parseInt(rangeTo);
    }
    
    public int intGen()
    {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt((this.rangeFrom) - this.rangeTo + 1) + this.rangeTo;        
        System.out.println("Generated : " + randomInt);
        return randomInt;
    }
    
    public void biggerNumber(int rangeFram, int rangeTo)
    {
        // this method should check which number is bigger
    }
}
