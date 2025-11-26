package ArrayDay4;

class RevArr{
    public static int[] revArr(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j=0;
        for(int i=n-1; i>=0; i--){
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void printArray(int[] ans){
         for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
public class ReversTheArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
       int[] ans = RevArr.revArr(arr);
       RevArr.printArray(ans);
    }
}
