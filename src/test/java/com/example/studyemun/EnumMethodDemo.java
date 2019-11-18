package com.example.studyemun;

public class EnumMethodDemo {
    enum Color {RED, GREEN, BLUE;}
    enum Size {BIG, MIDDLE, SMALL;}

    public static void main(String[] args) {
        System.out.println("============== Print all Color ==============");
        for( Color c : Color.values()){
            System.out.println(c + " ordinal: " + c.ordinal());
        }
    }

}
