package com.company;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    int getArea(){
        return length * width;
    }
}
