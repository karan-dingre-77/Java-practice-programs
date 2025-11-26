package ArrayDay1;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {45,23,75,35,85,35};
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum number is : "+max);
    }
}
