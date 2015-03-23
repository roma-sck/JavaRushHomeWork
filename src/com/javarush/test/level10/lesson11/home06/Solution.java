package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human h1 =  new Human("Vasya");
        Human h2 =  new Human("Vasya", "Pupkin");
        Human h3 =  new Human("Vasya", "Pupkin", 26);
        Human h4 =  new Human("Vasya", "Pupkin", 26, true);
        Human h5 =  new Human("Vasya", "Pupkin", 26, true, "Moscow");
        Human h6 =  new Human("Vasya", "Pupkin", 26, true, "Moscow", 100);
        Human h7 =  new Human("Vasya", "Pupkin", 26, "Moscow");
        Human h8 =  new Human("Vasya", "Pupkin", true);
        Human h9 =  new Human("Vasya", "Pupkin", 150);
        Human h10 =  new Human("Vasya", "Pupkin", "Moscow", 150);

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String fName;
        String lName;
        int age;
        boolean sex;
        String adress;
        double money;

        public Human(String fName)
        {
            fName = this.fName;
        }
        public Human(String fName, String lName)
        {
            fName = this.fName;
            lName = this.lName;
        }
        public Human(String fName, String lName, int age)
        {
            fName = this.fName;
            lName = this.lName;
            age = this.age;
        }
        public Human(String fName, String lName, int age, boolean sex)
        {
            fName = this.fName;
            lName = this.lName;
            age = this.age;
            sex = this.sex;
        }
        public Human(String fName, String lName, int age, boolean sex, String adress)
        {
        fName = this.fName;
        lName = this.lName;
        age = this.age;
        sex = this.sex;
        adress = this.adress;
        }
        public Human(String fName, String lName, int age, boolean sex, String adress, double money)
        {
            fName = this.fName;
            lName = this.lName;
            age = this.age;
            sex = this.sex;
            adress = this.adress;
            money = this.money;
        }
        public Human(String fName, String lName, int age, String adress)
        {
            fName = this.fName;
            lName = this.lName;
            age = this.age;
            adress = this.adress;
        }
        public Human(String fName, String lName, boolean sex)
        {
            fName = this.fName;
            lName = this.lName;
            sex = this.sex;
        }
        public Human(String fName, String lName,  double money)
        {
            fName = this.fName;
            lName = this.lName;
            money = this.money;
        }
        public Human(String fName, String lName, String adress, double money)
        {
            fName = this.fName;
            lName = this.lName;
            adress = this.adress;
            money = this.money;
        }

    }
}
