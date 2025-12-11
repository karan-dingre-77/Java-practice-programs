package OOPs;

class Employee{
    private int id =1;
    private String name;
    private double sallary;
    void setName(String name){
        this.name = name;
    }
    void setSallary(int sallary){
        this.sallary = sallary;
    }
    String getName(){
        return name;
    }
    double getSallary(){
        if(sallary>0)
            return sallary ;
        else
            System.out.println("failed!");
        return 0;
    }
}
public class eg6 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("karan");
        System.out.println(employee.getName());
        employee.setSallary(90000);
        System.out.println(employee.getSallary());
    }
}
