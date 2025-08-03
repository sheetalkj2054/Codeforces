import java.util.*;

public class VasilijeInCacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
            long min = (k*(k+1))/2;
            long max = (n*(n+1))/2 - ((n-k)*(n-k+1))/2;
            if(x<min||x>max){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
            t--;
        }
 
        sc.close();
    }
}
