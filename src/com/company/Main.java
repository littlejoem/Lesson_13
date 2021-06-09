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
        }
    }
