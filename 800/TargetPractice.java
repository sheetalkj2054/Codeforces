import java.util.*;
public class TargetPractice {
    public static int helper(int row, int col){
        if(row==1 || col==1 || row==10 || col==10){
            return 1;
        }
        if(row==2 || col==2 || row==9 || col==9){
            return 2;
        }
        if(row==3 || col==3 || row==8 || col==8){
            return 3;
        }
        if(row==4 || col==4 || row==7 || col==7){
            return 4;
        }
        if(row==5 || col==5 || row==6 || col==6){
            return 5;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); // Number of test cases
        while (t > 0) {
            int ans = 0;
            for(int i=1;i<=10;i++){
                String row = sc.next();             // read exactly 10 chars
                for (int j = 1; j <= 10; j++) {
                    if (row.charAt(j - 1) == 'X') {
                    ans += helper(i, j);
                }
            }
            }
            System.out.println(ans);
            t--;
        }
 
        sc.close();
    }
}
