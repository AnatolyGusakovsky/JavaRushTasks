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

import static org.jsoup.Jsoup.parse;
import static org.jsoup.Jsoup.parseBodyFragment;


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
            String fileName = reader.readLine();
//            String fileName = "C:/test.html"; // uncomment line above, delete this line
            FileInputStream fileInputStream = new FileInputStream(fileName);
            byte[] buffer = new byte[fileInputStream.available()];
            if (fileInputStream.available() > 0) {
                int count = fileInputStream.read(buffer);
            }
            fileInputStream.close();

            String resultLine = new String(buffer);
            String tag = args[0];

                Document doc = parse(resultLine);
                Elements inputElements = doc.getElementsByTag(tag);
                for (Element inputElement : inputElements) {
                    String temp = inputElement.outerHtml();
                    Pattern pattern1 = Pattern.compile("<" + tag + ">\\s+");
                    Matcher matcher1 = pattern1.matcher(temp);
                    Pattern pattern2 = Pattern.compile("\\s+</" + tag + ">");
                    Matcher matcher2 = pattern2.matcher(temp);
                    while (matcher1.find()){
                        String open = "<" + tag + ">";
                        String x = temp.substring(matcher1.start(), matcher1.end());
                        temp = temp.replace(x, open);
                    }
                    while (matcher2.find()){
                        String close = "</" + tag + ">";
                        String x = temp.substring(matcher2.start(), matcher2.end());
                        temp = temp.replace(x, close);
                    }
                    System.out.println(temp);
                }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
