//Program of display first and last day of month
package com.mkpits.java.datetime;

import java.time.YearMonth;

public class ExOfLastAndFirstDayOfMonth {
    public static void main(String []args){
        YearMonth ym = YearMonth.of(2021, 5);

        String firstDay = ym.atDay(1).getDayOfWeek().name();
        String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
        System.out.println();
        System.out.println(firstDay);
        System.out.println(lastDay);
        System.out.println();
    }
}

