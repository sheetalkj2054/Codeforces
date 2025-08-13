import java.util.*;
public class NITDestroysTheUniverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int cnt = 0;
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                if(a[i]==0){
                    cnt++;
                }
            }
            int left = 0;
            int right = n-1;
            while(left<n&&a[left]==0){
                left++;
            }
            while(right>=0&&a[right]==0){
                right--;
            }
            boolean found = false;
            for(int i=left;i<=right;i++){
                if(a[i]==0){
                    found = true;
                    break;
                }
            }
            if(cnt==n){
                System.out.println(0);
            }else if(found){
                System.out.println(2);
            }else{
                System.out.println(1);
            }
            t--;
        }
 
        sc.close();
    }
}
