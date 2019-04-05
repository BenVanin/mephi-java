package ru.mephi.module04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class Main {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        List <  Shape > figureList = new ArrayList<>();

       do {
           System.out.println("What the figure do you want to create ? ");
           System.out.println("Rectangle -> rec ; Circle -> c ; Triangle -> t ; Rhombus -> rmb ;");
           String figureType = scanner.nextLine().trim();


           try {
               switch (figureType) {
                   case "rec":
                       System.out.println("Please, enter rectangle length and width through the space :  ");
                       String dataParameters = new BufferedReader(new InputStreamReader(System.in)).readLine();
                       addRectangle(dataParameters, figureList);
                       break;
                   case "c":
                       System.out.println("Please, enter the radius of circle  :  ");
                       dataParameters = new BufferedReader(new InputStreamReader(System.in)).readLine();
                       addCircle(dataParameters, figureList);
                       break;
                   case "t":
                       System.out.println("Please, enter sides of the triangle through the space :  ");
                       dataParameters = new BufferedReader(new InputStreamReader(System.in)).readLine();
                       addTriangle(dataParameters, figureList);
                       break;
                   case "rmb":
                       System.out.println("Please, enter  the side and degree of the rhombus through the space :  ");
                       dataParameters = new BufferedReader(new InputStreamReader(System.in)).readLine();
                       addRhombus(dataParameters, figureList);
                       break;
                   default:
                       System.out.println("Can't create this figure. Please, try it again.");
               }
           } catch (IOException e) {
               System.out.println("Invalid format of the parameters...");
           }
           System.out.println("Add another figure? (yes) To complete, enter the command (no) ");
       } while (scanner.nextLine().trim().equals("yes"));


        System.out.println();
        double sumSquare = .0;
        if (figureList.isEmpty())
            System.out.println("You haven't added one figure to the list.");
        else {
            System.out.println("You have added the following figures :");

            for (int i = 0; i < figureList.size(); i++) {
                sumSquare = sumSquare + figureList.get(i).getSquare();
                System.out.println(figureList.get(i).toString());
            }
            System.out.println("Total figures in the list : " + figureList.size() + " ; " +
                    "Total square of figures : " + sumSquare + " ;");
        }
        System.out.println();
        System.out.println("Info about each figure type : ");
        Rectangle.infoAboutRectangle();
        Circle.infoAboutCircle();
        Triangle.infoAboutTriangle();
        Rhombus.infoAboutRhombus();
    }

    private static void addRectangle(String data,List<? super Shape> figureList){
        Matcher matcher = Pattern.compile("\\s*(\\d+\\.?\\d*)\\s+(\\d+\\.?\\d*)\\s*").matcher(data);
            if (matcher.matches()) {
                   double[] parameters = {Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2))};
                   Rectangle rectangle = new Rectangle(parameters[0], parameters[1]);
                   figureList.add(rectangle);
                System.out.println("Successfully added to the list");
               } else {
                   System.out.println("Can't create Rectangle with such parameters ");
               }
    }

    private static void addCircle(String data,List< ? super Shape> figureList) {
        Matcher matcher = Pattern.compile("\\s*(\\d+(\\.\\d+)*)\\s*").matcher(data);
        if (matcher.matches()) {
                double parameter = Double.parseDouble(matcher.group(1));
                Circle circle = new Circle(parameter);
                figureList.add(circle);
               System.out.println("Successfully added to the list");
            } else {
                System.out.println("Can't create circle with such parameter ");
            }
    }

    private static void addTriangle(String data,List<? super Shape> figureList) {
        Matcher matcher = Pattern.compile("\\s*(\\d+\\.?\\d*)\\s+(\\d+\\.?\\d*)\\s+(\\d+\\.?\\d*)\\s*").matcher(data);
        if (matcher.matches()) {
                double[] parameters = {Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)),Double.parseDouble(matcher.group(3))};
                 Triangle triangle = new Triangle(parameters[0],parameters[1],parameters[2]);
                 figureList.add(triangle);
            System.out.println("Successfully added to the list");
            } else {
                System.out.println("Can't create Triangle with such parameters ");
            }
    }
    private static void addRhombus(String data,List<? super Shape> figureList) {
        Matcher matcher = Pattern.compile("\\s*(\\d+\\.?\\d*)\\s+(\\d+\\.?\\d*)\\s*").matcher(data);
        if (matcher.matches()) {
            double[] parameters = {Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2))};
            Rhombus rhombus = new Rhombus(parameters[0],parameters[1]);
            figureList.add(rhombus);
            System.out.println("Successfully added to the list");
        } else {
            System.out.println("Can't create Rhombus with such parameters ");
        }
    }



}

