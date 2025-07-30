import java.util.*;

public class UnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
 
            int[] a = new int[n];
            int pos = 0;
            int neg = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if(a[i]==1){
                    pos++;
                }else{
                    neg++;
                }
            }
            if(pos>=neg){
                if(neg%2==0){
                    System.out.println(0);
                }else{
                    System.out.println(1);
                }
            }else{
                int op = 0;
                while(-neg+pos<0){
                    op++;
                    pos++;
                    neg--;
                }
                if(neg%2==0){
                    System.out.println(op);
                }else{
                    System.out.println(op+1);
                }
            }
            t--;
        }

        sc.close();
    }
}
