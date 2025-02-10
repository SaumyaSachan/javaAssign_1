package javaAssign4;



public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();    // Polymorphism: Shape reference to Circle object
        Shape rectangle = new Rectangle();  // Polymorphism: Shape reference to Rectangle object

        circle.draw();
        rectangle.draw();
    }
}
