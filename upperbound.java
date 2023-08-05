import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt(), k = sc.nextInt();
       int[] arr = new int[n];
       for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();    
       }
       System.out.println(upperBound(arr,n,k));
    }
    public static int upperBound(int arr[],int n,int k){
        int low = 0;
        int high = n-1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > k) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

}