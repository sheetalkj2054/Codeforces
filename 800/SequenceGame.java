import java.util.*;
 
public class SequenceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); // Number of test cases
        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            ArrayList<Integer> list = new ArrayList<>();
            list.add(a[0]);
            int i = 1;
            while(i<a.length){
                if(list.get(list.size()-1)<=a[i]){
                    list.add(a[i]);
                }else{
                    list.add(1);
                    list.add(a[i]);
                }
                i++;
            }
            System.out.println(list.size());
            for(int x : list){
                System.out.print(x+" ");
            }
            System.out.println();
            t--;
        }
 
        sc.close();
    }
}