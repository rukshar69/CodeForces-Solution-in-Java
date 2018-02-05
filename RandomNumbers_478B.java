import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/5/2018.
 */
public class RandomNumbers_478B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        long kmax = n-m+1;

        kmax = (kmax*(kmax-1))/2;

        long temp = n/m;
        long kmin = ((n/m)*(n/m - 1))/2;

        if(n%m == 0){
            kmin *= m;
        }else{
            kmin *= (m- n%m);


            long lft =(((n / m) + 1 ) * (n / m)) / 2;
            kmin += lft * (n % m);

        }
        System.out.println(kmin+" "+kmax);
    }
}
