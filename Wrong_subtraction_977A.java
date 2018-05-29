import java.util.Scanner;

/**
 * Created by Rukshar Alam on 5/26/2018.
 */
public class Wrong_subtraction_977A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        while (k>0){
            if(n%10 == 0){
                n/=10;
            }
            else{
                n--;
            }
            k--;
        }
        System.out.println(n);
    }
}
