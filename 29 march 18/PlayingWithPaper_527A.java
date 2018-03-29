import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/28/2018.
 */
public class PlayingWithPaper_527A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long number_of_sq =0;
        while (true){

            if(a==0 || b==0){
                break;
            }
            else if(a==b){
                number_of_sq++;
                break;
            }
            else {
                long max ,min;

                if(a>b){
                    max = a;
                    min = b;
                }
                else{
                    max = b;
                    min =a;
                }

                number_of_sq += (max/min);
                max = max%min;

                a=max;
                b =min;
            }
        }

        System.out.println(number_of_sq);
    }
}
