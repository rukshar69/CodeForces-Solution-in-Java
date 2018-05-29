import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/29/2018.
 */
public class Infinite_seq_675A {
    public static boolean decision(int a, int b,int c){
        boolean flag = false;
        if(c==0){
            if(a==b){
                //System.out.println("YES");
                flag = true;
            }
            else {
                //System.out.println("NO");
            }
        }
        else{
            float temp = (b-a)% c;
            if(temp ==0 && temp>=0){
                //System.out.println("YES");
                flag=true;
            }
            else {
                //System.out.println("NO");
            }
        }

        return  flag;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean flag = decision(a,b,c);

        if(flag){
            System.out.println("YES");
        }
        else System.out.println("NO");

    }
}
