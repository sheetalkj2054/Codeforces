import java.util.*;
public class ArrayColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); // Number of test cases
        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum = sum + a[i];
            }
            boolean flag = false;
            for(int i : a){
                if((i%2==0 && (sum-i)%2==0) || (i%2==1 && (sum-i)%2==1)){
                    System.out.println("YES");
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("NO");
            }
            t--;
        }
 
        sc.close();
    }
    
}
