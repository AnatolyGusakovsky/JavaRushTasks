package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
            String resultLine = "";
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int symbol = bufferedReader.read();
            while (symbol != -1) {
                resultLine = resultLine.concat(String.valueOf((char) symbol));
                symbol = bufferedReader.read();
            }
            bufferedReader.close();
            String tag = args[0];
            Document doc = Jsoup.parse(resultLine, "", Parser.xmlParser());
            Elements inputElements = doc.select(tag);
            for (Element inputElement : inputElements) {
                System.out.println(inputElement);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}