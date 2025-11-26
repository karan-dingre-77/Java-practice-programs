package ArrayDay2;

import java.util.Arrays;

// class SmallandLarge{
//     public static int[] retArr(int[] arr){
//         Arrays.sort(arr);
//         int[] newArr = {arr[0], arr[arr.length-1]};
//         return newArr;
//     }
// }
// public class SmallAndLarge {
//     public static void main(String[] args) {
//         int[] arr = {1,2,4,2,5,4,3};
//         int[] ans = SmallandLarge.retArr(arr);
//         System.out.println(ans[0]);
//         System.out.println(ans[1]);
//     }

class SmallandLarge{
   public static int[] retsm(int[] arr){
    Arrays.sort(arr);
    int[] ans = {arr[0], arr[arr.length-1]};
    return ans;
   }
}
public class SmallAndLarge {
    public static void main(String[] args) {
        int[] arr = {2,35,3,25,1,87,99};
        int[] newarr = SmallandLarge.retsm(arr);
        System.out.println(newarr[0]);
        System.out.println(newarr[1]);
    }
}
