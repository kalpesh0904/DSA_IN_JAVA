package Arrays;

public class Array_swap1 {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        System.out.println(arr[0] + " "+arr[1]);
        swap(arr,0,1);                       //Here we are swapping using local variable so we are not changeing arr
        System.out.println(arr[0] + " "+arr[1]);
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
