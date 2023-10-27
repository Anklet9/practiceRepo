import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int t = 0; t < T; t++) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      GE(n, arr);
    }
  }

  public static void GE(int n, int[] arr) {
    Stack<Integer> stack = new Stack<>();
    int[] result = new int[n];
    Arrays.fill(result, -1);

    for (int i = 0; i < n; i++) {
      while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
        int index = stack.pop();
        result[index] = arr[i];
      }
      stack.push(i);
    }

    System.out.println(Arrays.toString(result));
  }
}