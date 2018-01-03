import java.util.Scanner;

/**
 * Created by Rukshar Alam on 1/3/2018.
 */
public class HolidayOfEquality_758A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[]=new int[n];
        int max = -1;

        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();

            if(a[i] > max){
                max = a[i];
            }
        }


        int minBurles = 0;

        for(int i = 0;i<n;i++){
            minBurles += (max -a[i]);
        }

        System.out.println(minBurles);
    }
}
