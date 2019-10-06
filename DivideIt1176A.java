/**
 * Created by Rukshar Alam on 10/1/2019.
 */
import java.util.Scanner;
public class DivideIt1176A {
    public static void main(String[] args) {
        //System.out.println("hello world");
        Scanner input = new Scanner(System.in);
        int q;
        q = input.nextInt();
        for(int query = 0;query<q;query++){
            long n=input.nextLong();
            int count = 0;
            while (n!=1){
                if(n%2 == 0){
                    n /= 2;
                    count++;
                }
                else if(n%3 == 0){
                    n = 2*n/3;
                    count++;
                }
                else if(n%5 == 0){
                    n = 4*n/5;
                    count++;
                }
                else break;
            }

            if(n==1) System.out.println(count);
            else System.out.println("-1");
        }

    }
}
