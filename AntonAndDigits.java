import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/2/2018.
 */
public class AntonAndDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k2 = sc.nextInt();
        int k3 = sc.nextInt();
        int k5 = sc.nextInt();int k6 = sc.nextInt();

        int fav1 = 256; int fav2 = 32;

        int sum =0;

        while (k2>0 && k5>0 && k6>0){
            sum += fav1;
            k2--; k5--; k6--;
        }

        while (k2>0 && k3>0 ){
            sum += fav2;
            k2--; k3--;
        }

        System.out.println(sum);


    }
}
