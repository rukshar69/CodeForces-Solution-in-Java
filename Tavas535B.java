/**
 * Created by Rukshar Alam on 10/18/2019.
 */
import java.util.*;
public class Tavas535B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int len = 0;
        int ans = 0;
        while (n!=0) {
            if (n % 10 == 7)
                ans += (1 << len);
            n /= 10;
            len++;
        }
        for (int i = 1; i < len; i++)
            ans += (1 << i);
        System.out.println(ans + 1);

    }
}
