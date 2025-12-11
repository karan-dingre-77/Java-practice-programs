package OOPs;

class Calculator{
    void add(){
        System.out.println("called with no parameter..");
    }
    void add(int num1){
        System.out.println("parameterized with one parameters : " + num1);
    }
    void add(int num1, int num2){
        System.out.println("parameterized which two parameters : " + num1 + " " + num2);
    }
}
public class eg11 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add();
        calculator.add(12);
        calculator.add(12,45);
    }
}
