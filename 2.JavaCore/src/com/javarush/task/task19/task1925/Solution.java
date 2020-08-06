package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             FileWriter writer = new FileWriter(args[1])) {
            ArrayList<String> stringsFromFile = new ArrayList<>();
            ArrayList<String> stringsToWrite = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                stringsFromFile.add(line);
            }
            for (int i = 0; i < stringsFromFile.size(); i++) {
                String currentString = stringsFromFile.get(i);
                String foundedWord;
                Pattern pattern = Pattern.compile("\\b\\w{6,}\\b");
                Matcher matcher = pattern.matcher(currentString);
                while (matcher.find()) {
                    foundedWord = currentString.substring(matcher.start(), matcher.end());
                    stringsToWrite.add(foundedWord);
                }
            }
            for (int i = 0; i < stringsToWrite.size(); i++) {
                String temp;
                if (i != stringsToWrite.size() - 1) {
                    temp = stringsToWrite.get(i) + ",";
                    writer.write(temp);
                } else {
                    writer.write(stringsToWrite.get(i));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
