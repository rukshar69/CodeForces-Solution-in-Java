/**
 * Created by Rukshar Alam on 10/13/2019.
 */
import java.util.*;
public class PensPencils {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        for(int t=0;t<T;t++){
            int a = input.nextInt(); int b = input.nextInt();int c = input.nextInt();
            int d = input.nextInt();int k = input.nextInt();
            int x = a%c == 0? a/c: (a/c)+1;
            int y = b%d == 0? b/d: (b/d)+1;

            if(x+y<=k) System.out.println(x+" "+y);
            else System.out.println("-1");
        }

    }
}
