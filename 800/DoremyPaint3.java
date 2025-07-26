import java.util.*;

public class DoremyPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            if (freq.size() == 1) {
                System.out.println("YES");

            } else if (freq.size() == 2) {
                Iterator<Integer> it = freq.values().iterator();
                int c1 = it.next(), c2 = it.next();

                if (n % 2 == 0) {
                    System.out.println((c1 == n/2 && c2 == n/2) ? "YES" : "NO");
                } else {
                    int big = (n+1)/2, small = (n-1)/2;
                    boolean ok = (c1 == big && c2 == small) || (c2 == big && c1 == small);
                    System.out.println(ok ? "YES" : "NO");
                }

            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
