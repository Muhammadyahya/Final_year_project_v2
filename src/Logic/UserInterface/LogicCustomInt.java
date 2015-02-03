/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.UserInterface;

import Logic.CommonMethodsOne;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author my301
 */
public class LogicCustomInt {
    
    private int errorLine = 0;
    private ArrayList<String> inputTableData;
    private String smallerValue;
    private String biggerValue;
    
    public LogicCustomInt(){
        
    }
    
    public boolean checkAllFeilds(TableModel inputTable)
    {
        inputTableData = new ArrayList<String>();
        inputTableData.add("Custom Int");
        int rowSize = inputTable.getRowCount();
        boolean check = true;
        for (int i = 0; i < rowSize; i++) {
            
            if(inputTable.getValueAt(i, 4).equals(true))
            {
                inputTableData.add("Random");
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
                smallerAndBigger((String)inputTable.getValueAt(i, 2),(String)inputTable.getValueAt(i, 3));
                inputTableData.add(smallerValue+" "+ biggerValue);
            }
            else
            {
                errorLine = i+1;
                check =  false;
                break;
            }
        }// End ForLoop
        return check;
        
    }// end Method
    
    public int getErrorLine()
    {
        return errorLine;
    }
    
    public ArrayList<String> getCustomArrayListData()
    {
        return inputTableData;
    }
    
    public void smallerAndBigger(String a, String b)
    {
        int valueA = Integer.parseInt(a);
        int valueB = Integer.parseInt(b);
        if(valueA>=valueB)
        {
            smallerValue = ""+valueB;
            biggerValue = ""+valueA;
        }
        else
        {
            smallerValue = ""+valueA;
            biggerValue = ""+valueB;
        }
    }
    
    public String getBiggerValue()
    {
        return biggerValue;
    }
    
     public String getSmalerValue()
    {
        return smallerValue;
    }
}// End Class
