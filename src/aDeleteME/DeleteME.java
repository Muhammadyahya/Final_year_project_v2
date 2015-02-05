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

import java.util.Random;
import org.joda.time.*;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
 

@SuppressWarnings("serial")
public class DeleteME {


     public static void main( String[] args ) 
    {
            Random random = new Random();

        DateTime startTime = new DateTime(random.nextLong()).withMillisOfSecond(0);

        Minutes minimumPeriod = Minutes.TWO;
        int minimumPeriodInSeconds = minimumPeriod.toStandardSeconds().getSeconds();
        int maximumPeriodInSeconds = Hours.ONE.toStandardSeconds().getSeconds();

        Seconds randomPeriod = Seconds.seconds(random.nextInt(maximumPeriodInSeconds - minimumPeriodInSeconds));
        DateTime endTime = startTime.plus(minimumPeriod).plus(randomPeriod);

        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println(dateTimeFormatter.print(startTime));
        System.out.println(dateTimeFormatter.print(endTime));
    }

}




