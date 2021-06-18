package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 5 слов в обратном порядке
Введи с клавиатуры 5 слов в список строк. Выведи их в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> s=new ArrayList<String>();
        for(int i=0;i<5;i++){
            s.add(r.readLine());
        }
        for(int f=4;f>-1;f--){
            System.out.println(s.get(f));
        }

    }
}
