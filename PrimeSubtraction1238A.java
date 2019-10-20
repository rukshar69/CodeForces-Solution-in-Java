/**
 * Created by Rukshar Alam on 10/18/2019.
 */

import java.util.*;
public class PrimeSubtraction1238A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        for(int t = 0;t<T;t++){
            long x = input.nextLong(); long y = input.nextLong();

            if(x-y>1) System.out.println("YES"); else
                System.out.println("NO");
        }

    }
}
