import java.util.*;
public class ServalAndMochasArray {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
 
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            boolean beautiful = false;
            for (int i = 0; i < n; i++) {
                for(int j=i+1;j<n;j++){
                    if (gcd(a[i],a[j])<=2) {
                        beautiful = true;
                        break;
                    }
                }
            }
            if(beautiful){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
 
        sc.close();
    }
}
