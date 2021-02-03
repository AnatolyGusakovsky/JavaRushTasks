package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder result = new StringBuilder("");
        for (Map.Entry<String, String> entrySet : params.entrySet()) {
            String skey = entrySet.getKey();
            String svalue = entrySet.getValue();
            if (skey != null && svalue != null) {
                StringBuilder key = new StringBuilder(skey);
                StringBuilder value = new StringBuilder(svalue);

                result = result.append(key).append(" = ").append("'").append(value).append("'").append(" and ");
            }
        }
        String temp = result.toString();
        if (temp.equals(""))
            return temp;
        else
            return result.substring(0, result.toString().length() - 5);
    }
}
