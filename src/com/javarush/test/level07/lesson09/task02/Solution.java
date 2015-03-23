package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 5 слов в обратном порядке
Введи с клавиатуры 5 слов в список строк. Выведи их в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        ArrayList<String> list = new  ArrayList<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            list.add(br.readLine());
        }

        Collections.reverse(list);

        for (String i : list)
        {
            System.out.println(i);
        }

    }
}
