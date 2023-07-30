import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.*;

class woodCutter {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(wood_Cutter(arr, n, k));
    }

    public static long wood_Cutter(int arr[], int n, long k) {
        int low = 0;
        int high = Arrays.stream(arr).max().getAsInt();
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            long wc = calculateWood(mid, arr);
            if (wc == k || low == mid) {
                return mid;
            } else if (wc > k) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return -1;
    }

    public static long calculateWood(int mid, int arr[]) {
        long count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) {
                count = count + (arr[i] - mid);
            }
        }
        return count;
    }
}
