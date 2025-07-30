import java.util.*;
 
public class HowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); // Number of test cases
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if(a[i]==k){
                    flag = true;
                }
            }
            if(!flag){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
            
            t--;
        }
 
        sc.close();
    }
}