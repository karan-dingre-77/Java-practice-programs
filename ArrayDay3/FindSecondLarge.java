package ArrayDay3;
class FindSecLarge{
    public static int retMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int secM(int[] arr){
        int max = retMax(arr);
         for(int i=0; i<arr.length; i++){
            if(arr[i]==max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secMax = retMax(arr);
        return secMax;
    }
}
public class FindSecondLarge {
    public static void main(String[] args) {
        int[] arr= {1,2,8,3,4,5};
        System.out.println(FindSecLarge.secM(arr));
    }
}
