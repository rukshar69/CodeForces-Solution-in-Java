/**
 * Created by Rukshar Alam on 10/1/2019.
 */
import java.util.Scanner;
public class LittleC1047A {
    public static void main(String[] args) {
        int t,n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int a,b,c;
        a = 1;
        n--;
        if((n-1)%3==0){
            b = 2;
            c = n-2;
        }else{
            b = 1;
            c = n-1;
        }
        System.out.println(a+" "+b+" "+c);
    }
}
