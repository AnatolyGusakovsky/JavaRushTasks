package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) {
        String sourceFile, fileToWrite;
        sourceFile = args[0];
        fileToWrite = args[1];
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
        FileWriter fileWriter = new FileWriter(fileToWrite)) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                Pattern pattern = Pattern.compile("\\b\\S+\\d+\\S*\\b");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    String founded = line.substring(matcher.start(), matcher.end());
                    fileWriter.write(founded + " ");
                }
            }
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
