import java.util.Scanner;

/**
 * Created by Rukshar Alam on 9/20/2017.
 */
public class VanyaAndCubes492A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height = 1;
        int cubeUsedInPyramid = 1;

        int iteration = 2;
        while (cubeUsedInPyramid<n)
        {
            int numberOfCubesInALevel = (iteration*(iteration+1))/2;
            cubeUsedInPyramid += numberOfCubesInALevel;
            if(cubeUsedInPyramid>n){
                break;
            }
            else  if(cubeUsedInPyramid == n)
            {
                height++;
                break;
            }
            else
            {
                height++;
                iteration++;
            }

        }
        System.out.println(height);
    }
}
