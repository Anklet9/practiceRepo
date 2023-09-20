import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int arr [] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            System.out.println(summerInternship(n,arr));
        }
    }
    public static String summerInternship(int n,int arr[]){
        int five = 0;
        int ten = 0;
        for(int i :arr){
            if(i == 5){
                five++;
            }else if(i == 10){
                if(five > 0){
                    five--;
                    ten++;
                }else{
                    return "NO";
                }
            }else if( i == 20){
                if(ten > 0 && five > 0){
                    ten--;
                    five--;
                }else if(five >= 3){
                    five -=3;
                }else{
                    return "NO";
                }
            }
        }
        
        return "YES";
    }
}
