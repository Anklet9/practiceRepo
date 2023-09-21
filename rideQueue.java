import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(rideQueue(n,arr));
        }
    }
    public static int rideQueue(int n ,int arr[]){
        int count = 0;
        for(int i=0;i<n;){
            int j=i+1;
            while(j<n && arr[j]>arr[j-1]){
                j++;
            }
            count++;
            i=j;
        }
        return count;
    }
}