package com.javarush.test.level07.lesson04.task02;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
Каждый элемент - с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
      String[]s=new String[10];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<8;i++){
           s[i]=reader.readLine();
        }
String[]b=new String[10];
        b[0]=s[9];
        b[1]=s[8];
        b[2]=s[7];
        b[3]=s[6];
        b[4]=s[5];
        b[5]=s[4];
        b[6]=s[3];
        b[7]=s[2];
        b[8]=s[1];
        b[9]=s[0];
        for(int i=0;i<b.length;i++)
            System.out.println(b[i]);

    }
}