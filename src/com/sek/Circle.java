package com.sek;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1;
        this.color = "красный";
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    };

    public String getColor(){
        return color;
    }
    public double getArea(){
        return Math.pow(this.radius, 2)*3.14;
    }

    @Override
    public String toString() {
        return "Наш круг{" +
                "Радиус нашего круга=" + radius +
                ", Цвет нашего круга='" + color + '\'' +
                '}';
    }
}
