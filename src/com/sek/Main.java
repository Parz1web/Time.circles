package com.sek;

public class Main {

    public static void main(String[] args) {
	Circle c1 = new Circle(2, "синий");
        System.out.println(c1.getRadius() + "  " + c1.getColor() + "   " + c1.getArea());
    Circle c2 = new Circle(2);
        System.out.println(c2.getRadius() + "  " + c2.getColor() + "   " + c2.getArea());
    Circle c3 = new Circle();
        System.out.println(c3.getRadius() + "  " + c3.getColor() + "   " + c3.getArea());
    }



}
