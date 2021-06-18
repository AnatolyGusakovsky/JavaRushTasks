package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
*/

public class Solution
{
    public static void main(String[] args)
    {
        String date = "JANUARY 2 1960";
        isDateOdd(date);
    }

    public static boolean isDateOdd(String date)
    {

        Date inputDate = new Date(date);
        String inputDateYear = date.substring(date.length() - 4, date.length());

        if (Integer.parseInt(inputDateYear) == 1970)
        {
            date = date.substring(0, date.length()-4);
            date = date + "1974";
            inputDate = new Date (date);
            inputDateYear = date.substring(date.length() - 4, date.length());
        }

        Date yearStartTime = new Date();

        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);
        yearStartTime.setDate(30);
        yearStartTime.setMonth(11);
        yearStartTime.setYear(Integer.parseInt(inputDateYear) - 1 - 1900);

        long msTimeDistance = 0;

        if (Integer.parseInt(inputDateYear) > 1970)
            msTimeDistance = inputDate.getTime() - yearStartTime.getTime();
        else
            msTimeDistance = (-yearStartTime.getTime()) - (-inputDate.getTime());

        long msDay = 24*60*60*1000;
        int dayCount = (int) (msTimeDistance/msDay);

        if (dayCount%2 !=0)
            return true;
        else
            return false;
    }
}