import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/17/2018.
 */
public class NightMuseum_731A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = s.length();
        int rotation  = 0;

        char prev_c = s.charAt(0);
        int dist1 = Math.abs(prev_c - 'a');
        //System.out.println(dist1);
        int dist2 = 26 - Math.abs(prev_c - 'a');
        rotation += dist1<=dist2?dist1:dist2;

        //System.out.println(rotation);
        for(int i =1 ;i<n;i++){
            char c = s.charAt(i);

            dist1 = Math.abs(c-prev_c);
            dist2 = 26-Math.abs(c-prev_c);
            rotation += dist1<=dist2?dist1:dist2;

            //System.out.println(rotation);
            prev_c = c;
        }

        System.out.println(rotation);
    }
}
