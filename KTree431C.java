/**
 * Created by Rukshar Alam on 10/11/2019.
 */
import  java.util.*;
public class KTree431C {
    static long addition(long a, long b,long mod){
        a += b;
        if(a >= mod)
            a -= mod;
        return a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();int k = input.nextInt();int d = input.nextInt();
        long constantMod = 1000000007;

        long sums[][] =new long[n+1][2];
        sums[0][0] = 1; sums[0][1] = 0;

        for(int i =1;i<=n;i++){
            sums[i][0] = 0; sums[i][1] = 0;

            for(int j = 1;j<=k;j++){
                if(i-j<0)break;
                if(j<d){
                    sums[i][0] = addition(sums[i][0],sums[i-j][0],constantMod);
                    sums[i][1] = addition(sums[i][1],sums[i-j][1],constantMod);
                }
                else{
                    sums[i][1] = addition(sums[i][1],sums[i-j][0],constantMod);
                    sums[i][1] = addition(sums[i][1],sums[i-j][1],constantMod);
                }
            }

        }

        System.out.println(sums[n][1]);

    }
}
