package OOPs;

class BankAccount{
    int totalBalance=500;
    void deposite(int deposite){
        totalBalance += deposite;
        System.out.println("You have added " + deposite + "rs successfully..");
    }
    void withdraw(int withdraw){
        if(withdraw<totalBalance){
            totalBalance -= withdraw;
            System.out.println("You have withdraw " + withdraw + "rs successfully..");
        }else {
            System.out.println("Balance cannot go negative");
        }
    }
    int getBalance(){
        int totalBalance1 = totalBalance;
        return totalBalance1;
    }
}
public class eg3 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Total available balance in your account is : " + bankAccount.getBalance());
        bankAccount.deposite(200);
        System.out.println("Total available balance in your account is : " + bankAccount.getBalance());
        bankAccount.withdraw(300);
        System.out.println("Total available balance in your account is : " + bankAccount.getBalance());
        bankAccount.withdraw(300);
        System.out.println("Total available balance in your account is : " + bankAccount.getBalance());
        bankAccount.deposite(200);
        System.out.println("Total available balance in your account is : " + bankAccount.getBalance());

    }
}
