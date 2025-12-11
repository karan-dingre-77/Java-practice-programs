package OOPs;

import java.util.Scanner;

class User{
   private int password;
    void setPassword(int password){
        this.password = password;
        System.out.println("password set successfully.!");
    }
    void changePassword(int oldPassword, int newPassword){
        if(password == oldPassword){
            password = newPassword;
            System.out.println("password changed successfully..");
        }else{
            System.out.println("Old password does't mathced..");
        }
    }
    void login(int password){
        if(this.password == password){
            System.out.println("loged-in successfully..");
        }else{
            System.out.println("wrong password ! -> enter correct password");
        }
    }
}
public class eg7 {
    public static void main(String[] args) {
       User user = new User();

       System.out.println("Set the password");
       user.setPassword(1234);

       user.changePassword(1234, 2222);

       user.login(2222);
    }
}
