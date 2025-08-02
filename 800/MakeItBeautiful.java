import java.util.*;

public class MakeItBeautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                min = Math.min(min,a[i]);
                max = Math.max(max,a[i]);
            }
            if(min==max){
                System.out.println("NO");
            }else{
                for(int i=n-1;i>0;i--){
                    a[i] = a[i-1];
                }
                a[0] = max;
                System.out.println("YES");
                for(int i : a){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            t--;
        }
 
        sc.close();
    }
}
