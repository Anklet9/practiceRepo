import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int arr[] = {3,5,2,1,4};
        int i=0;
        while(i < arr.length){
            if(arr[i]==i+1){
                i++;
            }else{
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i]=temp;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
