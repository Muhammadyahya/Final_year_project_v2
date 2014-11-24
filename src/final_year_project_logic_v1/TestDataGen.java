/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_year_project_logic_v1;

import final_year_project_data_V1.*;
import final_year_project_GUI_v1.*;
import java.util.*;

/**
 *
 * @author my301
 */
public class TestDataGen {
    
    
    private StoreWsdlData swdObj;
    private int numOfCase;
    private int prameterLength;
    private int count;
    public TestDataGen(StoreWsdlData swdObj, String numOfCase)
    {
        this.swdObj = swdObj;
        this.numOfCase = Integer.parseInt(numOfCase);
        this.prameterLength =  swdObj.getElmentType().size();
        this.count=0;
    }
    
    public void TestCase(TestDataGen tdgObj)
    {        
        if(count < prameterLength)
        {            
            Object obj = swdObj.getElmentType().get(count);
     
            if(obj instanceof StoreEnum)
            {                
                StoreEnum x =   (StoreEnum)obj;
                EnumGenGui enumGenGuiFrame = new EnumGenGui(x, tdgObj);
                enumGenGuiFrame.setSize(550,500);
                enumGenGuiFrame.setLocationRelativeTo(null);
                enumGenGuiFrame.setDefaultCloseOperation(EnumGenGui.DISPOSE_ON_CLOSE);
                enumGenGuiFrame.setVisible(true);
                enumGenGuiFrame.revalidate();
                
            }
            else if(obj instanceof String)
            {
                TestFrame testFrame = new TestFrame(tdgObj);
                testFrame.setSize(550,500);
                testFrame.setLocationRelativeTo(null);
                testFrame.setDefaultCloseOperation(TestFrame.DISPOSE_ON_CLOSE);
                testFrame.setVisible(true);
                testFrame.revalidate();
            }
            count++;
        }        
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
