import java.util.*;
public class Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); // Number of test cases
        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int dif = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if(i>0){
                    dif = Math.min(dif,a[i]-a[i-1]);
                }
            }
            if(dif<0){
                System.out.println(0);
            }else if (dif==0) {
                System.out.println(1);
            }else{
                System.out.println((dif/2) + 1);
            }
            
            t--;
        }
 
        sc.close();
    }
}
