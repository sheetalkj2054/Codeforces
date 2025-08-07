import java.util.*;
public class PermutationSwap {
    public static int gcd(int x, int y){
        if(y>x){
            return gcd(y, x);
        }
        while(y!=0){
            int temp = x%y;
            x = y;
            y = temp;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int k = Math.abs(a[0] - 1);
            for(int i=1;i<n;i++){
                k = gcd(k,Math.abs(a[i] - (i+1)));
            }
            System.out.println(k);
            t--;
        }
 
        sc.close();
    }
}
