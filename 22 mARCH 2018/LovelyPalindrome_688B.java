import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/21/2018.
 */
public class LovelyPalindrome_688B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String  input = sc.nextLine();

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1 = input1.reverse();

        // print reversed String
        //System.out.println(input1);
        System.out.println(input+input1);
    }
}
