/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




package aDeleteME;

/**
 *
 * @author Muhammad Yahya
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 

@SuppressWarnings("serial")
public class DeleteME {


     public static void main( String[] args ) 
    {
    	try{
 
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        	Date date1 = sdf.parse("2009-12-31");
        	Date date2 = sdf.parse("2010-01-31");
 
        	System.out.println(sdf.format(date1));
        	System.out.println(sdf.format(date2));
 
        	if(date1.compareTo(date2)>0){
        		System.out.println("Date1 is after Date2");
        	}else if(date1.compareTo(date2)<0){
        		System.out.println("Date1 is before Date2");
        	}else if(date1.compareTo(date2)==0){
        		System.out.println("Date1 is equal to Date2");
        	}else{
        		System.out.println("How to get here?");
        	}
 
    	}catch(ParseException ex){
    		ex.printStackTrace();
    	}
    }

}




