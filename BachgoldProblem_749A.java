import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/5/2018.
 */
public class BachgoldProblem_749A {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        int n  = sc.nextInt();

        int k;
        if(n %2 == 0){
            k= n/2;
            System.out.println(k);
            for(int i= 0; i<k; i++){
                System.out.print("2 ");;
            }
            System.out.println();;
        }
        else{
            k= n/2;
            System.out.println(k);
            for(int i= 1; i<k; i++){
                System.out.print("2 ");
            }
            System.out.println("3 ");;
        }
    }
}
