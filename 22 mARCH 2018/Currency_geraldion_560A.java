import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/21/2018.
 */
public class Currency_geraldion_560A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int [] a = new int[n];

        boolean one_present = false;

        for(int i = 0;i<n;i++){

                a[i] = sc.nextInt();
                if(a[i] == 1) one_present= true;
        }

        if(one_present)
            System.out.println("-1");
        else System.out.println("1");
    }
}
