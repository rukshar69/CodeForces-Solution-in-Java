import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/26/2017.
 */
public class EpicGame119A
{

    static int gcd(int a, int b)
    {
        return  b==0? a: gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,n;
        a = sc.nextInt(); b = sc.nextInt(); n = sc.nextInt();
        int turn = 1;  //1 for simon 2 for antisimon
        int g;
        int winner  =0 ;

        while(n != 0)
        {

            if(turn == 1)
            {
                g = gcd(a,n);
                //System.out.println("in 1  g's value: "+g);
                if(g>n)
                {
                    winner = 1;
                  //  System.out.println("winner 2 chosen with n's value: "+n);
                    break;
                }
                else
                {
                    n -= g;
                   // System.out.println("current value of n: "+n);
                    if(n == 0)
                    {
                        winner = 0;
                     //   System.out.println("winner 1 chosen");
                        break;
                    }
                }
                turn = 2;

            }
            else
            {
                g = gcd(b,n);
                //System.out.println("in 2 g's value: "+g);

                if(g>n)
                {
                    winner = 0;
                    //System.out.println("winner 1 chosen with n's value: "+n);

                    break;
                }
                else
                {
                    n -= g;
                    //System.out.println("current value of n: "+n);

                    if(n == 0)
                    {
                        winner = 1;
                        //System.out.println("winner 2 chosen");
                        break;
                    }
                }
                turn = 1;

            }

        }
        System.out.println(winner);
    }
}
