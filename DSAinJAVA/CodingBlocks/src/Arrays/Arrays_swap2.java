package Arrays;

public class Arrays_swap2 {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        int[] other={100,200,300,400,500};
        System.out.println(arr[0] + " "+arr[1]);
        swap(arr,other);                       //Here we are swapping using local variable so we are not changeing in main fn
        System.out.println(arr[0] + " "+arr[1]);
    }
    public static void swap(int[] arr,int[] other){
        int[] temp=arr;
        arr=other;
        other=temp;
    }
}
