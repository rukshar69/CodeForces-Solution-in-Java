import java.util.*;

/**
 * Created by Rukshar Alam on 10/19/2019.
 */
public class SummerCamp672A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String st = "123456789101112131415";

        int sz = st.length();
        int number = 16;
        while (sz<1000){
            String numStr = Integer.toString(number);
            st = st+numStr;
            number++;
            sz += numStr.length();
        }

        System.out.println(st.charAt(n-1));

    }
}
