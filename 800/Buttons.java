import java.util.*;
public class Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); // Number of test cases
        while (t > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            if(c%2==1){
                b--;
            }

            if(a>b){
                System.out.println("First");
            }else{
                System.out.println("Second");
            }
            t--;
        }
 
        sc.close();
    }
}
