package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

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
//            String fileName = reader.readLine();
           String fileName = "C:/test.html"; // uncomment line above, delete this line
            String tag = args[0];
            String tagStart = "<" + tag + ">";
            String tagEnd = "</" + tag + ">";
            // can be problem with queue tags in result array!
// template 1
//           <tag>text1</tag>
// template 2
//           <tag text2>text1</tag>
// template 3
//           <tag
//           text2>text1</tag>
            ArrayList<String> templateAraryStrings = new ArrayList<>();


            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
                String line;
                ArrayList<String> stringsFromFile = new ArrayList<>();
                while ((line = fileReader.readLine()) != null)
                    stringsFromFile.add(line);
                for (int i = 0; i < stringsFromFile.size(); i++) {
//                  <tag>text1</tag>

//                    Document doc = Document.
//                    Elements elements = doc.select("div.page");



                    Pattern pattern1 = Pattern.compile(".?[tagStart][^tagStart][tagEnd]");
                    Matcher matcher1 = pattern1.matcher(stringsFromFile.get(i));
                    String sought;
                    while (matcher1.find()) {
                        sought = stringsFromFile.get(i).substring(matcher1.start(), matcher1.end());
                        templateAraryStrings.add(sought);
                        System.out.println(sought);
                    }
//                  <tag text2>text1</tag>
                    Pattern pattern2 = Pattern.compile("");
                    Matcher matcher2 = pattern2.matcher(stringsFromFile.get(i));
                    while (matcher2.find()) {
                        sought = stringsFromFile.get(i).substring(matcher2.start(), matcher2.end());
                        templateAraryStrings.add(sought);
                        System.out.println(sought);
                    }
//                  <tag
//                  text2>text1</tag>
                    Pattern pattern3 = Pattern.compile("");
                    Matcher matcher3 = pattern2.matcher(stringsFromFile.get(i));
                    while (matcher3.find()) {
                        sought = stringsFromFile.get(i).substring(matcher3.start(), matcher3.end());
                        templateAraryStrings.add(sought);
                        // try to refactor 1923

                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
