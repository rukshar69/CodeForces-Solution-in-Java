import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/23/2017.
 */
public class AandBCompilationError {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();

        int firstIterationSum  =0 ;
        for(int i = 0;i<n;i++){
            int temp = sc.nextInt();
            firstIterationSum += temp;
        }

        int secondIterationSum  =0 ;
        for(int i = 0;i<n-1;i++){
            int temp = sc.nextInt();
            secondIterationSum += temp;
        }

        int thirdIterationSum  =0 ;
        for(int i = 0;i<n-2;i++){
            int temp = sc.nextInt();
            thirdIterationSum += temp;
        }

        System.out.println((firstIterationSum-secondIterationSum));
        System.out.println((secondIterationSum-thirdIterationSum));


    }
}
