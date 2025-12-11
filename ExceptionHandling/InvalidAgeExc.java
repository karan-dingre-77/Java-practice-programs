package ExceptionHandling;

class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}
class UnderAgeException extends Exception{
    UnderAgeException(String msg){
        super(msg);
    }
}
class EntryOnAge{
    void checkAge(int age) throws InvalidAgeException, UnderAgeException{
        if(age<0||age>150){
            throw new InvalidAgeException("invalid age");
        }else if(age<18) {
            throw new UnderAgeException("this is not in under allowed age");
        }else{
            System.out.println("user is allowed");
        }
    }

}
public class InvalidAgeExc {
    public static void main(String[] args) {
        EntryOnAge entryOnAge = new EntryOnAge();
        try{
            entryOnAge.checkAge(12);
        } catch (InvalidAgeException | UnderAgeException e) {
            e.printStackTrace();
        }
    }
}
