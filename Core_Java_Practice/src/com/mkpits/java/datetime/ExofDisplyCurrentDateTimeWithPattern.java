//Program to display current date and time with manner
package com.mkpits.java.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExofDisplyCurrentDateTimeWithPattern {
        public static void main(String[] args) {
            LocalDateTime current = LocalDateTime.now();
            DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

        String formatted=current.format(formatter);


            System.out.println("current Date and Time is:" + formatted);
}
}