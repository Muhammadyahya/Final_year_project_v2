/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.UserInterface;

import Logic.Common.CommonMethodsOne;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author my301
 */
public class LogicDate {
    

    private String separator;

    
    public boolean checkFormat(String parmOne, String parmTwo, String parmThree, String separator)
    {

        if(separator.equals("spaces"))
            this.separator = " ";
        
        if(separator.equals("."))
            this.separator = "\\.";
        
        
        boolean check = false;
        if(!checkFormatHelpMethod(parmOne, parmTwo, parmThree))
            return check;
        if(!checkFormatHelpMethod(parmTwo, parmOne, parmThree))
            return check;
        if(!checkFormatHelpMethod(parmThree, parmTwo, parmOne))
            return check;
        return true;
    }
    
    private boolean checkFormatHelpMethod(String parmOne, String parmTwo, String parmThree)
    {
        if(parmOne.charAt(0)==parmTwo.charAt(0)|| parmOne.charAt(0)==parmThree.charAt(0)) {
            return false;
        }
        else{
            return true;
        }
    }

    public String compareDate(String dateOne, String dateTwo, String format)
    {
        String temp = "wrong";
        try{
            
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Date date1 = sdf.parse(dateOne);
            Date date2 = sdf.parse(dateTwo);
            
            System.out.println(sdf.format(date1));
            System.out.println(sdf.format(date2));
            
            if(date1.compareTo(date2)>0){
                System.out.println("Date1 is after Date2");
                temp = "DateOne";
            }else if(date1.compareTo(date2)<0){
                System.out.println("Date1 is before Date2");
                temp = "DateTwo";
            }else if(date1.compareTo(date2)==0){
                System.out.println("Date1 is equal to Date2");
                temp = "equal";
            }else{
                System.out.println("How to get here?");
            }
            
        }catch(ParseException ex){
            ex.printStackTrace();
            
        }
        return temp;
    }
    
    
    
    public boolean isThisDateValid(String date, String dateFromat)
    {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);                
            //if not valid, it will throw ParseException
            sdf.parse(date);
            
        } catch (ParseException e) {
            return false;
        }        
        return true;
    }
    
    
    
    

    
    /* for testing porpose */
    public static void main(String [] args) throws ParseException
    {        
        LogicDate obj = new LogicDate();
        
        System.out.println(obj.isThisDateValid("2001 oct 15", "yyyy MMM dd"));
        System.out.println(obj.checkFormat("yy", "mm", "dd","-"));
    }
}
