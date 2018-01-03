import java.util.Scanner;

/**
 * Created by Rukshar Alam on 1/3/2018.
 */

//http://www.bbc.co.uk/schools/gcsebitesize/maths/geometry/polygonsrev6.shtml
public class FancyFence_270A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0;i<n;i++){
            int interiorAngle = sc.nextInt();

            int exteriorAngle = 180 - interiorAngle;

            float sides = (float) 360.0/(float)exteriorAngle;

            if(sides == (float)((int)sides)){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
