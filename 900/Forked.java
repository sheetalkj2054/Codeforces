import java.util.*;
public class Forked {
    static class Pair{
        int row;
        int col;
        Pair(int r, int c){
            this.row = r;
            this.col = c;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair other = (Pair) o;
            return row == other.row && col == other.col;
        }
        @Override
        public int hashCode() {
            return 31 * row + col;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int row[] = {-a,-a,a,a,-b,-b,b,b};
            int col[] = {-b,+b,-b,b,-a,a,-a,a};
            HashSet<Pair> set1 = new HashSet<>();
            HashSet<Pair> set2 = new HashSet<>();
            for(int i=0;i<8;i++){
                set1.add(new Pair(x1+row[i],y1+col[i]));
                set2.add(new Pair(x2+row[i],y2+col[i]));
            }
            int opr = 0;
            for(Pair p : set1){
                if(set2.contains(p)){
                    opr++;
                }
            }
            System.out.println(opr);
            t--;
        }
 
        sc.close();
    }
}
