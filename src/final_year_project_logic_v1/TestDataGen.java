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
public class TestDataGen {
    
    
    private StoreWsdlData swdObj;
    int numOfCase;
    private Thread one;
    
    public TestDataGen(StoreWsdlData swdObj, String numOfCase)
    {
        this.swdObj = swdObj;
        this.numOfCase = Integer.parseInt(numOfCase);
    }
    
    public void TestCase()
    {
        boolean del = false; 
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
                    
                    StoreEnum x =   (StoreEnum)obj; 
                    
                    MyThread r = new MyThread(x);
                    r.start();
                    
//                    TestFrame xx = new TestFrame();
//                    xx.setSize(50,50);
//                    xx.setLocationRelativeTo(null);
//                    xx.setDefaultCloseOperation(TestFrame.DISPOSE_ON_CLOSE);
//                    xx.setVisible(true);
//                    
                     
                    del = true;

                    
                }
                else if(obj instanceof String)
                {
                    System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee                e   "+j++);
                }
                
                if(del)
                {
                    this.check();
                    //Common.stopLoop();
                } 
                   
            }
        }
        
    }
    

    
    public void check()
    {
        Common.stopLoop();
        while(!Common.getNext())
        {
            System.out.println("lol");
        }
        System.out.println("check!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
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
