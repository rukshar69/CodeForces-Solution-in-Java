import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/21/2018.
 */
public class Dasha_Stairs_761A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        

        if(a==0&&b==0){
            System.out.println("NO");
        }
        else{
            int diff = Math.abs(a-b);
            if(diff == 1|| a==b){
                System.out.println("YES");
            }else System.out.println("NO");

        }
    }
}
