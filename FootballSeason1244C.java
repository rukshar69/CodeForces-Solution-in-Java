/**
 * Created by Rukshar Alam on 10/13/2019.
 */
import java.util.*;
public class FootballSeason1244C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long n = input.nextLong(); long p = input.nextLong();long w = input.nextLong();long d = input.nextLong();
        long x=0,y=0,z=0;

        boolean flag = false;
        for(long i =0;i<=1000000L;i++){
             z = i;
            long term1 = n-z;
            long term2 = w-d;
             x = (term1*d)/term2;
             y = (term1*(term2-1))/term2;

            boolean check1 = x+y+z == n; boolean check2 = x*w + y*d == p;
            if(check1 && check2){
                flag = true;
                break;
            }
        }

        if(flag == false){
            //System.out.println("2nd");
            for(long i =1;i<=1000000L;i++){
                z = i+1000000L;
                long term1 = n-z;
                long term2 = w-d;
                x = (term1*d)/term2;
                y = (term1*(term2-1))/term2;

                boolean check1 = x+y+z == n; boolean check2 = x*w + y*d == p;
                if(check1 && check2){
                    flag = true;
                    break;
                }
            }
        }

        if(flag) System.out.println(x+" "+y+" "+z);
        else System.out.println("-1");

    }
}
