package ArrayDay2;

class PrintArrays{
    public void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class References {
    public static void main(String[] args) {
        PrintArrays obj = new PrintArrays();
        int[] arr1 ={1,2,3,4,5};

        int[] arr2 = arr1;
         
        obj.printArr(arr1);
        obj.printArr(arr2);
       
        // changing some values of arr2
        arr2[0]=0;
        arr2[1]=0;

        obj.printArr(arr1);
        obj.printArr(arr2);

    }
}
