package OOPs;

abstract class Emp{
    abstract void calculateSallary();
}
class Fulltimesallary extends Emp{
    void calculateSallary(){
        System.out.println("Full time sallary");
    }
}
class Parttimesallary extends Emp{
    void calculateSallary(){
        System.out.println("part time job sallary");
    }
}
public class eg14 {
    public static void main(String[] args) {
        Fulltimesallary obj1 = new Fulltimesallary();
        obj1.calculateSallary();
        Parttimesallary obj2 = new Parttimesallary();
        obj2.calculateSallary();
    }
}
