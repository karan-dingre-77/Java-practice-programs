package ArrayDay1;

public class FindGivenElmnt {
    public static void main(String[] args) {
        int[] arr = {45,23,75,35,85,35,35};
        int x=35;
        int ans=0;
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                ans = i;
                cnt++;
                break;
            }
        }
        if(cnt>0){
            System.out.println("element presented at index : " + ans);
            // System.out.println(cnt + " times");
        }else{
            System.out.println("element not founded");
        }
        
    }
}
