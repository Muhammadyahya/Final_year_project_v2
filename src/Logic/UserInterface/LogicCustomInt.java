/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.UserInterface;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author my301
 */
public class LogicCustomInt {
    
    static int errorLine = 0;
    
    public static boolean checkAllFeilds(TableModel inputTable)
    {
        int colSize = inputTable.getColumnCount()-1;
        boolean check = true;
        for (int i = 0; i < colSize; i++) {
          // /* 
            if(inputTable.getValueAt(i, 4).equals(true))
            {
                
                System.out.println("1111111111    "+inputTable.getValueAt(i, 4));

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
            
            
            
              
            //* */
            
            //System.out.println(inputTable.getValueAt(i, 2)+"crazyyyyyyyyy");
          
        }
        
        return check;

    }
    
    public static int getErrorLine()
    {
        return errorLine;
    }
    
}
