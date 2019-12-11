/**
 * Created by Rukshar Alam on 10/24/2019.
 */

import java.util.*;
public class StickerToy1187A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t=0;t<T;t++){
            int n = sc.nextInt();

            int a = sc.nextInt(); int b = sc.nextInt();
            int ans = Math.max(n-a,n-b)+1;
            System.out.println(ans);

        }
    }
}
