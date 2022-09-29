package com.example.animallist;

public class Animal {
    String name;
    String color;
    String desc;

    public Animal(String name, String color, String desc) {
        this.name = name;
        this.color = color;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
