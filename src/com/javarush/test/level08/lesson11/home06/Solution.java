package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        ArrayList<Human> childrens = new ArrayList<Human>();
        Human child1 = new Human("Вася", true, 15, new ArrayList<Human>());
        Human child2 = new Human("Саша", true, 10, new ArrayList<Human>());
        Human child3 = new Human("Света", false, 14, new ArrayList<Human>());
        childrens.add(child1);
        childrens.add(child2);
        childrens.add(child3);

        ArrayList<Human> pap = new ArrayList<Human>();
        ArrayList<Human> mom = new ArrayList<Human>();
        Human papa = new Human("Сергей", true, 37, childrens);
        Human mama = new Human("Наташа", false, 35, childrens);
        pap.add(papa);
        mom.add(mama);

        Human grpa1 = new Human("Федор", true, 60, pap);
        Human grpa2 = new Human("Александр", true, 58, pap);
        Human grma1 = new Human("Варвара", false, 59, mom);
        Human grma2 = new Human("Изабелла", false, 56, mom);

        System.out.println(grpa1);
        System.out.println(grpa2);
        System.out.println(grma1);
        System.out.println(grma2);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);


    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.children = children;
    }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
