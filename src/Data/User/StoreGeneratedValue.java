/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.User;

import java.util.*;

/**
 *
 * @author my301
 */
public class StoreGeneratedValue {
    
    private ArrayList<String> parameterName;
    private ArrayList<String> generateValue;

    
    public StoreGeneratedValue()
    {
        this.generateValue = new ArrayList<>();
        this.parameterName = new ArrayList<>();
    }
    
    public void addParameterName(String pram)
    {
        this.parameterName.add(pram);
    }
    
    public ArrayList<String> getParameterNameList()
    {
        return this.parameterName;
    }
    
    
    public void addGeneratedValue(String pram)
    {
        this.generateValue.add(pram);
    }
    
    public ArrayList<String> getGeneratedValueList()
    {
        return this.generateValue;
    }
    
    
    
    
}
