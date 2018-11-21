import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/21/2018.
 */
public class PerfectNumber_919B {
    static boolean checkPerfect(int number){
        int sum = 0;
        int m = number;
        int n ;
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        return  sum == 10;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();

        int tempK = 0;
        int k_thNumber = 0;
        int number = 1;

        while (tempK<k){
            if(checkPerfect(number)){
                tempK++;
                k_thNumber = number;
                number++;
            }
            else{
                number++;
            }
        }
        System.out.println(k_thNumber);
    }
}
