package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        Map<String,String> fat=new HashMap<String,String>();
        while(true)
        {
            String town=reader.readLine();
            if (town.isEmpty()) break;
            String family=reader.readLine();

            fat.put(family, town);
        }
        //read home number

        String ntown=reader.readLine();




        Iterator<Map.Entry<String,String>> i=fat.entrySet().iterator();
        while(i.hasNext())
        {
            Map.Entry<String,String>pair=i.next();
            String ttown=pair.getKey();
            String name=pair.getValue();
            if(ntown.equals(name))
                System.out.println(ttown);

        }

    }
}
