package OOPs;

interface Database{
    void connect();
    void disconnect();
}
class Mysql implements Database {
    public void connect(){
        System.out.println("connected to Mysql database");
    }
    public void disconnect(){
        System.out.println("disconnected from Mysql database");
    }
}
class postgreSql implements Database{
    public void connect(){
        System.out.println("postgreSql connected");
    }
    public void disconnect(){
        System.out.println("postgreSql disconnected");
    }
}
public class eg16 {
    public static void main(String[] args) {
        Mysql mysql = new Mysql();
        postgreSql postgreSql = new postgreSql();
        mysql.connect();
        mysql.disconnect();
        postgreSql.connect();
        postgreSql.disconnect();
    }
}
