import java.util.*;
 
public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            min = Math.min(min,Math.abs(a[i]));
        }
        System.out.println(Math.abs(min));
 
        sc.close();
    }
}