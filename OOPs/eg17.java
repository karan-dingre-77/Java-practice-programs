package OOPs;

class Phone{
    void features(){
        System.out.println("this is the phone features..");
    }
}
class SmartPhone extends Phone{
    void features(){
        System.out.println("this is the smartphone features..");
    }

}
public class eg17 {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        obj.features();
        SmartPhone obj2 = new SmartPhone();
        obj2.features();
    }
}
