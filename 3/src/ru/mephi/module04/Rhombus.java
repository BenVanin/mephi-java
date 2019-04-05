package ru.mephi.module04;

public class Rhombus extends Shape {
    private double a;
    private double degree;

    public Rhombus() {
    }

    public Rhombus(double a, double degree) {
        this.a = a;
        this.degree = degree;
        totalRhombus++;
        totalRmbSquare  = totalRmbSquare + this.getSquare();
        totalRmbPerimeter = totalRmbPerimeter  + this.getPerimeter();
    }

    @Override
    public double getSquare() {
        double square = Math.pow(a,2) * Math.abs(Math.sin(Math.toDegrees(degree)));
        return square;
    }

    @Override
    public double getPerimeter() {
        return 4*a;
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                " a = " + a +
                " degree = " + Math.toDegrees(degree) +
                " square = " + getSquare()+
                " perimeter " + getPerimeter()+
                '}';
    }


    public static void infoAboutRhombus() {
        System.out.println("The list contains " + getTotalRhombus() + " rhombus ; Total square :  " + getTotalRmbSquare() + " " +
                " ; Total perimeter : " +getTotalRmbPerimeter()+ " ; ");

    }

    public static int getTotalRhombus() {
        return totalRhombus;
    }

    public static double getTotalRmbSquare() {
        return totalRmbSquare;
    }

    public static double getTotalRmbPerimeter() {
        return totalRmbPerimeter;
    }

    private static int totalRhombus;
    private static double totalRmbSquare;
    private static double totalRmbPerimeter;
}
