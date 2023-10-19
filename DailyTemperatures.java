import java.util.Scanner;
import java.util.Stack;

public class DailyTemperatures {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            dailyTemperatures(n, arr);
        }
    }

    private static void dailyTemperatures(int n, int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            res[i] = !stack.isEmpty() ? stack.peek() - i : 0;
            stack.push(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
