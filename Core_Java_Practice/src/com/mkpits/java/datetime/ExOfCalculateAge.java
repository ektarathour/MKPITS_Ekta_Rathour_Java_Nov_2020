//Program of Calculate age
package com.mkpits.java.datetime;

import java.time.LocalDate;
import java.time.Period;

public class ExOfCalculateAge {
    public static void main(String[] args)
    {
        // date of birth
        LocalDate pdate = LocalDate.of(1990, 9, 21);
        // current date
        LocalDate now = LocalDate.now();
        // difference between current date and date of birth

        Period diff = Period.between(pdate, now);

        System.out.printf("\nI am  %d years, %d months and %d days old.\n\n",
                diff.getYears(), diff.getMonths(), diff.getDays());
    }
}


