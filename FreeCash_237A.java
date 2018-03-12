import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/10/2018.
 */
public class FreeCash_237A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        int c = 1; int cash = 1;

        int h0 = sc.nextInt(); int m0=sc.nextInt();
        for(int i = 0;i<n-1;i++){
            int h = sc.nextInt(); int m = sc.nextInt();
            if(h == h0 && m == m0){
                c++;
                if(c>cash)cash =c ;
            }
            else {
                c= 1;
            }
            h0 = h;
            m0 = m;
        }
        System.out.println(cash);
    }
}
