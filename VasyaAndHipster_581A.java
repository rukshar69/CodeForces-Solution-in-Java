import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/11/2017.
 */
public class VasyaAndHipster_581A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  a = sc.nextInt();
        int b = sc.nextInt();

        int min , max;
        if(a>=b ){
            min =b; max = a;
        }
        else
        {
            min = a; max = b;
        }

        int fashionable = min;
        int regular = (max-min)/2;

        System.out.println(min+ " "+ regular);
    }
}
