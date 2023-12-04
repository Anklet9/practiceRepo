import java.util.*;

public class BeautifulArrangements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countBeautifulArrangements(n));
        scanner.close();
    }

    public static int countBeautifulArrangements(int n) {
        boolean[] visited = new boolean[n + 1];
        return process(1, visited);
    }

    private static int process(int start, boolean[] visited) {
        if (start == visited.length) {
            return 1;
        }
        int count = 0;
        for (int i = 1; i < visited.length; i++) {
            if (!visited[i] && (start % i == 0 || i % start == 0)) {
                visited[i] = true;
                count += process(start + 1, visited);
                visited[i] = false;
            }
        }
        return count;
    }
}



