package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) throw new TooShortStringException();
        boolean flag = true;
        int count = 0;
        String temp = string;
        while (flag) {
            if (temp.contains("\t")) {
                temp = temp.replaceFirst("\t", "");
                count++;
            } else flag = false;
        }
        if (count >= 2) {
            String[] arr = string.split("\t");
            return arr[1];
        } else
            throw new TooShortStringException();
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
//        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
        System.out.println(getPartOfString("\t\t\ts\t"));
    }
}
