package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

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
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int maximum = 0;
        if (N > 0)
        {
            List<Integer> numbs = new ArrayList<Integer>();
            for (int i = 0; i < N; i++)
            {
                int num = Integer.parseInt(reader.readLine());
                numbs.add(num);
            }
            Collections.sort(numbs);
            maximum = numbs.get(N-1);
            //System.out.println(numbs.toString());
        } else {
            System.out.println("Wrong number");
        }

        System.out.println(maximum);
    }
}
