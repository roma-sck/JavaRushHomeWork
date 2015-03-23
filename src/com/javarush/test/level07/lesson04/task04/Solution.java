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
        //Напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[10];
        for (int i = 0; i < num.length; i++)
        {
            num[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < num.length/2; i++)
        {
                int tmp = num[i];
                num[i] = num[num.length - 1 - i];
                num[num.length - 1 - i] = tmp;
        }

        for (int i = 0; i < num.length; i++)
        {
            System.out.println(num[i]);
        }

    }
}
