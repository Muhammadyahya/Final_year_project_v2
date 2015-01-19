/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.UserInterface;

import javax.swing.*;

/**
 *
 * @author my301
 */
public class LogicCustomString {
    
    public LogicCustomString()
    {
        
    }
    
    public JComboBox addValueToJComboBox(String valueCheck)
    {
        String valueOne [] =  {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"};
        String valueTwo [] =  {"'","[","]","(",")","{","}","<",">",":",",","-","...","!","<",">",".","?",";","/","\"","@","#","*"};

        
        JComboBox comboBox = new JComboBox();
        
        if(valueCheck.equals("valueOne")){
            for (int i = 0; i < valueOne.length; i++) {
                comboBox.addItem(valueOne[i]);
            }
        }
        else if (valueCheck.equals("valueTwo"))
        {
            for (int i = 0; i < valueOne.length; i++) {
                comboBox.addItem(valueOne[i]);
            }
             for (int i = 0; i < valueTwo.length; i++) {
                comboBox.addItem(valueOne[i]);
            }
        }
        
        for (int i = 0; i < valueOne.length; i++) {
            
            System.out.println("   " + valueOne[i]);
        }
        
        
        for (int i = 0; i < valueTwo.length; i++) {
            
            System.out.println("   " + valueTwo[i]);
        }
        
        return comboBox;
    }
    
    
    public static void main(String [] agrs)
    {
        LogicCustomString o = new LogicCustomString();
        o.addValueToJComboBox("valueTwo");
    }
    
}
