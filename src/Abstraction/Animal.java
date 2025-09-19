package Abstraction;

abstract class Animal {
    abstract void sound();   
    void breathe() {         
        System.out.println("All animals breathe.");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark!");
    }
}

