import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/21/2019.
 */
public class HeroZero_1175A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for(int t = 0;t<test;t++){
            long n = sc.nextLong();
            long k = sc.nextLong();

            long steps = 0;

            while (n!=0){
                if(n%k==0){
                    n/=k;steps++;
                }else {
                    long remainder = n%k;
                    n -=remainder;
                    steps += remainder;
                }

            }
            System.out.println(steps);
        }
    }
}
