package com.creational.prototype;

public class Rectangle implements com.creational.prototype.Shape {
    public int area;

    public Rectangle(int area) {
        this.area = area;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public com.creational.prototype.Shape clone() {
        return new Rectangle(this.area);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + area +
                '}';
    }
}
