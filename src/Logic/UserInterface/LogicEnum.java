/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.UserInterface;

import Data.WSDL.StoreEnum;
import java.util.ArrayList;

/**
 *
 * @author my301
 */
public class LogicEnum {
    
    
    private StoreEnum storeEnumObj;
    
    public LogicEnum(StoreEnum storeEnumObj)
    {
        this.storeEnumObj = storeEnumObj;
    }
    
    public ArrayList<String> addEnumToArray()
    {
        ArrayList<String> temp = new ArrayList<>();
        for(String stringObj: storeEnumObj.getEnumValue())
        {
            temp.add(stringObj);
        }
        return temp;
    }
}
