package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(reader.readLine());
        int n=Integer.parseInt(reader.readLine());
        for(int a=0;a<i;a++){
            for(int b=0;b<n;b++){
                System.out.print(8);  }
            System.out.println();}

    }
}

