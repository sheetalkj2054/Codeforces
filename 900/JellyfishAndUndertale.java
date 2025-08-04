import java.util.*;
public class JellyfishAndUndertale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int tools[] = new int[n];
            long sum = b-1;
            b = 1;
            for(int i=0;i<n;i++){
                tools[i] = sc.nextInt();
                b = Math.min(b+tools[i],a);
                sum = sum + b-1;
                b = 1;
            }
            System.out.println(sum+1);
            t--;
        }
 
        sc.close();
    }
}
