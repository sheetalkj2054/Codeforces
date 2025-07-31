import java.util.*;
public class WeNeedTheZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
 
            int[] a = new int[n];
            int ans = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                ans = ans^a[i];
            }
            if(n%2==1){
                System.out.println(ans);
            }else{
                if (ans == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(-1);
                }
            }
            t--;
        }

        sc.close();
    }
}
