/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

import com.predic8.wsdl.WSDLParser;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


/**
 * I have made this class to make my life easy. All the commonly used methods will be store in this class.
 * It will save time and code will be less complex to read and understand.
 * @author Muhammad Yahya
 */
public class Common {
    
    
    private static boolean next;
    
    // this method checks if the given value is an int or not.
    public static boolean isInt(String pram)
    {
        try{
            Integer.parseInt(pram);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
    /**********************************************************/
    public static boolean checkPath(String pram)
    {
        try{
            WSDLParser parser = new WSDLParser();
            parser.parse(pram);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    /*******************************************************/
    
    public static void stopLoop()
    {
        next = false;
        while(!Common.getNext())
        {
            
        }
    }
    
    public static void StartLoop()
    {
        next = true;
    }
    
    public static boolean getNext()
    {
        return next;
    }
    
    /*********************************************************/
    
    public static boolean checkConfirm(int pram)
    {
        if(pram==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
