import java.util.*;
public class EverybodyLikesGoodArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            long last = a[0]&1;
            int opr = 0;
            for(int i=1;i<n;i++){
                int cur = a[i]&1;
                if(cur==last){
                    opr++;
                }else{
                    last = cur;
                }
            }
            System.out.println(opr);
            t--;
        }
 
        sc.close();
    }
}
