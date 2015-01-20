/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aDeleteME;

import java.util.ArrayList;
import javax.swing.table.TableModel;

/**
 *
 * @author my301
 */
public class tempPlace {
    
    /*
  

package Logic.UserInterface;

import Logic.Common;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class LogicCustomInt {
    
    private int errorLine = 0;
    private ArrayList<String> inputTableData;
    private String smallerValue;
    private String biggerValue;
    
    public boolean checkAllFeilds(TableModel inputTable)
    {
        inputTableData = new ArrayList<String>();
        int rowSize = inputTable.getRowCount();
        boolean check = true;
        for (int i = 0; i < rowSize; i++) {
            
          if(inputTable.getValueAt(i, 4).equals(true))
            { 
                inputTableData.add((String)"Random"+inputTable.getValueAt(i, 4));
                System.out.println("1111111111    "+inputTable.getValueAt(i, 4));                
            }
            else if(!inputTable.getValueAt(i, 1).equals(""))
            { 
                inputTableData.add((String)inputTable.getValueAt(i, 1));
                System.out.println("222222222222222222    "+inputTable.getValueAt(i, 1));
            }
            else if(!inputTable.getValueAt(i, 2).equals("") && !inputTable.getValueAt(i, 3).equals(""))
            {
                System.out.println(smallerValue+"              "+ biggerValue);
                int valueA = Integer.parseInt((String)inputTable.getValueAt(i, 2));
                int valueB = Integer.parseInt((String)inputTable.getValueAt(i, 3));
                if(valueA>=valueB)
                {
                    System.out.println("333333333333333333    "+valueB+"    "+valueA);
                    inputTableData.add(valueB+"    "+valueA);
                }
                else
                {
                    System.out.println("333333333333333333    "+valueA+"    "+valueB);
                    inputTableData.add(valueA+"    "+valueB);
                } 
            }
            else
            {                
                System.out.println("44444444444444444   false");
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
        System.out.println("dddddddd");
        
    }
}// End Class

  
     */
    
}
