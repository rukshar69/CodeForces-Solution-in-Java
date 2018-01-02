import java.util.Scanner;

/**
 * Created by Rukshar Alam on 1/2/2018.
 */
public class ZeroAndOne_556A_optimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();
        String input = sc.nextLine();

        int numOf1 = 0; int numOf0 = 0;

        for(int i = 0;i<n;i++){
            if(input.charAt(i) == '0') numOf0++;
            else if(input.charAt(i) =='1') numOf1++;
        }

        int remainingLength = Math.abs(numOf0-numOf1);
        System.out.println(remainingLength);



    }
}
