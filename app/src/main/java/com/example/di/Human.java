package com.example.di;

public class Human {

    String name;
    int age;
    int weight;

    private final HairStyle hairStyle;

    public Human(String name, int age, int weight, HairStyle hairStyle) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.hairStyle = hairStyle;
    }
    
}
