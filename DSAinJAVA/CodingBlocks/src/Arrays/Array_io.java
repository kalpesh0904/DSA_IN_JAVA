package Arrays;
import java.util.Scanner;
public class Array_io {
    public static void main(String[] args) {
//        int[] arr ={1,2,3,4,5};
//       int[] arr = new int[5];
//        System.out.println(arr);//returns address
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
       Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter size of an Array:");
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i =0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }
       Display(arr);
    }
    public static void Display(int[] arr){
        for(int i =0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
