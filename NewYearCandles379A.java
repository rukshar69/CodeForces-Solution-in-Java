import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/16/2017.
 */
public class NewYearCandles379A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int day = 0,burnt =0;
        while(a>0)
        {
            day++;
            a--;
            burnt++;
            if(burnt%b == 0)
            {
                a++;
                burnt=0;
            }
        }
        System.out.println(day);

    }
}
