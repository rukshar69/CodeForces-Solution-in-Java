import java.util.Scanner;

/**
 * Created by Rukshar Alam on 1/1/2018.
 */
public class RaisingBacteria_579A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = 0;

        String binary = Integer.toBinaryString(n);

        int len = binary.length();

        for(int i = 0;i<len;i++){
            if(binary.charAt(i) == '1') x++;
        }

        System.out.println(x);
    }
}
