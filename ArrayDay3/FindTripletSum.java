package ArrayDay3;

class Triplet{
    public static int Triplet(int[] arr, int x){
        int cnt=0;
        int n= arr.length;
        for(int i=0; i<n; i++){
            for(int j= i+1; j<n; j++){
                for(int k= j+1; k<n; k++){
                    if(arr[i] + arr[j] + arr[k] == x){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
public class FindTripletSum {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,3};
        int x= 12;
        int ans = Triplet.Triplet(arr, x);
        System.out.println(ans);
    }
}
