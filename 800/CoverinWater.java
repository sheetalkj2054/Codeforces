import java.util.*;
 
public class CoverinWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); // Number of test cases
        while (t > 0) {
            int n = sc.nextInt(); // Number of points
            String s = sc.next(); // Max value of the line
            int cnt = 0;
            int max = 0;
            int total = 0;
            for (int i = 0; i < n; i++) {
                if(s.charAt(i) == '.'){
                    cnt++;
                    total++;
                    max = Math.max(max,cnt);
                }else{
                    cnt = 0;
                }
            }
            if(max>2){
                System.out.println(2);
            }else{
                System.out.println(total);
            }
            t--;
        }
 
        sc.close();
    }
}