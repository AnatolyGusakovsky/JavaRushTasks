package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        String fileName = args[0];
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {

                Pattern pattern = Pattern.compile("(\\D+\\s+)+");
                Matcher matcher = pattern.matcher(line);
                String name = "-1";
                while (matcher.find()) {
                     name = line.substring(matcher.start(), matcher.end()).trim();
                }
                Pattern pattern2 = Pattern.compile("(\\d+\\s?)+");
                Matcher matcher2 = pattern2.matcher(line);
                while (matcher2.find()) {
                    String dob = line.substring(matcher2.start(), matcher2.end());
                        Date date = new SimpleDateFormat("dd MM yyyy").parse(dob);
                        PEOPLE.add(new Person(name, date));
                }
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
