import java.util.Scanner;

/**
 * Created by Rukshar Alam on 10/14/2017.
 */
public class TheNewYearMeetingFriends_723A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();int x2 = sc.nextInt();int x3 = sc.nextInt();

        int maximum = Math.max(x1,Math.max(x2,x3));
        int minimum =Math.min(x1,Math.min(x2,x3));
        int minDistance = Integer.MAX_VALUE;

        for (int i = minimum;i<=maximum;i++){
            int dist1 = Math.abs(x1- i);
            int dist2 = Math.abs(x2- i);
            int dist3 = Math.abs(x3- i);

            int tempDistance = dist1+dist2+dist3;

            if(tempDistance<minDistance)minDistance = tempDistance;


        }

        System.out.println(minDistance);
    }
}
