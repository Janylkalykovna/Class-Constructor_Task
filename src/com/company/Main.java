package com.company;

public class Main {

    public static void main(String[] args) {
        Classs classs = new Classs(23, "I am learning Java", new int[]{1, 2, 3, 34, 4, 5});
        System.out.println(classs.getNumber() + ", " + classs.getWord());
        for (int i = 0; i < classs.getArray().length; i++) {
            System.out.print(i + " ");

        }

    }
}