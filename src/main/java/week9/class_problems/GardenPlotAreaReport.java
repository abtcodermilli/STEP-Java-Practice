package week9.class_problems;

import java.util.*;

public class GardenPlotAreaReport {
    static abstract class Plot {
        String owner, shape;
        abstract double area();
    }
    static class Circle extends Plot {
        double radius;
        Circle(String owner, double radius) { this.owner=owner; this.shape="CIRCLE"; this.radius=radius; }
        @Override double area() { return Math.PI * radius * radius; }
    }
    static class Rectangle extends Plot {
        double length, width;
        Rectangle(String owner, double length, double width) { this.owner=owner; this.shape="RECTANGLE"; this.length=length; this.width=width; }
        @Override double area() { return length * width; }
    }
    static class Triangle extends Plot {
        double base, height;
        Triangle(String owner, double base, double height) { this.owner=owner; this.shape="TRIANGLE"; this.base=base; this.height=height; }
        @Override double area() { return base * height / 2; }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String owner = sc.next();
            Plot plot;
            switch (type) {
                case "CIRCLE": plot = new Circle(owner, sc.nextDouble()); break;
                case "RECTANGLE": plot = new Rectangle(owner, sc.nextDouble(), sc.nextDouble()); break;
                case "TRIANGLE": plot = new Triangle(owner, sc.nextDouble(), sc.nextDouble()); break;
                default: throw new IllegalArgumentException("Unknown shape");
            }
            double area = plot.area();
            total += area;
            System.out.printf(Locale.US, "%s (%s): %.2f%n", plot.owner, plot.shape, area);
        }
        System.out.printf(Locale.US, "Total Area: %.2f%n", total);
        sc.close();
    }

}
