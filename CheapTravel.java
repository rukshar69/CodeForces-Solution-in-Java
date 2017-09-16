import java.util.Scanner;

/**
 * Created by Rukshar Alam on 9/16/2017.
 */
public class CheapTravel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp = m*a;
        if(temp<=b)
        {
            System.out.println(n*a);
        }
        else
        {
            int remainder = n%m;
            int remainderCost = remainder*a;
            if(remainderCost>b)
            {
                System.out.println((n/m)*b+b);

            }
            else
            {
                System.out.println((n/m)*b+remainderCost);
            }
        }
    }
}
