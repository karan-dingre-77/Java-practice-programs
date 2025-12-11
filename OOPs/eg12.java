package OOPs;

interface Notification{
   public void notifyUser();
   int num =10;
}
class EmailNotification implements Notification{
   public void notifyUser(){
        System.out.println("notified via Email..");
    }
}
class SMSNotification implements Notification{
    public void notifyUser(){
        System.out.println("notified via SMS..");
    }
}
public class eg12 {
    public static void main(String[] args) {
        System.out.println(Notification.num);
        System.out.println(EmailNotification.num);
        EmailNotification emailNotification = new EmailNotification();
        emailNotification.notifyUser();
        SMSNotification smsNotification = new SMSNotification();
        smsNotification.notifyUser();
        System.out.println(smsNotification.num);
    }
}
