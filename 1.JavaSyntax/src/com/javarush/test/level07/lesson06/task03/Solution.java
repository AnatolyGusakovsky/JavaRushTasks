package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        String[] five=new String[5];
        for(int h=0;h<5;h++){
            five[h]=r.readLine();
        }


        for(int i=4;i>-1;i--){
            System.out.println(five[i]);
        }

    }
}
