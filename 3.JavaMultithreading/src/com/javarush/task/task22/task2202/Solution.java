package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string == null)
            throw new TooShortStringException();
        String [] splitedArray =  string.split(" ");
        if(splitedArray.length >= 5) {
            return splitedArray[1].concat(" " + splitedArray[2]).concat(" " + splitedArray[3]).concat(" " + splitedArray[4]);
        }
        else
            throw new TooShortStringException();
    }

    public static class TooShortStringException extends RuntimeException {
    }
}