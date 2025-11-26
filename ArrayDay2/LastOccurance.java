package ArrayDay2;

class LOccurance{
    public static int lOccurance(int[] arr, int x){
        int ocnt = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                ocnt=i;
            }
        }
        return ocnt;
    }
}
public class LastOccurance{
    public static void main(String[] args) {
        int x=1;
        int[] arr = {5,1,2,2,3,4,2,1};
        System.out.println("Occured at index number "+LOccurance.lOccurance(arr, x));   
    }
}