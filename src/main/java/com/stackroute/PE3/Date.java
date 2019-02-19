package com.stackroute.PE3;
import java.time.*;
import java.text.*;
import java.util.*;

public class Date {
    public boolean startDate() {
        Calendar c = Calendar.getInstance();

// Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

// Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(c.getTime()));
        String s1=df.format(c.getTime());
        if(s1.equals("Mon 18/02/2019"))
            return true;
        else
            return false;

    }
    public boolean endDate() {
        Calendar c = Calendar.getInstance();
        String s2="";
// Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

// Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        for(int i=0;i<6;i++)
        {
            c.add(Calendar.DATE,1);
            //  System.out.println( c.add(Calendar.DATE,1));
        }
        s2 = (df.format(c.getTime()));
        if(s2.equals("Sun 24/02/2019"))
            return true;
        else
            return false;

    }
}


