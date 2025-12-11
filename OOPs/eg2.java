package OOPs;

class CalcGrade{
    int m1 = 40;
    int m2 = 54;
    int m3 = 60;
    int m4 = 98;
    int m5 = 78;
    int totalMarks;
    void showGrade(){
        int gradeMarks = totalMarks/5;
        if(gradeMarks>=90){
            System.out.println(" Grade : A");
        }else if(gradeMarks>=80){
            System.out.println(" Grade : B");
        }else if(gradeMarks>=60){
            System.out.println(" Grade : C");
        }else if(gradeMarks>=40){
            System.out.println(" Grade : D");
        }else {
            System.out.println("Fail");
        }
    }
    void totalMarks(){
        totalMarks = m1 + m2 + m3 + m4 + m5;
        System.out.println("Total marks : "+totalMarks);
    }
}
public class eg2 {
    public static void main(String[] args) {
        CalcGrade calcGrade = new CalcGrade();
        calcGrade.totalMarks();
        calcGrade.showGrade();
    }
}
