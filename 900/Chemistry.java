import java.util.*;
public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int fre[] = new int[26];
            for(int i=0;i<n;i++){
                fre[s.charAt(i)-97]++;
            }
            int odd = 0;
            for(int i : fre){
                if(i%2==1){
                    odd++;
                }
            }
            if((n-k)%2==0){
                if(odd>k){
                    System.out.println("NO");
                }else if (odd==k) {
                    System.out.println("YES");
                }else{
                    k = k-odd;
                    if(k%2==0){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }
            }else{
                if(odd>k){
                    odd = odd-k;
                    if(odd>1){
                        System.out.println("NO");
                    }else{
                        System.out.println("YES");
                    }
                    
                }else if(odd==k){
                    System.out.println("NO");
                }else{
                    k = k-odd;
                    if(k%2==1){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }
            }
            t--;
        }
 
        sc.close();
    }
}
