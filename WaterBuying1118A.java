/**
 * Created by Rukshar Alam on 10/8/2019.
 */
import  java.util.*;
public class WaterBuying1118A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Q = input.nextInt();

        for(int q = 0;q<Q;q++){
            long n,a,b;
            n = input.nextLong(); a = input.nextLong(); b = input.nextLong();
            long cost = 0;
            if(n<2){
                cost = a;
            }
            else if(a==b){
                cost += (n/2)*b;
                if(n%2 ==1) cost += a;
            }
            else if(a>b || 2*a>b){
                cost += (n/2)*b;
                if(n%2 ==1) cost += a;
            }
            else if(b>2*a || b==2*a){
                cost += a*n;
            }
            System.out.println(cost);
        }
    }
}
