import java.util.Scanner;

/**
 * Created by Rukshar Alam on 1/1/2018.
 */
public class Keyboard_474A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String left_right = sc.nextLine();
        char LR = left_right.charAt(0);

        String input = sc.nextLine();

        //System.out.println(input);
        String letters = "qwertyuiop" +
                "asdfghjkl;" +
                "zxcvbnm,./";

        int len = input.length();

        for(int i=0;i<len;i++){
            int index = letters.indexOf(input.charAt(i));

            if (LR == 'R') {
                char toPrint = letters.charAt(index-1);

                System.out.print(toPrint);
            }
            else{
                char toPrint = letters.charAt(index+1);

                System.out.print(toPrint);
            }
        }
    }
}
