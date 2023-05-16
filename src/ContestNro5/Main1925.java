package ContestNro5;
import java.util.*;

public class Main1925 {
    static List<Long> ans = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 10; i++) {
            dfs(i);
        }
        Collections.sort(ans);
        int t = sc.nextInt();
        while(t-- > 0) {
            int x = sc.nextInt();
            System.out.println(ans.get(x - 1));
        }
        sc.close();
    }

    static void dfs(long u) {
        if (u <= 10000000000L) {
            ans.add(u);
            long dig = u % 10;
            for (long i = Math.max(0, (int)dig - 1); i <= Math.min(9, (int)dig + 1); i++) {
                dfs(u * 10 + i);
            }
        }
    }
}