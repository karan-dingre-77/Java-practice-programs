package OOPs;

class Payment{
    void pay(){
        System.out.println("This class contains payment features..");
    }
}
class UPIPayment extends Payment{
    void pay(){
        System.out.println("override the payment Class in UPIPayment class");
    }
}
class CardPayment extends Payment{
    void pay(){
        System.out.println("override the payment Class in CardPayment");
    }
}
public class eg10 {
    public static void main(String[] args) {
        UPIPayment upiPayment = new UPIPayment();
        upiPayment.pay();
        CardPayment cardPayment = new CardPayment();
        cardPayment.pay();
    }
}