import java.util.Scanner;
//codeforces 785A
/**
 * Created by Rukshar Alam on 2/16/2017.
 */
public class AntonAndPolyhedrons {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        long sum = 0;
        for(int i =1;i<=n;i++)
        {
            String  s = sc.nextLine();
            if(s.charAt(0) == 'T')
            {
                sum += 4;
            }
            else if(s.charAt(0) == 'C')
            {
                sum += 6;

            }else if(s.charAt(0) == 'O')
            {
                sum += 8;

            }else if(s.charAt(0) == 'D')
            {
                sum += 12;

            }else if(s.charAt(0) == 'I')
            {
                sum += 20;

            }
            //sc.next();


        }
        System.out.println(sum);


    }
}
