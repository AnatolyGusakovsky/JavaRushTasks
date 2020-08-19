package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


// template 1
//           <tag>text1</tag>
// template 2
//           <tag text2>text1</tag>
// template 3
//           <tag
//           text2>text1</tag>


public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            String fileName = reader.readLine();
            String fileName = "C:/test.html"; // uncomment line above, delete this line
            String tag = args[0];

            File htmlFile = new File(fileName);
            Document doc = Jsoup.parse(htmlFile, "UTF-8");
            Elements inputElements = doc.getElementsByTag(tag);

            for (Element inputElement : inputElements) {
                String key = inputElement.attr("name");
                String value = inputElement.attr("value");

                System.out.println(key + " =  " + value);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
