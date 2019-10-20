/**
 * Created by Rukshar Alam on 10/18/2019.
 */
import java.util.*;
public class Decoding746B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        input.nextLine();
        String s = input.nextLine();

        char[] encoded = s.toCharArray();
        char[] decoded = new char[n];

        int j = 1;
        int last = n-1;
        int first = 0;

        for(int i = n-1;i>=0;i--){
            if(j%2 == 1){
                decoded[last] = encoded[i];
                last--;
            }
            else{
                decoded[first] = encoded[i];
                first++;
            }
            j++;
        }
        String answer = new String(decoded);
        System.out.println(decoded);

    }
}
