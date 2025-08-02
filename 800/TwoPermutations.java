import java.util.*;
public class TwoPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if((n-a-b>=2) || (n==a&&n==b)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }

        sc.close();
    }
}
