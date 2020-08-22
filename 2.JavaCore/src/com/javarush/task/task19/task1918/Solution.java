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
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            ArrayList<String> list = new ArrayList<>();
            String line, resultLine;
            resultLine = "";
            while ((line = bufferedReader.readLine()) != null)
                resultLine = resultLine + line;

            String tag = args[0];
            Elements inputElements = new Elements();

                Document doc = parse(resultLine);
                inputElements = doc.getElementsByTag(tag);
                for (Element inputElement : inputElements) {
                    String temp = inputElement.outerHtml();
                    System.out.println(inputElement.outerHtml());
                }


            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
