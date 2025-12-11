package OOPs;

class Animal{
    void walk(){
        System.out.println("Animal walking...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("dog barking...");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("car meow...");
    }
}
public class eg9 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.walk();
        dog.bark();
        System.out.println();
        Cat cat = new Cat();
        cat.walk();
        cat.meow();
    }
}
