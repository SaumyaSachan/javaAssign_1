package javaAssign3;

class MathOperations {
    // Overloaded method with two parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with different data type
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.add(5, 10));         // Calls add(int, int)
        System.out.println(math.add(5, 10, 15));     // Calls add(int, int, int)
        System.out.println(math.add(5.5, 2.3));      // Calls add(double, double)
    }
}
