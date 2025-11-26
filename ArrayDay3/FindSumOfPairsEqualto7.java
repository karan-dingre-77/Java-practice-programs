package ArrayDay3;

class FindSum{
    public static void findSum(int arr[], int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if((arr[i] + arr[j]) == x){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
public class FindSumOfPairsEqualto7 {
    public static void main(String[] args) {
        int x=12;
        int[] arr = {1,3,6,6,4,8,11};
        FindSum.findSum(arr,x);
        System.out.println("hello");
    }
}
