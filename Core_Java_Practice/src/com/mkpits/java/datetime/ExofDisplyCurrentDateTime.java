//Example to get current date and time in default formate
package com.mkpits.java.datetime;

import java.time.LocalDateTime;

import static java.time.LocalTime.now;

public class ExofDisplyCurrentDateTime {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("current Date and Time is:" + current);
    }
}
