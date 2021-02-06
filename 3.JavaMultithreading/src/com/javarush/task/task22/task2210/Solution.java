package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String token;
        ArrayList<String> temp = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()) {
           token = stringTokenizer.nextToken();
        temp.add(token);
        }
        String [] result = new String[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result [i] = temp.get(i);
        }
        return result;
    }
}
