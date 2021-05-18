package com.company;

public class Circle extends Shape {
    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setArea() {
        area = (Math.PI * Math.pow(r, 2));
    }

    public void setPerimeter() {
        perimeter = (2 * Math.PI * r);
    }
}
