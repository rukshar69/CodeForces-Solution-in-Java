import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/21/2018.
 */
public class FafaCompany_935A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int multiples = 1;
        int numberOfWays = 0;
        for(int i = 1;i<=n/2;i++){
            if(n%i ==0){
                numberOfWays++;
            }
        }

        System.out.println(numberOfWays);

    }
}
