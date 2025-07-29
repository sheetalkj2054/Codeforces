import java.util.*;
public class ForbiddenInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); // Number of test cases
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            if(x!=1){
                while(n>0){
                    list.add(1);
                    n--;
                }
            }else{
                if (k == 1) {
                    // Only x=1 was available, now forbidden => impossible
                } else if (n % 2 == 0) {
                    for (int i = 0; i < n / 2; i++) {
                        list.add(2);
                    }
                    n = 0;
                } else if (k >= 3) {
                    list.add(3);
                    n -= 3;
                    for (int i = 0; i < n / 2; i++) {
                        list.add(2);
                    }
                    n = 0;
                }
            }
            if(n==0){
                System.out.println("YES");
                System.out.println(list.size());
                for(int i : list){
                    System.out.print(i+" ");
                }
                System.out.println();
            }else{
                System.out.println("NO");
            }
            t--;
        }
 
        sc.close();
    }
}
