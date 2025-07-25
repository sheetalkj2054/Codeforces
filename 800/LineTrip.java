import java.util.*;
 
public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); // Number of test cases
        while (t > 0) {
            int n = sc.nextInt(); // Number of boxes
            int x = sc.nextInt(); // Max length of subarray that can be reversed
 
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int ans = a[0];
            for(int i=1;i<n;i++){
                ans = Math.max(ans,a[i]-a[i-1]);
            }
            ans = Math.max(ans,2*(x-a[n-1]));
            System.out.println(ans);
            t--;
        }
 
        sc.close();
    }
}