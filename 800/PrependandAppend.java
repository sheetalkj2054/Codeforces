import java.util.*;
public class PrependandAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            int s = 0;
            int e = n-1;
            while(s<e){
                if(str.charAt(s)=='0' && str.charAt(e)=='1' || str.charAt(s)=='1' && str.charAt(e)=='0'){
                    s++;
                    e--;
                }else{
                    break;
                }
            }
            System.out.println(e-s+1);
            t--;
        }

        sc.close();
    }
}
