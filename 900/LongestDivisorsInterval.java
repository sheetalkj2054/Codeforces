import java.util.*;
public class LongestDivisorsInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            long cnt = 1;
	        while(cnt<50){
	            if(n%cnt==0){
	                cnt++;
	            }else{
	                break;
	            }
	        }
	        System.out.println(cnt-1);
            t--;
        }
 
        sc.close();
    }
}
