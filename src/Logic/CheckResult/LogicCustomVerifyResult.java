/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package Logic.CheckResult;

import Data.User.CollectTestData;
import Data.User.StoreCheckValueData;
import Data.User.StoreReportData;
import java.util.*;
import javax.swing.table.TableModel;

/**
 *
 * @author my301
 */
public class LogicCustomVerifyResult {
    
    private int errorLine = 0;    
     
    public boolean checkAllFeilds(TableModel inputTable, StoreReportData storeReportDataObj)
    {
        ArrayList<String> tagName = new ArrayList<>();
        ArrayList<String> tagValue = new ArrayList<>();
        int rowSize = inputTable.getRowCount();
        boolean check = true;

        for (int i = 0; i < rowSize; i++) {

            if(!inputTable.getValueAt(i, 1).equals(""))
            { 
                tagName.add(inputTable.getValueAt(i, 1).toString());
            }
            else if(!inputTable.getValueAt(i,2).equals(""))
            {
                tagValue.add(inputTable.getValueAt(i, 2).toString());
            }          
            else
            {                
                errorLine = i+1;
                check =  false;
                break;
            }           
        }
        StoreCheckValueData storeCheckValueDataObj = new StoreCheckValueData();
        storeCheckValueDataObj.setTagName(tagName);
        storeCheckValueDataObj.setTagValue(tagValue);
        storeReportDataObj.
        return check;        
    }
    

    
    public int getErrorLine()
    {
        return errorLine;
    }   
  
}
