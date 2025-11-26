package ArrayDay4;

class RevAr{
    public static void swapArr(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void revArr(int[] arr){
        int i=0, j=arr.length-1;
        while(i<j){
            swapArr(arr,i,j);
            i++;
            j--;
        }
    }
}
public class ReverseArrWithoutCreatNewArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        RevAr.revArr(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
