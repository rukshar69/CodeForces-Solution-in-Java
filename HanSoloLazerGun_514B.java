/**
 * Created by Rukshar Alam on 11/22/2019.
 */
import java.util.*;

public class HanSoloLazerGun_514B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int x0 = sc.nextInt();int y0 = sc.nextInt();

        int x[] = new int[n];int y[] = new int[n];

        for(int i =0;i<n;i++){
            x[i] = sc.nextInt(); y[i] = sc.nextInt();
        }

        boolean killed[] = new boolean[n];
        //System.out.println(killed[2]);
        int countLines = 0;

        for(int i =0;i<n;i++){
            if(killed[i]) continue;
            countLines++;

            int dx1 = x[i] - x0; int dy1 = y[i] - y0;

            for(int j = 0;j<n;j++){
                int dx2 = x[j] - x0; int dy2 = y[j] - y0;
                if(dx1*dy2 == dx2*dy1)killed[j] = true;
            }
        }

        System.out.println(countLines);


    }
}
