package ArrayDay3;

class FindU{
    public static void findUni(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}
public class FindUnique {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,1,2,3,4,4,9};
        FindU.findUni(arr);
    }
}
