import java.util.*;

public class DoremyPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            Map<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            if (freq.size() == 1) {
                System.out.println("YES");

            } else if (freq.size() > 2) {
                System.out.println("NO");
            } else {
                int x = -1;
                int y = -1;
                for(int i : freq.keySet()){
                    if(x==-1){
                        x = freq.get(i);
                    }else{
                        y = freq.get(i);
                    }
                }

                if (n % 2 == 0) {
                    if(x==y){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                } else {
                    if(Math.abs(x-y)>1){
                        System.out.println("NO");
                    }else{
                        System.out.println("YES");
                    }
                }
            }
            t--;
        }

        sc.close();
    }
}
