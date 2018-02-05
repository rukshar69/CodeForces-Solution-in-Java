import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/4/2018.
 */
public class TwoButton_520B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                //sc.nextLine();

        //System.out.println(s+" "+m);

        int n  = sc.nextInt();
        int m = sc.nextInt();

        int t = 0;

        while (m>n){
            if(m%2 == 1){
                m++;
                t++;
            }
            else
            {
                t++;
                m/=2;
            }
        }

        t += (n-m);
        System.out.println(t);


    }
}
