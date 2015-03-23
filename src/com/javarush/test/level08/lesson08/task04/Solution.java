package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));

        //Напишите тут ваш код
        map.put("Бталлоне", new Date("JUNE 1 1980"));
        map.put("Вталлоне", new Date("AUGUST 20 1990"));
        map.put("Жталлоне", new Date("MAY 10 1990"));
        map.put("Кталлоне", new Date("JANUARY 7 1999"));
        map.put("Уталлоне", new Date("MARCH 14 1971"));
        map.put("Фталлоне", new Date("APRIL 23 1993"));
        map.put("Рталлоне", new Date("MAY 30 1983"));
        map.put("Мталлоне", new Date("SEPTEMBER 31 1986"));
        map.put("Хталлоне", new Date("JULY 11 1998"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            int month = iterator.next().getValue().getMonth() + 1;
            if (6 <= month && month <= 8)
            {
                iterator.remove();
            }
        }

    }
}
