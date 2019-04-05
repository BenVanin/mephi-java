package ru.mephi.module04;

public class Circle extends Shape{

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
        totalCircle++;
        totalCircSquare = totalCircSquare + this.getSquare();
        totalCircPerimeter = totalCircPerimeter+ this.getPerimeter();
    }


    @Override
    public double getSquare() {
         double square = Math.PI * Math.pow(radius,2);
        return square ;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius = " + radius +
                " square = " + getSquare()+
                " perimeter " + getPerimeter()+
                '}';
    }


    public static void infoAboutCircle() {

        System.out.println("The list contains " + getTotalCircle() + " circles ; " +
                " Total square :  " + getTotalCircSquare() + " ; Total perimeter : " +getTotalCircPerimeter()+" ; ");

    }

    public static int getTotalCircle() {
        return totalCircle;
    }

    public static double getTotalCircSquare() {
        return totalCircSquare;
    }

    public static double getTotalCircPerimeter() {
        return totalCircPerimeter;
    }

    private static int totalCircle;
    private static double totalCircSquare;
    private static double totalCircPerimeter;
}
