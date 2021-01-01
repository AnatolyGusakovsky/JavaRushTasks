package com.javarush.test.level07.lesson06.task05;
/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list=new ArrayList<String>();
        for(int i=0;i<5;i++){
            list.add(r.readLine()); //добавить 5 строчек с клавиатуры
        }
        for(int i=0;i<13;i++){
            list.add(0,list.remove(4));
        }
        for(String s : list)
            System.out.println(s);//вывод содержимого массива

    }
}
