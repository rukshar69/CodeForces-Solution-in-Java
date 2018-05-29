import java.util.Scanner;

/**
 * Created by Rukshar Alam on 5/26/2018.
 */
public class DieRoll_9A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int W = sc.nextInt();
        int max = Math.max(Y,W);
        int options_dot = 6- max + 1;
        if(options_dot == 6){
            System.out.println("1/1");
        }
        else{
            int a = options_dot;
            int b  = 6;
            int divider = a;
            while (divider>1){

                if(a%divider ==0 && b%divider ==0){
                    a/=divider;
                    b/=divider;
                }
                divider--;
            }
            System.out.println(a+"/"+b);
        }
    }
}
