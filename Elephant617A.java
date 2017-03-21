import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/21/2017.
 */
public class Elephant617A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int steps = 0;

        for(int i = 5;i>=1;i--)
        {
            int temp = n/i;
            steps += temp;
            n = n%i;
        }
        System.out.println(steps);
    }
}
