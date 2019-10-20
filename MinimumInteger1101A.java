import java.util.*;

/**
 * Created by Rukshar Alam on 10/20/2019.
 */
public class MinimumInteger1101A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Q = input.nextInt();

        for(int  q = 0;q<Q;q++){
            int l = input.nextInt();int r = input.nextInt();int d = input.nextInt();

            if(d<l) System.out.println(d);
            else{
                int c = r/d;
                System.out.println(d*(c+1));
            }
        }
    }
}
