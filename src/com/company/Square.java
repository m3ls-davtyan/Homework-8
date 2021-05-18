package com.company;

public class Square extends Shape {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setArea() {
        area = Math.pow(a, 2);
    }

    public void setPerimeter() {
        perimeter = (4 * a);
    }
}
