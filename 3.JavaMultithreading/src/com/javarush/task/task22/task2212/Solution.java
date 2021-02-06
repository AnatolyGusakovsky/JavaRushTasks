package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/

public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if(telNumber == null )
            return false;
        boolean flag = false;
        if (telNumber.startsWith("+"))
            if (telNumber.replaceAll("[^0-9]", "").length() == 12)
                if (telNumber.matches(".*\\d"))
                    flag = true;

        if (telNumber.startsWith("(") || telNumber.matches("^\\d.+"))
            if (telNumber.replaceAll("[^0-9]", "").length() == 10)
                if (telNumber.matches(".*\\d"))
                    flag = true;

        if (telNumber.matches(".*--.*"))
            flag = false;

        if (telNumber.contains("-") && telNumber.split("-").length > 3)
            flag = false;

        if (telNumber.matches(".*\\).*\\(.*"))
            flag = false;

        if (telNumber.contains("[a-zA-Z]+"))
            flag = false;

        if (telNumber.contains("(") && telNumber.contains(")")) {
            String tempStart;
            String tempEnd;
            tempStart = telNumber.split("\\(")[1];
            tempEnd = tempStart.split("\\)")[0];
            if(tempEnd.length() > 3 || tempEnd.length() < 3)
                flag = false;

        }
        return flag;
    }

    public static void main(String[] args) {
    }
}
