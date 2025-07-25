import java.util.*;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            long n = sc.nextLong(); // Number of boxes
            long k = sc.nextLong(); // Max length of subarray that can be reversed

            long[] a = new long[(int) n]; // Original array
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long[] copyA = Arrays.copyOf(a, (int) n); // Copy of the array
            Arrays.sort(copyA); // Sort the copied array

            if (Arrays.equals(a, copyA) || k > 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
