package ExceptionHandling;

class InvalidNameException extends Exception{
    InvalidNameException(String msg){
        super(msg);
    }
}
class InvalidAgeException1 extends Exception{
    InvalidAgeException1(String msg){
        super(msg);
    }
}
class InvalidEmailException extends Exception{
    InvalidEmailException(String msg){
        super(msg);
    }
}
class CheckLoginInfo{
    static void checkLoginInfo(String name, int age, String Email) throws InvalidNameException, InvalidAgeException1, InvalidEmailException{
        if(name.matches(".*\\d.*")){
            throw new InvalidNameException("Name should not contain numbers.");
        }
        if(age<5){
            throw new InvalidAgeException1("Age must be at least 5.");
        }
        if(!Email.contains("@")){
            throw new InvalidEmailException("Invalid email format. '@' is missing.");
        }
        System.out.println("Login successfully..");
    }
}
public class LoginForm {
    public static void main(String[] args) {
        CheckLoginInfo obj = new CheckLoginInfo();
        try{
            obj.checkLoginInfo("karan", 3, "karan@gmail.com");
        }  catch (InvalidNameException | InvalidAgeException1 | InvalidEmailException e) {
            System.out.println("Name Error: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
