/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.UserInterface;

import Logic.CommonMethodsOne;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
                    
                case "mm":
                    
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
                    
                case "mmm":
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
                    
                case "mmmm":
                    
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
    
    
    
    
    
    
    /* for testing porpose */
    public static void main(String [] args)
    {
        LogicDate obj = new LogicDate();
        System.out.println("check format :"+obj.checkFormat("dd", "mmm", "yyyy","."));
        //System.out.println(obj.valueOne+obj.valueTwo+obj.valueThree);
        System.out.println("Test result :"  +obj.checkDate("02.oct.2001"));
        
    }
}
