// The same Code will work in C++ lang
import java.util.*;
public class BalancedRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int cur = 1;
            int max = 1;
            for(int i=1;i<n;i++){
                if(a[i]-a[i-1]<=k){
                    cur++;
                }else{
                    max = Math.max(max,cur);
                    cur = 1;
                }
            }
            max = Math.max(max,cur);
            System.out.println(n-max);
            t--;
        }
 
        sc.close();
    }
}
