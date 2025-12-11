package ExceptionHandling;

public class DevideNumberException {
   static int divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("Cannot divide by zero");
        }else{
            return a/b;
        }
    }
    public static void main(String[] args) {
        try {
            int ans = DevideNumberException.divide(23,0);
            System.out.println(ans);
        }catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Execution completed (finally block executed).");
        }
        System.out.println("Program continues...");
    }
}
