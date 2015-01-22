/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.User;

import java.util.ArrayList;

/**
 *
 * @author my301
 */
public class StoreGenratedData<T> {
    
    private ArrayList<String> pramName;
    private ArrayList<T> pramValue;
    
    public StoreGenratedData()
    {
        this.pramName = new ArrayList<>();
        this.pramValue = new ArrayList<>();
    }
    
    public void setPramName(String pram)
    {
        this.pramName.add(pram);
    }
    
    public void setPramValue(T pram)
    {
        this.pramValue.add(pram);
    }    
    
    public ArrayList<String> getPramName()
    {
        return pramName;
    }
    
    public ArrayList<T> getPramValue()
    {
        return pramValue;
    }
    
    /* delete this at the end */
    public static void main(String [] args)
    {
        StoreGenratedData obj = new StoreGenratedData();
        String s = "aaa";
        char c = 'c';
        int i = 1;
        obj.setPramValue(s);
        obj.setPramValue(c);
        obj.setPramValue(i);
        
        System.out.println("   "+ obj.getPramName());
    }
    
}
