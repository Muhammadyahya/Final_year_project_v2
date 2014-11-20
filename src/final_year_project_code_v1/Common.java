/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package final_year_project_code_v1;

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
}
