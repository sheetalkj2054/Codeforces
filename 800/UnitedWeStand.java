import java.util.*;
public class UnitedWeStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); // Number of test cases
        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                min = Math.min(min,a[i]);
            }
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();
            for(int i : a){
                if(i==min){
                    b.add(i);
                }else{
                    c.add(i);
                }
            }
            if(b.size()==0 || c.size()==0){
                System.out.println(-1);
            }else{
                System.out.println(b.size() + " " + c.size());
                for(int el : b){
                    System.out.print(el + " ");
                }
                System.out.println();
                for(int el : c){
                    System.out.print(el + " ");
                }
            }
            t--;
        }
 
        sc.close();
    }
    public static boolean canDivide(int idx, int arr[]){
        int x = arr[idx];
        for(int i=0;i<arr.length;i++){
            if(i==idx){
                continue;
            }else{
                return arr[i]%x==0;
            }
        }
        return false;
    }
}
