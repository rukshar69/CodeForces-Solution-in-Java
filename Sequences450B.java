/**
 * Created by Rukshar Alam on 10/19/2019.
 */

import java.util.*;
public class Sequences450B {

    static  long modular(long x, long mod){
        long temp = ((x%mod) + mod)%mod;
        return temp;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        long x = input.nextLong();long y = input.nextLong();long n = input.nextLong();

        int remainder = (int)n%6;
        long mod = 1000000007;

        if(remainder==0) System.out.println(modular(x-y,mod));
        else if(remainder==1) System.out.println(modular(x,mod));
        else if(remainder==2) System.out.println(modular(y,mod));
        else if(remainder==3) System.out.println(modular(y-x,mod));
        else if(remainder==4) System.out.println(modular(-x,mod));
        else if(remainder==5) System.out.println(modular(-y,mod));



    }
}
