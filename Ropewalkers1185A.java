/**
 * Created by Rukshar Alam on 10/18/2019.
 */
import java.util.*;
public class Ropewalkers1185A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int n = input.nextInt();int k = input.nextInt();

        int[] a = new int[3];
        for(int i =0;i<3;i++){
            a[i] = input.nextInt();
        }
        int d = input.nextInt();

        Arrays.sort(a);
        long time = 0;
        int firstDistance = Math.abs(a[0]-a[1]);

        if(firstDistance<d) time += Math.abs(firstDistance-d);

        int secondDistance = Math.abs(a[1]-a[2]);

        if(secondDistance<d) time+= Math.abs(secondDistance-d);

        System.out.println(time);
    }
}
