package ArrayDay3;

class FindReptd{
    public static int findRep(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
public class FindReatedValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3,4,4};
        System.out.println(FindReptd.findRep(arr));
    }
}
