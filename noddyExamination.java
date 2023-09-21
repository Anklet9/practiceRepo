import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(noddyExamination(n,x,arr));
    }
    public static int noddyExamination(int n,int x,int arr[]){
        int c1 = 0;
        int c2 = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<=x){
                c1++;
            }else if(arr[i]>x){
                c2++;
            }if(c2>1){
                break;
            }
        }
        return c1;
        
    }
}
