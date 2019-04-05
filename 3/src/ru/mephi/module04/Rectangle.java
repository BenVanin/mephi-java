package ru.mephi.module04;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle() {
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        totalRectangle++;
        totalRecSquare = totalRecSquare + this.getSquare();
        totalRecPerimeter = totalRecPerimeter + this.getPerimeter();
    }


    @Override
    public double getSquare() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return a + b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                " a = " + a +
                " b = " + b +
                " square = " + getSquare() +
                " perimeter " + getPerimeter() +
                '}';
    }


    public static void infoAboutRectangle() {
        System.out.println("The list contains " + getTotalRectangle() + " rectangles ; " +
                " ; Total square :  " + getTotalRecSquare() + " Total perimeter : " +getTotalRecPerimeter()+" ; ");

    }

    public static int getTotalRectangle() {
        return totalRectangle;
    }

    public static double getTotalRecSquare() {
        return totalRecSquare;
    }

    public static double getTotalRecPerimeter() {
        return totalRecPerimeter;
    }

    private static int totalRectangle ;
    private static double totalRecSquare ;
    private static double totalRecPerimeter ;

}

