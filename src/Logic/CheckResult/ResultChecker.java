/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.CheckResult;

import Data.User.StoreGeneratedValue;
import Data.User.StoreReportData;

/**
 *
 * @author my301
 */
public class ResultChecker {
    
    private StoreReportData storeReportDataObj;
    private int position;
    
    public ResultChecker(StoreReportData storeReportDataObj, int position){
        
        this.storeReportDataObj= storeReportDataObj;        
        this.position = position;
    }
    
    
    public String checkResponse()
    {
        
        
        
        return "Failed";
    }
    
}
