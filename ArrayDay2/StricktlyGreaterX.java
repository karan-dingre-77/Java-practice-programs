package ArrayDay2;

class GreatX{
    public static int greatX(int[] arr, int x){
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>x){
                cnt++;
            }
        }
        return cnt;
    }
}
public class StricktlyGreaterX {
    public static void main(String[] args) {
        int[] arr = {2,9,3,5,6,7,8,9};
        int x=3;
        System.out.println(GreatX.greatX(arr, x));
    }
}
