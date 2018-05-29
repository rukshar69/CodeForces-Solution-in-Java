import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/21/2018.
 */
public class LongestUncommon_subsequence_766A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String  b = sc.nextLine();

        int x = a.length();
        int y = b.length();
        if(x == y){
            System.out.println("-1");
        }
        else{
            int max = Math.max(x,y);
            System.out.println(max);
        }
    }
}
