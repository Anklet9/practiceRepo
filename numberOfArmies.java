import java.util.Scanner;

public class numberOfArmies {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] ==1){
                    dfs(arr,i,j,n,m);
                    count++;
                }   
            }
        }
        System.out.println(count);
    }
    public static void dfs(int [][]arr,int i,int j,int n,int m){
        if(i>=0 && i<n && j>=0 && j<m && arr[i][j] == 1){
            arr[i][j] = 0;
            dfs(arr,i,j+1,n,m);
            dfs(arr,i,j-1,n,m);
            dfs(arr,i-1,j,n,m);
            dfs(arr,i+1,j,n,m);
        }
        return;
    }
}