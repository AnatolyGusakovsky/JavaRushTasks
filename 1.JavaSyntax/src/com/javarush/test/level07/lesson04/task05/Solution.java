package com.javarush.test.level07.lesson04.task05;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[]n=new int[20];
        for(int i=0;i<n.length;i++){
            n[i]=Integer.parseInt(reader.readLine());
        }
        int[]q=new int[10];
        q[0]=n[0];
        q[1]=n[1];
        q[2]=n[2];
        q[3]=n[3];
        q[4]=n[4];
        q[5]=n[5];
        q[6]=n[6];
        q[7]=n[7];
        q[8]=n[8];
        q[9]=n[9];
        int[]w=new int[10];
        w[0]=n[10];
        w[1]=n[11];
        w[2]=n[12];
        w[3]=n[13];
        w[4]=n[14];
        w[5]=n[15];
        w[6]=n[16];
        w[7]=n[17];
        w[8]=n[18];
        w[9]=n[19];

        for(int r=0;r<w.length;r++)
            System.out.println(w[r]);
    }
}

