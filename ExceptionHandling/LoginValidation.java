package ExceptionHandling;

class LoginAuthenticationFailedException extends Exception{
    LoginAuthenticationFailedException(String msg){
        super(msg);
    }
}
public class LoginValidation {
   static void login(String userName, String password) throws LoginAuthenticationFailedException{
        if(userName==null || password==null || userName.isEmpty() || password.isEmpty() ){
            throw new NullPointerException("credentials missing");
        }
        String validUser = "karan";
        String validPassword= "123456";
        if(!userName.equals(validUser) || !password.equals(validPassword)){
            throw new LoginAuthenticationFailedException("login authentication failed");
        }
    }
    public static void main(String[] args) {
        try{
            LoginValidation.login("karan", "123456");
        } catch (LoginAuthenticationFailedException e) {
            System.out.println(" Error : " + e.getMessage());
        }
    }
}
