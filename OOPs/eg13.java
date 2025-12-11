package OOPs;

abstract class Animal1{
  abstract void eat();
  abstract void run();
  int num =10;
}
class dog extends Animal1{
    void eat(){
        System.out.println(num);
        System.out.println("eat method");
    }
    void run(){
        System.out.println(num);
        System.out.println("run method");
    }
}
public class eg13 {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.run();

    }
}
