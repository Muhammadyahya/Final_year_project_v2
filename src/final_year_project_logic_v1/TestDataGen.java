/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_year_project_logic_v1;

import final_year_project_data_V1.ParsingWsdl;
import java.util.*;

/**
 *
 * @author my301
 */
public class TestDataGen {
    
    public TestDataGen(ParsingWsdl ParsingWsdlobj)
    {
        
    }
    
    public void intGen(String rangeFrom, String rangeTo)
    {
        Random randomGenerator = new Random();
        for (int idx = 1; idx <= 100; ++idx){
        int randomInt = randomGenerator.nextInt((Integer.parseInt(rangeFrom) - Integer.parseInt(rangeTo) + 1) + Integer.parseInt(rangeTo));
       
        System.out.println("Generated : " + randomInt);
    }
        
       System.out.println("some thing is happening!!!!!");
        
    }
    
}
