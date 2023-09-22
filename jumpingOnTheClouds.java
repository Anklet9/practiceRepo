import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        
        while(tc-- > 0){
            int n=sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(noOfJumps(n,arr));
        }
    }
    public static int noOfJumps(int n,int []arr){
        int count=0;
        for(int i=0;i<n-1;i++,count++){
            if(i+2<n && arr[i+2]==0){
                i++;
            }
        }
        return count;
    }
}




















