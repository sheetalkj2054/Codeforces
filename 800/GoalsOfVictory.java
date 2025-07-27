import java.util.*;

public class GoalsOfVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); // Number of test cases
        while (t > 0) {
            int n = sc.nextInt();
 
            int[] a = new int[n];
            int k = 0;
            for (int i = 0; i < n-1; i++) {
                a[i] = sc.nextInt();
                k = k + a[i];
            }
            System.out.println(-k);
            
            t--;
        }
 
        sc.close();
    }
}