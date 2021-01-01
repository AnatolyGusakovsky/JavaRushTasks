package com.javarush.test.level09.lesson02.task02;

/* И снова StackTrace
Написать пять методов, которые вызывают друг друга.
 Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {
        method2();
        //напишите тут ваш код
        String m2="method2";
        return m2;
    }

    public static String method2()
    {
        method3();
        //напишите тут ваш код
        String m3="method3";
        return m3;

    }

    public static String method3()
    {
        method4();
        //напишите тут ваш код
        String m4="method4";
        return m4;
    }

    public static String method4()
    {
        method5();
        //напишите тут ваш код
        String m5="method5";
        return m5;
    }

    public static String method5()
    {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
            element.getMethodName();
return null;
    }
}
