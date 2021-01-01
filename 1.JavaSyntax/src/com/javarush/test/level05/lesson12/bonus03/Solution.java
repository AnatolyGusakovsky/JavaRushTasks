package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader ber = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        int max;
        int i = 0;
        while (i <= 0)
        {
            i =  Integer.parseInt(ber.readLine());
        }
        max = Integer.parseInt(ber.readLine());
        maximum = max;
        for (int a = 1; a<i; a++)
        {
            max = Integer.parseInt(ber.readLine());
            if (max > maximum)
                maximum = max;
        }



        System.out.println(maximum);
    }
}