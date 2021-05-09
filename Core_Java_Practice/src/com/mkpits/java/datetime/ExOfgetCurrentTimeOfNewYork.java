//Program of get current time of newyork
package com.mkpits.java.datetime;

import java.util.Calendar;
import java.util.TimeZone;

public class ExOfgetCurrentTimeOfNewYork {
    public static void main(String[] args)
    {
        Calendar calNewYork = Calendar.getInstance();
        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println();
        System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
                + calNewYork.get(Calendar.MINUTE)+":"+calNewYork.get(Calendar.SECOND));
        System.out.println();
    }
}

