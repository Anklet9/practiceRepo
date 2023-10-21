import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        char[] arr = input.toCharArray();
        warOfMinion(n, arr);
    }

    public static void warOfMinion(int n, char[] arr) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (!stack.isEmpty() && stack.peek() == arr[i]) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }
        if (stack.isEmpty()) {
            System.out.println(-1);
        } else {
            StringBuilder result = new StringBuilder();
            for (Character character : stack) {
                result.append(character);
            }
            System.out.println(result);
        }
    }
}
