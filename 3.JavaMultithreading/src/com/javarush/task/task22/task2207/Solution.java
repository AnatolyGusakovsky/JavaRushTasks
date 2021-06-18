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

        for (int i = 0; i < words.size(); i++) {
            StringBuilder revertedWord = new StringBuilder(words.get(i));
            revertedWord.reverse();
            String revWord = String.valueOf(revertedWord);
            for (int k = i + 1; k < words.size() - 1; k++) {
                if (revWord.equals(words.get(k))) {
                    Pair pair = new Pair();
                    pair.first = words.get(i);
                    pair.second = words.get(k);
                    if (!(Pair.pairExistInlist(pair, result)))
                        result.add(pair);
                }
            }
        }
    }

    public static class Pair {
        String first;
        String second;

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

        public static boolean pairExistInlist(Pair pair, List<Pair> pairList) {
            Boolean result = false;
            for (Pair i : pairList) {
                if (i.equals(pair))
                    result = true;
                else
                    result = false;
            }
            return result;
        }
    }
}
