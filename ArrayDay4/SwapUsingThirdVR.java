package ArrayDay4;

class SwapUsingVar{
    public static void swapUsingThirdVar(int a, int b){
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
public class SwapUsingThirdVR {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        SwapUsingVar.swapUsingThirdVar(a, b);
    }
}
