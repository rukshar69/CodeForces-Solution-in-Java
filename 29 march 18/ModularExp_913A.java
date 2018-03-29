import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/23/2018.
 */
public class ModularExp_913A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();


        if(n>=31){
            System.out.println(m);
        }
        else{

            long exp = (1<<n);
            long mod = (m%exp);
            System.out.println(mod);
        }
    }
}
