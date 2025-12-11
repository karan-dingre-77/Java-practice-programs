package OOPs;
class Car{
    int vehicle_number;
    Car(int Vnumber){
        vehicle_number = Vnumber;
    }
    void startEngine(){
        System.out.println("car started...");
        System.out.println("it's number is " + vehicle_number);
    }
}
public class eg5 {
    public static void main(String[] args) {
        Car obj = new Car(2453);
        obj.startEngine();
    }
}
