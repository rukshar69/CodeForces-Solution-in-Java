import java.util.Scanner;

/**
 * Created by Rukshar Alam on 9/20/2017.
 */
public class Drinks200B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        //int drinks[] = new int[n];
        double sumOfProportions = 0;
        for(int i  = 0;i<n;i++)
        {
            sumOfProportions += sc.nextDouble()/100.0;
        }

        System.out.println((sumOfProportions/n)*100.0);
    }
}
