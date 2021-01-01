package com.javarush.test.level07.lesson06.task02;

/* 5 строчек: «101», «102», «103», «104», «105»
1. Создай список строк.
2. Добавь в него 5 строчек: «101», «102», «103», «104», «105».
3. Удали первую, среднюю и последнюю.
4. Используя цикл выведи на экран его содержимое, каждое значение с новой строки.
5. Выведи его размер. (После удаления одного элемента индексы остальных меняются.
Например, если удалить 0-й элемент, то тот, который был 1-м, станет 0-м. И т.д.)
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> five=new ArrayList<String>();
        five.add("101");
        five.add("102");
        five.add("103");
        five.add("104");
        five.add("105");

        five.remove(0);
        five.remove(1);
        five.remove(2);
        for(int i=0;i<five.size();i++){
            System.out.println(five.get(i));
        }
        System.out.println(five.size());
    }

}

