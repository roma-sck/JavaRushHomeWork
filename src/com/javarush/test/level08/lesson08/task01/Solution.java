package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> words = new HashSet<String>();

        words.add("Ляля");
        words.add("Любовь");
        words.add("Люси");
        words.add("Люлька");
        words.add("Лед");
        words.add("ЛСД");
        words.add("Лопата");
        words.add("Локоть");
        words.add("Лопух");
        words.add("Лящ");
        words.add("Лярва");
        words.add("Лейка");
        words.add("Лесоруб");
        words.add("Лего");
        words.add("Лезвие");
        words.add("Ледоруб");
        words.add("Лист");
        words.add("Лимон");
        words.add("Лира");
        words.add("Лина");

        return words;
    }
}
