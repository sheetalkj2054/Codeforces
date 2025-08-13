import java.util.*;
public class NITDestroysTheUniverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int cnt = 0;
            int i=0;
            while(i<n){
                if(a[i]!=0){
                    cnt++;
                    while(i<n&&a[i]!=0){
                        a[i]=0;
                        i++;
                    }
                }else{
                    i++;
                }
            }
            System.out.println(Math.min(cnt, 2));
            t--;
        }
 
        sc.close();
    }
}
