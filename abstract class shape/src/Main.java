// Write a Java program to create an abstract class Shape with abstract
// methods calculateArea() and calculatePerimeter(). Create subclasses
// Circle and Triangle that extend the Shape class and implement the
// respective methods to calculate the area and perimeter of each shape.
abstract class Shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();
    abstract  double Area();
}


class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    double calculateArea() {
        return Math.PI * radius * radius;
    }


    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double Area() {
        return 0;
    }
}
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    private double base;
    private double height;



    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    double calculateArea() {

        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
      double Area() {
        double s = (base * height) /0.5;
        return Math.sqrt(s *(s - base)*(s - height));


    }


    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}


public class Main {
    public static void main(String[] args) {
        double r = 4.0;
        Circle circle = new Circle(r);
        double ts1 = 3.0, ts2 = 4.0, ts3 = 5.0;
        Triangle triangle = new Triangle(ts1, ts2, ts3);
        System.out.println("Radius of the Circle"+r);
        System.out.println("Area of the Circle: " + circle.calculateArea());
        System.out.println("Perimeter of the Circle: " + circle.calculatePerimeter());
        System.out.println("\nSides of the Traiangel are: "+ts1+','+ts2+','+ts3);
        System.out.println("Area of the Triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of the Triangle: " + triangle.calculatePerimeter());
        System.out.println("Area of triangle: " + triangle.Area());


    }
}