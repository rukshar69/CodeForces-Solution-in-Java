import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/7/2018.
 */
public class Heist_1041A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int min = Arrays.stream(a).min().getAsInt();
        int max = Arrays.stream(a).max().getAsInt();
        Arrays.sort(a);
        int stolen = 0;
        int j = min;
        int a_index = 0;
        while (j<=max){

            if(j == a[a_index]){
                a_index++;
                j++;
            }
            else{
                j++;
                stolen++;
            }
        }
        System.out.println(stolen);


    }
}
