package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String inputFilenameWin1251 = args [0];
        String outputFilenameUTF8 = args[1];

        InputStream inputStream = new FileInputStream(inputFilenameWin1251);
        OutputStream outputStream = new FileOutputStream(outputFilenameUTF8);
        byte [] buffer = new byte[1000];
        inputStream.read(buffer);
        String s = new String(buffer, "Windows-1251");
        buffer = s.getBytes(StandardCharsets.UTF_8);
        outputStream.write(buffer);

    }
}
