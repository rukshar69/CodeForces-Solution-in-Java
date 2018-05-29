import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/21/2018.
 */
public class Taymyr_764A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int m = sc.nextInt();
        int z = sc.nextInt();

        int time = 1;
        int count = 0;
        while (time<=z){


            if(time%n == 0 && time %m ==0){
                //System.out.println(time);
                count++;
            }
            time++;
        }

        System.out.println(count);
    }
}
