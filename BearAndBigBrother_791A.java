import java.util.Scanner;

/**
 * Created by Rukshar Alam on 12/24/2017.
 */
public class BearAndBigBrother_791A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b= scanner.nextInt();

        if(a==b){
            System.out.println(1);
        }
        else {
            boolean t = true;
            int year = 0;

            while (t){
                year++;
                a = a*3;
                b = b*2;
                if(a>b){
                    t = false;
                }
            }

            System.out.println(year);
        }
    }
}
