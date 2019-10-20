/**
 * Created by Rukshar Alam on 10/20/2019.
 */

import java.util.*;
public class KuriyamaStoneV2433B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n= input.nextInt();

        long v[] = new long[n+1];
        long u[] = new long[n+1];

        for(int i =1;i<=n;i++){
            v[i] = (long)input.nextInt(); u[i] = v[i];
        }

        Arrays.sort(u);
        for(int i =1;i<=n;i++){
            v[i] += v[i-1] ;  u[i] += u[i-1] ;
        }

        int M= input.nextInt();
        for(int m = 0;m<M;m++){
            int type= input.nextInt();int l= input.nextInt();int r= input.nextInt();

            if(type ==1) System.out.println(v[r]-v[l-1]);
            else System.out.println(u[r]-u[l-1]);

        }




    }
}
