import java.util.*;
public class OddQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int a[] = new int[n];
            long pre[] = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                if(i==0){
                    pre[i] = a[i];
                }else{
                    pre[i] = a[i] + pre[i-1];
                }
            }
            for(int i=1;i<=q;i++){
                int l = sc.nextInt();
                int r = sc.nextInt();
                long k = sc.nextLong();
                long newSum;
                if(l==1){
                    newSum = pre[n-1] - pre[r-1] + (r-l+1)*k;
                }else{
                    newSum = pre[n-1] - (pre[r-1] - pre[l-2]) + (r-l+1)*k;
                }
                if(newSum%2==1){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
            t--;
        }
 
        sc.close();
    }
}
