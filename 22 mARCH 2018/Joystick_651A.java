import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/21/2018.
 */
public class Joystick_651A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int minute = 0;
        if (!(a1==1&&a2 == 1))
            while (a1>0 && a2>0){
                if(a1<=a2){
                    a1++;
                    a2 -= 2;
                }
                else if(a1>a2){
                    a2++;
                    a1 -= 2;
                }

                minute++;
                //System.out.println(a1+" "+a2);
            }
        System.out.println(minute);
    }
}
