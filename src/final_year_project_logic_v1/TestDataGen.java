/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_year_project_logic_v1;

import final_year_project_data_V1.*;
import final_year_project_GUI_v1.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author my301
 */
public class TestDataGen extends JFrame {
    
    
    private StoreWsdlData swdObj;
    int numOfCase;
    
    public TestDataGen(StoreWsdlData swdObj, String numOfCase)
    {
        this.swdObj = swdObj;
        this.numOfCase = Integer.parseInt(numOfCase);
    }
    
    public void TestCase()
    {
        for (int i = 0; i < numOfCase; i++)
        {
            int j = 1;
//            System.out.println("1111111222222222222222222222222222222222222222222222222222222");
//            JOptionPane.showInputDialog(null,"ddddddddddddddddddddddddddddddd");
            for(Object obj: swdObj.getElmentType() )
            {
                            //JOptionPane.showInputDialog(null,"22222222222222222222222222222");

                if(obj instanceof StoreEnum)
                {
                    
                    //System.out.println("ssssssssssssssssssssss         "+obj);
                    StoreEnum x =   (StoreEnum)obj; 
                    
                    System.out.println("          "+j++);
                    
                    EnumGenGui enumGenGuiFrame = new EnumGenGui(x);
                    enumGenGuiFrame.setSize(550,500);
                    enumGenGuiFrame.setLocationRelativeTo(null);
                    enumGenGuiFrame.setDefaultCloseOperation(EnumGenGui.DISPOSE_ON_CLOSE);
                    enumGenGuiFrame.setVisible(true);
                    this.dispose();
                    
                }
                else if(obj instanceof String)
                {
                    System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee                "+j++);
                }
            }
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
