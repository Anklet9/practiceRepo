import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
    Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            signalCapacity(n, arr);
        }
    }

    private static void signalCapacity(int n, int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] a = new int[n];
        Arrays.fill(a, 1);

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                a[i] = i + 1;
            } else {
                a[i] = i - stack.peek();
            }
            stack.push(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
