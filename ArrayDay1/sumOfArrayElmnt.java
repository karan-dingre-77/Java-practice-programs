package ArrayDay1;

public class sumOfArrayElmnt {
    public static void main(String[] args) {
        int[] num = {1,5,3};
        int sum =0;
        for(int i=0; i<num.length; i++){
            sum = sum + num[i];
        }
        System.out.println("sum of array elements = " + sum);
    }
}
