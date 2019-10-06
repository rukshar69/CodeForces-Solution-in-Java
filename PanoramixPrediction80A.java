/**
 * Created by Rukshar Alam on 10/1/2019.
 */
import java.util.Scanner;
public class PanoramixPrediction80A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m;
        n = input.nextInt();
        m = input.nextInt();
        int primes[] = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};

        int sz = primes.length;
        int indexOfN = -1;
        for(int i =0;i<sz;i++){
            if(n == primes[i]){
                indexOfN = i;
                break;
            }
        }
        if(n<47){
            int nextPrime=primes[indexOfN+1];
            if(m!= nextPrime){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }else{
            System.out.println("NO");
        }
    }
}
