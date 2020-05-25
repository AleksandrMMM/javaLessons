package com.lessons.lessons1;

public class Lessons1 {

    public static void main (String[] args) {

        short i = 1245;
        int y = 123466666;

        short u = (short) y;
        System.out.println(u);

        boolean w = true;
        w = 4 < 5;
        System.out.println(w);

        w = 4 > 5;
        System.out.println(w);

        w = 4==4;
        System.out.println(w);

        w = 4 != 5;
        System.out.println(w);

       int t = 5;
        t = ++t + ++t;
        System.out.println(t); // 13

    }
}
