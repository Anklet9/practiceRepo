// Common Start 
// Description
// You along with your three friends go to a fair. There you find a magic vessel which has an infinite number of balls of three colours- Red, Black, Yellow. Three of you take turns to go inside and gets some balls out of the vessel. After you exit the fair you compare the order of the balls all of you got. You want to find the longest common start that all three of you had inLog(n)time.
// Let me clear this with an example- Suppose your order of the balls was - rbyybr i.e. First you got a red ball, then a black ball, then two yellow and so on. One of your friends had the order rbbrybr. This means both of you had the longest common start of rb.
// Note-You only need to calculate the coincidence in the orders that happened in the start i.e. rbyrbr and ybbryy have no common start.

// Input
// First line contains the number of cases (t)
// Next t lines will have three strings separated with space

// Output
// You need to output t lines which has the longest common start which all three had.
// If there is none, then output - "None" (without quotes)
// t <= 1000000
// Length of a string <= 30

// Sample Input 1 
// 1
// rbbyrrby rbb rbbybbryb
// Sample Output 1
// rbb


import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after reading t

        for (int i = 0; i < t; i++) {
            String[] inputs = scanner.nextLine().split(" ");
            String s1 = inputs[0];
            String s2 = inputs[1];
            String s3 = inputs[2];
            String result = findLongestCommonStart(s1, s2, s3);
            System.out.println(result);
        }

        scanner.close();
    }

    public static String findLongestCommonStart(String s1, String s2, String s3) {
        int left = 0;
        int right = Math.min(Math.min(s1.length(), s2.length()), s3.length());
        String commonStart = "";

        while (left <= right) {
            int mid = (left + right) / 2;
            if (isCommonPrefix(s1.substring(0, mid), s2.substring(0, mid), s3.substring(0, mid))) {
                commonStart = s1.substring(0, mid);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return commonStart.isEmpty() ? "None" : commonStart;
    }

    public static boolean isCommonPrefix(String prefix, String s1, String s2) {
        return s1.startsWith(prefix) && s2.startsWith(prefix);
    }
}

