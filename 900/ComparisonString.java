import java.util.*;
public class ComparisonString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int cur = 1;
            int max = 1;
            for(int i=0;i<n-1;i++){
                char ch1 = s.charAt(i+1);
                char ch2 = s.charAt(i);
                if(ch1==ch2){
                    cur++;
                }else{
                    cur = 1;
                }
                max = Math.max(max,cur);
            }
            System.out.println(max+1);
            t--;
        }
 
        sc.close();
    }
}