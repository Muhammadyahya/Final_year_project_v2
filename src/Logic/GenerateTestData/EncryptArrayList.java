/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.GenerateTestData;

import java.util.ArrayList;

/**
 *
 * @author my301
 */
public class EncryptArrayList {
    
    private ArrayList<String> encryptArrayList;
    public EncryptArrayList()
    {
        this.encryptArrayList = new ArrayList<>();
    }
    
    public synchronized ArrayList<String> startEncrypt(String className, String buttonValue, String userValue)
    {
        this.encryptArrayList.add(className);
        this.encryptArrayList.add(buttonValue);
        this.encryptArrayList.add(userValue);
        return this.encryptArrayList;
        
    }   

}
