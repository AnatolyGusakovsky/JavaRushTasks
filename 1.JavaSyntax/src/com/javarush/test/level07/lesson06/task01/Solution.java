package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/


        public class Solution
        {
            public static void main(String[] args) throws Exception {
                String[] five=new String[5];
                five[0] = "строкао ";
                five[1] = "строкад ";
                five[2] = "строкат ";
                five[3] = "строкач ";
                five[4] = "строкап ";
                System.out.println(five.length);
                for (int i = 0; i < 5; i++)
                {
                    System.out.println(five[i]);
                }

            }
        }


