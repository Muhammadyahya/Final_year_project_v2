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
    
    private String valueOne;
    private String valueTwo;
    private String valueThree;
    private String separator;
    
    public LogicDate(){
        
    }
    
    public boolean checkFormat(String parmOne, String parmTwo, String parmThree, String separator)
    {
        this.valueOne = parmOne;
        this.valueTwo = parmTwo;
        this.valueThree = parmThree;
        this.separator = separator;
        if(separator.equals("spaces"))
            this.separator = " ";
        
        if(separator.equals("."))
            this.separator = "\\.";
        
        System.out.println("1 "+ parmOne + "   2 "+parmTwo +"   3  "+parmThree + "    sep "+ separator);
        
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
    /* delete this method 
    public boolean checkDate(String input){
        try{
            
            String[] parts = input.split(this.separator);
            System.out.println("length parts :" + parts.length);
            if(parts.length<2)
                return false;
            if(!checkDateHelpMethod(parts[0], valueOne))
                return false;
            if(!checkDateHelpMethod(parts[1], valueTwo))
                return false;
            if(!checkDateHelpMethod(parts[2], valueThree))
                return false;
            
        }catch(Exception e){
            return false;
        }
        return true;
    }
    
    private boolean checkDateHelpMethod(String part, String value){
        boolean check = false;
        try{
            switch (value) {
                
                case "m":
                    if(part.length()<3)
                    {
                        if(CommonMethodsOne.isInt(part)){
                            int temp =Integer.parseInt(part);
                            if(temp > 0 && temp < 13){
                                check = true;
                            }
                        }
                    }
                    break;
                    
                case "MM":
                    
                    if(part.length()<3)
                    {
                        if(CommonMethodsOne.isInt(part)){
                            int temp =Integer.parseInt(part);
                            if(temp > 0 && temp < 13){
                                check = true;
                            }
                        }
                    }
                    
                    break;
                    
                case "MMM":
                    String [] monthshort = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Sep","Oct","Nov","Dec"};                 if(part.length()<4)
                    {
                        for (int i = 0; i < monthshort.length; i++) {
                            if(part.equalsIgnoreCase( monthshort[i]))
                            {
                                check = true;
                                break;
                            }
                        }
                    }
                    
                    break;
                    
                case "MMMM":
                    
                    String [] monthFull = {"January","February","March","April","May","June","July","August","September","October","November","December"};
                    if(part.length()<10)
                    {
                        for (int i = 0; i < monthFull.length; i++) {
                            if(part.equalsIgnoreCase( monthFull[i]))
                            {
                                check = true;
                                break;
                            }
                        }
                    }
                    
                    break;
                    
                case "yy":
                    if(part.length()<3)
                    {
                        if(CommonMethodsOne.isInt(part)){
                            int temp =Integer.parseInt(part);
                            if(temp > 0 && temp < 99){
                                check = true;
                            }
                        }
                    }
                    break;
                    
                case "yyyy":
                    if(part.length()<5)
                    {
                        if(CommonMethodsOne.isInt(part)){
                            if(part.charAt(0)== '1' || part.charAt(0)== '2'){
                                check = true;
                            }
                        }
                    }
                    
                    break;
                    
                case "d":
                    if(part.length()<3)
                    {
                        if(CommonMethodsOne.isInt(part)){
                            int temp =Integer.parseInt(part);
                            if(temp > 0 && temp < 32){
                                check = true;
                            }
                        }
                    }
                    break;
                    
                case "dd":
                    if(part.length()<3)
                    {
                        if(CommonMethodsOne.isInt(part)){
                            int temp =Integer.parseInt(part);
                            if(temp > 0 && temp < 32){
                                check = true;
                            }
                        }
                    }
                    break;
                    
                default :
                    System.out.println("default");
                    break;
            }
        }catch(Exception e){
            return check;
        }
        
        System.out.println("check "+ check + "   part "+part +"   value  "+value);
        return check;
    }
    
    */
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
    
    
    
    public boolean isThisDateValid(String dateToValidate, String dateFromat)
    {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
            sdf.setLenient(false);                  
            //if not valid, it will throw ParseException
            sdf.parse(dateToValidate);
            
        } catch (ParseException e) {
            return false;
        }
        
        return true;
    }
    
    
    public boolean getRandomDate(String dateOne, String dateTwo, String dateFormat, String seprator)
    {
        String [] dateOneparts = dateOne.split(seprator);
        String [] dateTwoparts = dateTwo.split(seprator);
        
        String randomformat = "yyyy-mm-dd hh:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        try {
            dateOne = new SimpleDateFormat(randomformat).format(sdf.parse(dateOne));        
            dateTwo = new SimpleDateFormat(randomformat).format(sdf.parse(dateTwo));
            
            long offset = Timestamp.valueOf(dateOne).getTime();
            long end = Timestamp.valueOf(dateTwo).getTime();
            long diff = end - offset + 1;
            Timestamp rand = new Timestamp(offset + (long)(Math.random() * diff));
        
            String time = rand.toString().substring(0,10);
            Date d = sdf.parse(rand.toString());
            System.out.println(d);
            
            System.out.println(time);
            System.out.println(rand);
        System.out.println(new SimpleDateFormat(dateFormat).format(rand));
        
        } catch (ParseException ex) {
            Logger.getLogger(LogicDate.class.getName()).log(Level.SEVERE, null, ex);
        }


        
        
        return true;
    }
    

    
    /* for testing porpose */
    public static void main(String [] args) throws ParseException
    {
        
        LogicDate obj = new LogicDate();
        obj.getRandomDate("02/10/89", "02/10/14", "dd/mm/yy", "/");
        
        
        
//        //Date myDate = new Date();
//        String date2  = "2001-10-03 00:00:00";
//        String format = "yyyy-mm-dd hh:mm:ss";
//        SimpleDateFormat sdf = new SimpleDateFormat(format);
//        Date myDate = sdf.parse(date2);
//        System.out.println(myDate);
//        System.out.println(new SimpleDateFormat("MM-dd-yyyy").format(myDate));
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(myDate));
//        System.out.println(myDate);
//        
//        
//        long offset = Timestamp.valueOf(myDate.toString()).getTime();
//        long end = Timestamp.valueOf("2013-01-01 00:00:00").getTime();
//        long diff = end - offset + 1;
//        Timestamp rand = new Timestamp(offset + (long)(Math.random() * diff));
//        
//        System.out.println(rand);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
         * 
         
        LogicDate obj = new LogicDate();
        String format = "yyyy-mm-dd hh:mm:ss";
        String date2  = "2001-10-03 00:00:00";
        //System.out.println("check format :"+obj.checkFormat("dd", "mmm", "yyyy","/"));
        //System.out.println(obj.valueOne+obj.valueTwo+obj.valueThree);
        //System.out.println("Test result :"  +obj.checkDate(date2));
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date1 = sdf.parse(date2);
        
        System.out.println(date1+"   44");
        
        sdf = new SimpleDateFormat(format);
        Date date = sdf.parse(date2);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Calendar calendar = Calendar.getInstance();
        System.out.println(dateFormat.format(dateFormat.parse(date2))+"      dd");
        
        String a  = dateFormat.format(dateFormat.parse(date2));
        
        System.out.println(date.getYear());
        
        System.out.println(a);
        
        System.out.println(calendar.YEAR+"-"+calendar.DAY_OF_MONTH+"-"+calendar.MONTH+"-");
        
        System.out.println(date +"   ss");        
                
        System.out.println(obj.isThisDateValid(date2, format));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
         * SimpleDateFormat sdf = new SimpleDateFormat(format);
         * String dateInString = date2;
         * Date date = sdf.parse(dateInString);
         * System.out.println(date);
         *
         
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateInString = "31-08-1982 10:20:56";
        Date date = sdf.parse(dateInString);
        System.out.println(date); //Tue Aug 31 10:20:56 SGT 1982
        
        
        System.out.println("1111111111111111111111111111111111111111111111111111111111111111111111");
        
        // Get an instance of a Calendar, using the current time.
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Calendar calendar = Calendar.getInstance();
        System.out.println(dateFormat.format(dateFormat.parse(date2)));
        
        // Printing some information...
        System.out.println("ERA: " + calendar.get(Calendar.ERA));
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
        System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
        System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("DATE: " + calendar.get(Calendar.DATE));
        System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_WEEK_IN_MONTH: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
        System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
        System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
        System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));*/
        
    }
}
