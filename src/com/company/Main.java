package com.company;

    public class Main {

        public static void main(String[] args) {
            Person vitya = new Person(120, "Vitya");
            vitya.say("Goerge");
            System.out.println(vitya.name + "'s height is " + vitya.height);

            Person vlad = new Person();
            System.out.println(vlad.height);

            Person dima = new Person("Dima");
            System.out.println(dima.name + "Dima's height is " + dima.height);

            Student freshman = new Student(76, "Viktor", 2);
            freshman.tell();

            Student fresh = new Student(280, "Vlad", 4);
            fresh.tell();
        }
    }
