import java.util.*;
public class DontTryToCount {
    public static boolean containsSubstring(StringBuilder x, StringBuilder s) {
        if (x == null || s == null) {
            return false;
        }
        // empty s is always “found”
        if (s.length() == 0) {
            return true;
        }
        // Variant A: use StringBuilder#indexOf
        return x.indexOf(s.toString()) >= 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); // Number of test cases
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            StringBuilder StrX = new StringBuilder(x);
            StringBuilder StrS = new StringBuilder(s);
            int operation = 0;
            boolean flag = false;
            for(int i=1;i<=8;i++){
                if(containsSubstring(StrX,StrS)){
                    System.out.println(operation);
                    flag = true;
                    break;
                }
                StrX.append(StrX);
                operation++;
            }
            if(!flag){
                System.out.println(-1);
            }
            t--;
        }
 
        sc.close();
    }
}