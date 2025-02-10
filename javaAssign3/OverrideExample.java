package javaAssign3;

// Parent class
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class overrides the method
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Calls parent class method

        Animal myDog = new Dog();
        myDog.makeSound(); // Calls overridden method in Dog class
    }
}
