//Program to Check birthday using current date and display birthday msg
package com.mkpits.java.multipalprograms;

import java.time.LocalDate;
import java.time.Month;

public class ExToCheckBirthdayaAndReturnBdayMessage {
    public static void main(String[] args){
        int birthDate=17;
        Month birthMonth =Month.AUGUST;

        LocalDate currentDate=LocalDate.now();
        System.out.println("Today Date:"+currentDate);

        int date=currentDate.getDayOfMonth();
        Month month=currentDate.getMonth();

        if(date==birthDate && month==birthMonth){
            System.out.println("HAPPY BIRTHDAY TO YOU");
        }
        else{
            System.out.println("Today is not my birthday.");
        }

    }
}
