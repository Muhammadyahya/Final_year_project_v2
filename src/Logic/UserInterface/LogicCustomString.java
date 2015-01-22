/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package Logic.UserInterface;

import java.util.*;
import javax.swing.*;
import javax.swing.table.TableModel;

/**
 *
 * @author my301
 */
public class LogicCustomString {
    
    private int errorLine = 0;
    private ArrayList<String> inputTableData;
    
    public LogicCustomString()
    {
        
    } 
    
    public boolean checkAllFeilds(TableModel inputTable)
    {
        inputTableData = new ArrayList<String>();
        inputTableData.add("Custom String");
        int rowSize = inputTable.getRowCount();
        boolean check = true;

        for (int i = 0; i < rowSize; i++) {

            if(inputTable.getValueAt(i, 4).equals(true))
            { 
                inputTableData.add("Random withOut");
                inputTableData.add("1");
            }
            else if(inputTable.getValueAt(i,5).equals(true))
            {
                inputTableData.add("Random with");
                inputTableData.add("1");
            }
            else if(!inputTable.getValueAt(i, 1).equals(""))
            {
                inputTableData.add("Specific");
                inputTableData.add((String)inputTable.getValueAt(i, 1));
            }
            else if(!inputTable.getValueAt(i, 2).equals("") && !inputTable.getValueAt(i, 3).equals(""))
            {
                inputTableData.add("BetweenTwoValue");
                inputTableData.add((String)inputTable.getValueAt(i, 2)+" "+(String)inputTable.getValueAt(i, 3));
            }
            else
            {                
                errorLine = i+1;
                check =  false;
                break;
            }           
        }        
        return check;        
    }
    
    public ArrayList<String> getCustomArrayListData()
    {
        return inputTableData;
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
        return comboBox;
    }    
}
