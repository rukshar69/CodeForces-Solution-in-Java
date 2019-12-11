import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 12/11/2019.
 */
public class MinDifficulty_496A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int minDiff = 99999;

        for(int i =1;i<n-1;i++){
            ArrayList<Integer>arrayList = new ArrayList<Integer>();

            for(int j =0;j<n;j++){
                if(j!=i){
                    arrayList.add(a[j]);
                }
            }

            int maxDiff=-1;

            for(int j =1;j<n-1;j++){
                int tmpDiff = arrayList.get(j) - arrayList.get(j-1);
                maxDiff = tmpDiff>maxDiff?tmpDiff:maxDiff;
            }
            minDiff = maxDiff<minDiff?maxDiff:minDiff;

        }

        System.out.println(minDiff);
    }
}
