import java.util.*;
public class OneAndTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int cnt1 = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if(a[i]==2){
                    cnt1++;
                }
            }
            if(cnt1==0){
                System.out.println(1);
            }else if(cnt1%2==1){
                System.out.println(-1);
            }else{
                int cnt2 = 0;
                for(int i=0;i<n-1;i++){
                    if(a[i]==2){
                        cnt2++;
                    }
                    if(cnt2 == cnt1/2){
                        System.out.println(1+i);
                        break;
                    }
                }
            }
            t--;
        }
 
        sc.close();
    }
}
