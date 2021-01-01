package com.javarush.test.level07.lesson04.task04;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[]n=new int[10];
        for(int i=0;i<10;i++){
            n[i]=Integer.parseInt(reader.readLine());
        }
        int[]a=new int[10];
        a[0]=n[9];
        a[1]=n[8];
        a[2]=n[7];
        a[3]=n[6];
        a[4]=n[5];
        a[5]=n[4];
        a[6]=n[3];
        a[7]=n[2];
        a[8]=n[1];
        a[9]=n[0];
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);










    }
}
