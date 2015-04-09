/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.CheckResult;

import Data.User.CollectTestData;
import Data.User.StoreResultValue;
import Data.User.StoreReportData;
import java.util.*;
import javax.swing.table.TableModel;
import org.w3c.dom.Document;

/**
 *
 * @author my301
 */
public class LogicCustomVerifyResult {
    
    private String message = "Everything is fine";
    private StoreReportData storeReportDataObj;
    
    public LogicCustomVerifyResult(StoreReportData storeReportDataObj){
        this.storeReportDataObj = storeReportDataObj;
    }
    public boolean checkAllFeilds(TableModel inputTable,Document doc)
    {
        ArrayList<String> tagNameArray = new ArrayList<>();
        ArrayList<String> tagValueArray = new ArrayList<>();
        ArrayList<String> resultArray = new ArrayList<>();
        ArrayList<String> actualValueArray = new ArrayList<>();
        int rowSize = inputTable.getRowCount();
        boolean check = true;
        
        
        for (int i = 0; i < rowSize; i++) {
            
            if(!inputTable.getValueAt(i, 1).equals("")&& !inputTable.getValueAt(i,2).equals(""))
            {
                if(doc.getElementsByTagName(inputTable.getValueAt(i,1).toString()).getLength()>0)
                {
                    tagNameArray.add(inputTable.getValueAt(i, 1).toString());
                    tagValueArray.add(inputTable.getValueAt(i, 2).toString());
                    
                    String response =doc.getElementsByTagName(inputTable.getValueAt(i,1).toString()).item(0).getTextContent();
                    if(response.equals(inputTable.getValueAt(i,2))){
                        resultArray.add("Passed");
                        actualValueArray.add(response);
                    }
                    else
                    {
                        actualValueArray.add(response);
                        resultArray.add("Failed");
                    }
                }
                else{
                    message = "No <"+inputTable.getValueAt(i,1) +"> tag found, line number "+(++i)+".";
                    check = false;
                    break;
                }
                
            }
            else{               
                message = "Error on line number "+ (++i) +".";
                check = false;
                break;
            }            
        }
        
        if(check)
        {
            StoreResultValue storeCheckValueDataObj = new StoreResultValue();
            storeCheckValueDataObj.setTagName(tagNameArray);
            storeCheckValueDataObj.setTagValue(tagValueArray);
            storeCheckValueDataObj.setResultList(resultArray);
            storeCheckValueDataObj.setActualTagValue(actualValueArray);        
            storeReportDataObj.setStoreCheckValueDataList(storeCheckValueDataObj);
        }
        return check;
    }    
    
    public String getMessage()
    {
        return this.message;
    }
    
    
}
