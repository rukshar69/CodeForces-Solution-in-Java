import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/17/2017.
 */
public class EvenOdds318ABruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        long pos = 0, num = 0; boolean f = true;
        if(n%2 == 0)
        {
            num = 1; pos = 1;

            if(pos == k)
            {
                System.out.println(num); f = false;
            }
            for(int i = 2;i<=n/2;i++)
            {
                pos++;
                num += 2;

                if(pos == k)
                {
                    System.out.println(num); f = false;break;
                }


            }
            if(f){

                pos += 1; num = 2;
                if(pos == k)
                {
                    System.out.println(num); f = false;
                }
                for(int i = 2;i<=n/2;i++)
                {

                    pos++;
                    num += 2;
                    if(pos == k)
                    {
                        System.out.println(num);f= false; break;
                    }


                }
            }



        }else
        {
            num = 1; pos = 1;
            if(pos == k)
            {
                System.out.println(num); f = false;
            }
            for(int i = 2;i<=(n/2)+1;i++)
            {

                pos++;
                num += 2;
                if(pos == k)
                {
                    System.out.println(num); f = false;break;
                }


            }
            if(f){
                pos += 1; num = 2;
                if(pos == k)
                {
                    System.out.println(num); f = false;
                }
                for(int i = 2;i<=n/2;i++)
                {

                    pos++;
                    num += 2;
                    if(pos == k)
                    {
                        System.out.println(num); break;
                    }


                }
            }

        }

    }
}
