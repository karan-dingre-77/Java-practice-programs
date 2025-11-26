package ArrayDay2;

class IsSorted{
    public static boolean isSorted(int[] arr){
        int lnum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=lnum){
                lnum=arr[i];
            }else{
                return false;
            }
        }
         return true;
    }
}
public class CheckSorted {
    public static void main(String[] args) {
        int arr[] = {1,2,2,5,3,4,5,5};
        boolean flag = IsSorted.isSorted(arr);
        if(flag==true){
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
    }
}
