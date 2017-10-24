import java.util.Scanner;

/**
 * Created by Rukshar Alam on 10/14/2017.
 */
public class IlyaAndBankAccount_313A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n>=0){
            System.out.println(n);
        }
        else
        {
            int m = -n; //positive value of number;
            int lastnumber = m%10;
            int last2Digit = m%100;
            int secondToLast = last2Digit/10;

            int last2DigitCutOut = m/100;
            int optionOne = last2DigitCutOut*10 + lastnumber;
            optionOne = -optionOne;
            int optionTwo = last2DigitCutOut*10 + secondToLast;
            optionTwo = -optionTwo;

            if(optionOne>=optionTwo) System.out.println(optionOne);
            else System.out.println(optionTwo);
        }
    }
}
