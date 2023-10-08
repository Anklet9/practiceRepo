import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            decipher(n,s);
            // System.out.println(s.toString());
        }
    }
    public static void decipher(int n,String s){
        StringBuilder str = new StringBuilder();
        int i=0;
        while(i<n){
            char ch = s.charAt(i);
            StringBuilder sb = new StringBuilder();
            i++;
            while(i<n && Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
                i++;
            }
            int count = Integer.parseInt(sb.toString());
            for(int j=0;j<count;j++){
                str.append(ch);
            }
            
        }
        System.out.println(str.toString());
    }
}







