//Program of display last day of current month
package com.mkpits.java.datetime;

import java.util.Calendar;

public class ExOfLastDayOfCurrentMonth {
    public static void main(String[] args)
    {
        //Gets a calendar using the default time zone and locale.
        Calendar calendar = Calendar.getInstance();
        System.out.println();
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println();
    }

}
