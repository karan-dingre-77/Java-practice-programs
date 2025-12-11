package OOPs;

class Vehicle{
    void baseClass(){
        System.out.println("this is the base class");
    }
}
class Ccar extends Vehicle{
    void car(){
        System.out.println("this it the car class");
    }
}
class ElectricCar extends Ccar{
    void electricalcar(){
        System.out.println("this is the electrical car class");
    }
}
public class eg8 {
    public static void main(String[] args) {
        ElectricCar ecar = new ElectricCar();
        ecar.baseClass();
        ecar.car();
        ecar.electricalcar();
    }
}
