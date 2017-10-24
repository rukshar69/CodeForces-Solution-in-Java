import java.util.Scanner;

/**
 * Created by Rukshar Alam on 10/13/2017.
 */
public class Hulk_705A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String hate = "I hate "; String  love = "I love ";
        String result = hate;
        for (int i = 2;i<=n;i++){
            if(i%2 == 0) {
                result +=( "that "+love);
            }
            else
            {
                result +=( "that "+hate);
            }
        }

        result+= "it";
        System.out.println(result);

    }

}
