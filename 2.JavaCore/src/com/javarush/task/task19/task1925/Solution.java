package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             FileWriter writer = new FileWriter(args[1])) {
            ArrayList<String> stringsFromFile = new ArrayList<>();
            ArrayList<String> wordsToWrite = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                stringsFromFile.add(line);
            }
            for (int i = 0; i < stringsFromFile.size(); i++) {
                String [] wordsInLine = stringsFromFile.get(i).split(" ");
                for (int k = 0; k < wordsInLine.length; k ++) {
                    if (wordsInLine[k].length() > 6)
                        wordsToWrite.add(wordsInLine[k]);
                }
            }
            for (int i = 0; i < wordsToWrite.size(); i++) {
                String temp;
                if (i != wordsToWrite.size() - 1) {
                    temp = wordsToWrite.get(i) + ",";
                    writer.write(temp);
                } else {
                    writer.write(wordsToWrite.get(i));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
