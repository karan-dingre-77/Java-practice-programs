package ExceptionHandling;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
public class InsufficientBalance{
   void withdraw(int withdrawAmount)throws InsufficientBalanceException{
       int currentAmount = 2000;
      if(withdrawAmount<=currentAmount){
          System.out.println("withdraw successfully..!!");
      }else {
          throw new InsufficientBalanceException("Insufficient Bank balance..!!");
      }
   }
    public static void main(String[] args) {
        InsufficientBalance obj = new InsufficientBalance();
        try{
            obj.withdraw(50000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed! Reason: ");
            e.printStackTrace();
        }
    }
}
