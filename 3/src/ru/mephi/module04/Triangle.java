package ru.mephi.module04;

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        totalTriangle++;
        totalTrianSquare = totalTrianSquare + this.getSquare();
        totalTrianPerimeter = totalTrianPerimeter + this.getPerimeter();
    }

    private double semiPerimeter = (a + b + c)/2;

    @Override
    public double getSquare() {
        double square;
        square = Math.sqrt(semiPerimeter*(semiPerimeter - a)*(semiPerimeter - b) *(semiPerimeter - c));
        return square;
    }

    @Override
    public double getPerimeter() {
        return semiPerimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a = " + a +
                " b = " + b +
                " c = " + c +
                " square = " + getSquare()+
                " perimeter " + getPerimeter()+
                '}';
    }


    public  static void infoAboutTriangle() {

        System.out.println("The list contains " + getTotalTriangle() + " triangles ; Total square :  "
                + getTotalTrianSquare() + " ; Total perimeter : " + getTotalTrianPerimeter()+" ; ");

    }

    public static int getTotalTriangle() {
        return totalTriangle;
    }

    public static double getTotalTrianSquare() {
        return totalTrianSquare;
    }

    public static double getTotalTrianPerimeter() {
        return totalTrianPerimeter;
    }

    private static int totalTriangle;
    private static double totalTrianSquare;
    private static double totalTrianPerimeter;

}
