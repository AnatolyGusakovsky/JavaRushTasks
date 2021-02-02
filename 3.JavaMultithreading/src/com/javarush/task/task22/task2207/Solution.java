package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
//        String test = "Test string just for me";
//        String [] wordsArray = test.split(" ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileReader fileReader = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        ArrayList<String> words = new ArrayList();

        while ((line = br.readLine()) != null) {
            String[] wordsArray = line.split(" ");
            words.addAll(Arrays.asList(wordsArray));
        }

        for(String word : words){
            StringBuilder revertedWord = new StringBuilder(word);
            revertedWord.reverse();
            String revWord = String.valueOf(revertedWord);
            for (String newWord: words){

                Pair pair = new Pair(revWord, newWord);



            }
        }
    }

    public static class Pair {
        String first;
        String second;
// this is my constructor
        public Pair (String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
