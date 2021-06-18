package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        int c=Integer.parseInt(reader.readLine());
        if(a>b&&a>c&&c<b)
            System.out.println(a+" "+b+" "+c);
        if(a>b&&a>c&&c>b)
            System.out.println(a+" "+c+" "+b);
        if(b>a&&b>c&&a>c)
            System.out.println(b+" "+a+" "+c);
        if(b>a&&b>c&&c>a)
            System.out.println(b+" "+c+" "+a);
        if(c>a&&c>b&&a>b)
            System.out.println(c+" "+a+" "+b);
        if(c>a&&c>b&&b>a)
            System.out.println(c+" "+b+" "+a);

    }
}

