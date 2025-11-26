package ArrayDay2;

import java.util.Scanner;

class CountElm{
    public static int retCnt(int[] arr, int x){
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                cnt++;
            }
        }
        return cnt; 
    }
}
public class CountElmnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check how many it occurs in array");
        int x = sc.nextInt();
        int[] arr = {24,43,45,67,43,43};
        int cnt = CountElm.retCnt(arr, x);
        System.out.println(cnt);
        sc.close();
    }
}
