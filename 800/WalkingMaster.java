import java.util.*;
public class WalkingMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if(d<b){
                System.out.println(-1);
            }else if(d==b){
                if(a<c){
                    System.out.println(-1);
                }else{
                    System.out.println(Math.abs(a-c));
                }
            }else{
                int opr = d-b;
                a = a + opr;
                if(a<c){
                    System.out.println(-1);
                }else{
                    opr = opr + Math.abs(a-c);
                    System.out.println(opr);
                }
            }
            t--;
        }

        sc.close();
    }
}
