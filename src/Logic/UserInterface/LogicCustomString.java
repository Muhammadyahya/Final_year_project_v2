/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package Logic.UserInterface;

import javax.swing.*;
import javax.swing.table.TableModel;

/**
 *
 * @author my301
 */
public class LogicCustomString {
    
    private int errorLine = 0;
    private ArrayList /* add a temp arraylist and store the data in it */
    
    public LogicCustomString()
    {
        
    } 
    
    public boolean checkAllFeilds(TableModel inputTable)
    {
        int colSize = inputTable.getColumnCount()-1;
        boolean check = true;
        for (int i = 0; i < colSize; i++) {
            // /*
            if(inputTable.getValueAt(i, 4).equals(true))
            {
                System.out.println("1111111111    "+inputTable.getValueAt(i, 4));                
            }
            else if(inputTable.getValueAt(i, 5).equals(true))
            {
                System.out.println("111111........    "+inputTable.getValueAt(i, 5));                
            }
            else if(!inputTable.getValueAt(i, 1).equals(""))
            {
                System.out.println("222222222222222222    "+inputTable.getValueAt(i, 1));
            }
            else if(!inputTable.getValueAt(i, 2).equals("") && !inputTable.getValueAt(i, 3).equals(""))
            {
                System.out.println("333333333333333333    "+inputTable.getValueAt(i, 2)+"    "+inputTable.getValueAt(i, 3));
            }
            else
            {                
                System.out.println("44444444444444444   false");
                errorLine = i+1;
                check =  false;
                break;
            }           
        }        
        return check;        
    }
    
    public int getErrorLine()
    {
        return errorLine;
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
                comboBox.addItem(valueTwo[i]);
            }
        }
        /* delete below two for loops */
        for (int i = 0; i < valueOne.length; i++) {
            
            System.out.println("   " + valueOne[i]);
        }
        
        
        for (int i = 0; i < valueTwo.length; i++) {
            
            System.out.println("   " + valueTwo[i]);
        }        
        return comboBox;
    }
    
    /* delete the main method */
    public static void main(String [] agrs)
    {
        LogicCustomString o = new LogicCustomString();
        o.addValueToJComboBox("valueTwo");
    }
    
}
