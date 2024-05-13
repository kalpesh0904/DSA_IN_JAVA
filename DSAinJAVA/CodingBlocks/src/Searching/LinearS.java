package Searching;
import java.util.*;

public class LinearS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        for(int i =0; i< arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found at " + i);
                return;
            }
        }
        System.out.println("Element not found");
         // This line is optional as the program will naturally end after the previous return
    }
}

