package com.company;

    public class Main {
        public static void main(String[] args) {
            Math zx = new Math();
            final int xx = 99;
            int x = Math.summ(12, 23);
            System.out.println(x);
            System.out.println(zx.mult(12, 23));
            Math a = new Math();
            Math aa = new Math();
            Math aaa = new Math();
            System.out.println(a.y);
            System.out.println(aa.yy);
            System.out.println(aaa.yy);
            a.y = 24;
            aa.yy = 26;
            aaa.yy = 28;
            System.out.println(a.y);
            System.out.println(aa.yy);
            System.out.println(Math.y);
            System.out.println(aaa.yy);
        }
    }
