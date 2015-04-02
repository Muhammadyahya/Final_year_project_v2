/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.GenerateTestData;

import Logic.UserInterface.LogicDate;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author my301
 */
public class GenerateDate {
    
    public String genTodayDate(String seprator,String dateFormat)
    { 
        return new SimpleDateFormat(dateFormat).format(new Date());
    }    
    
    public String genRandomDate(String seprator,String dateFormat)
    {
        
        String randomformat = "yyyy-MM-dd hh:mm:ss";  
        String dateOne = "1900-01-01 00:00:00";
        String dateTwo = new SimpleDateFormat(randomformat).format(new Date());        
        long offset = Timestamp.valueOf(dateOne).getTime();
        long end = Timestamp.valueOf(dateTwo).getTime();
        long diff = end - offset + 1;
        Timestamp rand = new Timestamp(offset + (long)(Math.random() * diff));
        return new SimpleDateFormat(dateFormat).format(rand);
    }
    
    
    public String genRandomDateBetween(String seprator,String dateFormat,String dateOne, String dateTwo)
    {
        
        String randomformat = "yyyy-MM-dd hh:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        String returnDate = sdf.format(new Date());
        try {
            dateOne = new SimpleDateFormat(randomformat).format(sdf.parse(dateOne));
            dateTwo = new SimpleDateFormat(randomformat).format(sdf.parse(dateTwo));
            
            long offset = Timestamp.valueOf(dateOne).getTime();
            long end = Timestamp.valueOf(dateTwo).getTime();
            long diff = end - offset + 1;
            Timestamp rand = new Timestamp(offset + (long)(Math.random() * diff));
            returnDate = new SimpleDateFormat(dateFormat).format(rand);

        } catch (ParseException ex) {
            Logger.getLogger(LogicDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return returnDate;
    }

    /* for testing porpose */
    public static void main(String [] args)
    {
        GenerateDate obj = new GenerateDate();
        System.out.println(obj.genTodayDate("/","dd/MMM/yyyy"));
    }
    
}
