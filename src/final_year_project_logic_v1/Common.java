/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package final_year_project_logic_v1;

import com.predic8.wsdl.WSDLParser;

/**
 * I have made this class to make my life easy. All the commonly used methods will be store in this class.
 * It will save time and code will be less complex to read and understand.
 * @author Muhammad Yahya
 */
public class Common {
    
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
}
