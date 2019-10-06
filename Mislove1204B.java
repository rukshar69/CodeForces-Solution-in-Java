/**
 * Created by Rukshar Alam on 10/3/2019.
 */
import java.util.*;
public class Mislove1204B {
    public static void main(String[] args) {
        int n,l,r;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();l = input.nextInt();r = input.nextInt();
        long minSum =0,maxSum = 0;
        minSum = (long)Math.pow(2,l)+(n-l)-1;
        if(n==r){
            maxSum = (long)Math.pow(2,n)-1;
        }
        else{
            maxSum = (long)Math.pow(2,r)-1;
            long mxVal = (long)Math.pow(2,r-1);
            mxVal = mxVal*(n-r);
            maxSum += mxVal;
        }

        System.out.println(minSum+" "+maxSum);

    }
}
