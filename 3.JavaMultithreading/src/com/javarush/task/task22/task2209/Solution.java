package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName = reader.readLine();
//        FileReader fileReader = new FileReader(fileName);
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Киев");
        wordList.add("Нью-Йорк");
        wordList.add("Амстердам");
        wordList.add("Вена");
        wordList.add("Мельбурн");
//        String line = "";
//        if ((line = reader.readLine()) != null) {
//            wordList.add(line);
//        }
        ArrayList<String> sortedWordList = new ArrayList<>();
        for (int i = 0; i < wordList.size(); i++) {
            for (int k = i + 1; k < wordList.size(); k++) {
                String lastChar = wordList.get(i).substring(wordList.get(i).length() - 1);
                String firstChar = wordList.get(k).substring(0, 1);
                if (lastChar.equalsIgnoreCase(firstChar)) {
                    sortedWordList.add(wordList.get(i));
                    sortedWordList.add(wordList.get(k));
                }
            }
        }
        //...
        StringBuilder result = getLine();
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        return null;
    }
}
