package ArrayDay1;

public class ArrayInitialization {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr[0]);
        arr[0]=1;
        System.out.println(arr[0]);

        System.out.println();
        int[] arr1 ={1,2,3,4,5};
        System.out.println(arr1.length);
        for(int i=0; i<5; i++){
            System.out.println(arr1[i]);
        }
        System.out.println("for each loop ");
        for( int age : arr){
            System.out.println(age);
        }
    }
}
