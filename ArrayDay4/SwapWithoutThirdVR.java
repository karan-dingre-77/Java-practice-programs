package ArrayDay4;

class SwapWithoutThirdVAR{
    public static void withoudThirdVr(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a + " " + b);
    }
}
public class SwapWithoutThirdVR {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        SwapWithoutThirdVAR.withoudThirdVr(a, b);
    }
}
