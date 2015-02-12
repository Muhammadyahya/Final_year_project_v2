/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.CheckResult;

import Data.User.StoreReportData;
import java.util.ArrayList;


/**
 *
 * @author my301
 */
public class ResultChecker {
    
                
    public String checkResponse(StoreReportData storeReportDataObj, int position)
    {
        String result="Passed";
        int count =0;
        
        ArrayList<String> resultList = storeReportDataObj.getStoreCheckValueDataList().get(position).getResultList();
        for (int i = 0; i < resultList.size(); i++) {
            if(resultList.get(i).equals("Failed"))
            {
                count++;
                result = "Failed/Passed";
            }            
        }
        if(count == resultList.size())
        {
            result = "Failed";
        }
       return result;
    }   
}
