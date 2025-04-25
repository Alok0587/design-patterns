package com.creational.prototype;

public class Verify {
    public static void main(String[] args) {
        com.creational.prototype.Shape circle = new com.creational.prototype.Circle(10);
        com.creational.prototype.Shape rectangle = new com.creational.prototype.Rectangle(12);

        com.creational.prototype.Shape circleClone = circle.clone();
        com.creational.prototype.Shape rectangleClone = rectangle.clone();

        circleClone.draw();
        rectangleClone.draw();

        System.out.println(circleClone+"->"+circle);
        System.out.println(rectangleClone+"->"+rectangle);

    }
}
