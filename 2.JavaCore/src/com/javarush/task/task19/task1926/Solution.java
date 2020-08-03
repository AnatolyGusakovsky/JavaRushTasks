package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String fileName = "";
        String line;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
           while ((line = fileReader.readLine()) != null) {
                    for (int i = line.length() - 1; i >= 0; i--)
                        System.out.print(line.charAt(i));
               System.out.println();
                }
//            while ((line = fileReader.readLine()) != null) {
//                System.out.println(new StringBuilder(line).reverse());
//            }
            }
            catch(FileNotFoundException sad) {
                System.out.println("FileNotFoundException catched");
            }
        } catch (IOException b) {
            System.out.println("IOException catched");
        }
    }
}