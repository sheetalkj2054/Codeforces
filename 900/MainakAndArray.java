import java.util.*;
public class MainakAndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int dif = a[n-1]-a[0];
            for(int i=0;i<n-1;i++){
                dif = Math.max(dif,a[i]-a[0]);
            }
            for(int i=0;i<n-1;i++){
                dif = Math.max(dif,a[n-1]-a[i]);
            }
            for(int i=0;i<n-1;i++){
                dif = Math.max(dif,a[i]-a[i+1]);
            }
            System.out.println(dif);
            t--;
        }
 
        sc.close();
    }
}
