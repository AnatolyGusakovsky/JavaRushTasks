package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Кроссворд
*/

// 28.12.2020Пересмотреть алгоритм, он не работает!

public class Solution {
    public static void main(String[] args) throws Exception {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
//        detectAllWords(crossword, "home", "same");
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */


//        test char array
//        String asd = "One";
//        char[] asdArray = asd.toCharArray();
//        for (char x : asdArray)
//            System.out.println(x);


//        test getCoordinatesOfCharInArray()

//        char m = "m".charAt(0);
//        ArrayList<Integer[]> testList = new ArrayList<Integer[]>();
//        testList = getCoordinatesOfCharInArray(m, crossword);
//        for (Integer[] x : testList)
//            System.out.println("row: " + x[0] + " column: " + x[1]);


        // test found coordinates for each letter of alphabet in crossword (letterCoordinates)

//        Map<Character, ArrayList<Integer[]>> letterCoordinates = new HashMap<>();
//        Character[] alphabet = new Character[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//        for (Character i: alphabet) {
//            ArrayList<Integer[]> coordChar = getCoordinatesOfCharInArray(i, crossword);
//            letterCoordinates.put(i, coordChar);
//        }
//
//        for (Map.Entry<Character, ArrayList<Integer[]>> letter: letterCoordinates.entrySet()) {
//            System.out.println("Letter " + letter.getKey());
//            ArrayList<Integer[]> coordnts =  letter.getValue();
//
//            for(Integer[] c: coordnts){
//                System.out.println("row: " + c[0] + " column: " + c[1]);
//            }
//            System.out.println("--------------------------");
//        }

    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {

        // search coord each letter in crossword
        Map<Character, ArrayList<Integer[]>> letterCoordinates = new HashMap<>();
        Character[] alphabet = new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (Character i : alphabet) {
            ArrayList<Integer[]> coordChar = getCoordinatesOfCharInArray(i, crossword);
            letterCoordinates.put(i, coordChar);
        }
//        for (Map.Entry<Character, ArrayList<Integer[]>> letter: letterCoordinates.entrySet()) {
//            System.out.println("Letter " + letter.getKey());
//            ArrayList<Integer[]> coordnts =  letter.getValue();
//
//            for(Integer[] c: coordnts){
//                System.out.println("row: " + c[0] + " column: " + c[1]);
//            }
//            System.out.println("--------------------------");
//        }
//        ----------------------------------------------------------------------------------------


        List<Word> list = new ArrayList<>();

        // chech each word
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            char[] charsOfCurrentWord = currentWord.toCharArray();
            boolean flag = true;
           // check each char
            for (int k = 0; k < charsOfCurrentWord.length; k++) {
                ArrayList<Integer[]> coordntsOfCurrentLetter = letterCoordinates.get(k);
//               check each coord first char
                for (Integer[] x : coordntsOfCurrentLetter) {
//                    if(x[1] < )
//                    if(crossword[ x[0] ][ x[1]+1 ] != )


                    for (int m = 1; m < charsOfCurrentWord.length; m++) {
                        if (m != charsOfCurrentWord.length - 1) {
                            Integer coordLastWord[] = new Integer[2];
//                            ->
                            if (charsOfCurrentWord[m] == crossword[x[0]][x[1] + m]) {
                                // check here each symbol in this direction
                                for (int n = 2; n < charsOfCurrentWord.length; n++) {
                                    if (m != charsOfCurrentWord.length - 2) {
                                        if (charsOfCurrentWord[n] != crossword[x[0]][x[1] + n]) {
                                            flag = false;
                                        } else {
                                            coordLastWord[0] = x[0];
                                            coordLastWord[1] = x[1] + n;
                                        }
                                    }
                                }

                                if (flag) {
                                    Word word = new Word(words[i]);
                                    word.setStartPoint(x[0], x[1]);
                                    word.setEndPoint(coordLastWord[0], coordLastWord[1]);
                                }
                            }

                        }

//                            <-
                        else if (charsOfCurrentWord[m + 1] == crossword[x[0]][x[1] + m - 1]) {
                            flag = true;
                        }

                    }

                }

//
            }

        }
        return list;
    }


    public static ArrayList<Integer[]> getCoordinatesOfCharInArray(char character, int[][] array) {
        if (character != 0 && array != null) {

            ArrayList<Integer[]> coordinatesOfFoundedChars = new ArrayList<>();

            for (int i = 0; i < array.length; i++) {
                for (int k = 0; k < array[i].length; k++) {
                    if (array[i][k] == character) {
                        coordinatesOfFoundedChars.add(new Integer[]{i, k}); // y, x
                    }
                }
            }

            return coordinatesOfFoundedChars;
        } else {
            System.out.println("Incorrect input data !");
            return null;
        }

    }

//    public static char getCharByCoord(int row, int column, int[][] array) {
//        char foundedChar = (char) array[row][column];
//
//
//        return
//    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
