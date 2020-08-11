package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
       try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//           String fileName = reader.readLine();
           String fileName = "C:/testRead.txt"; // uncomment line above, delete this line
           String tag = args[0];
           String tagStart = "<" + tag + ">";
           String tagEnd = "</" + tag + ">";
//           <tag>text1</tag>
           ArrayList<String> template1AraryStrings = new ArrayList<>();
//           <tag text2>text1</tag>
           ArrayList<String> template2AraryStrings = new ArrayList<>();
//           <tag
//           text2>text1</tag>
           ArrayList<String> template3AraryStrings = new ArrayList<>();

           try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
              String line;
              ArrayList<String> stringsFromFile = new ArrayList<>();
              while((line = fileReader.readLine()) != null)
                  stringsFromFile.add(line);
              for (int i = 0; i < stringsFromFile.size(); i++) {
//                  <tag>text1</tag>
                  Pattern pattern1 = Pattern.compile();
                  Matcher matcher1 = pattern1.matcher(stringsFromFile.get(i));
                  String sought;
                  while(matcher1.find()) {
                      sought = stringsFromFile.get(i).substring(matcher1.start(), matcher1.end());
                      template1AraryStrings.add(sought);
                      System.out.println(sought);
                  }
//                  <tag text2>text1</tag>
                  Pattern pattern2 = Pattern.compile("");
                  Matcher matcher2 = pattern2.matcher(stringsFromFile.get(i));
                  while(matcher2.find()) {
                      sought = stringsFromFile.get(i).substring(matcher2.start(), matcher2.end());
                      template2AraryStrings.add(sought);
                      System.out.println(sought);
                  }
//                  <tag
//                  text2>text1</tag>
                  Pattern pattern3 = Pattern.compile("");
                  Matcher matcher3 = pattern2.matcher(stringsFromFile.get(i));
                  while(matcher3.find()) {
                      sought = stringsFromFile.get(i).substring(matcher3.start(), matcher3.end());
                      template3AraryStrings.add(sought);

                  }
              }
           }
       }
catch(IOException e) {
           e.printStackTrace();
}
    }
}
