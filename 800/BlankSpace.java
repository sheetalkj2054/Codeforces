import java.util.*;
public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
 
            int[] a = new int[n];
            int cnt = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if(a[i]==0){
                    cnt++;
                    max = Math.max(max,cnt);
                }else{
                    cnt = 0;
                }
            }
            System.out.println(max);
            t--;
        }

        sc.close();
    }
}
