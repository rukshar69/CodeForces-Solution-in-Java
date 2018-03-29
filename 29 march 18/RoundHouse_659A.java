import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/28/2018.
 */
public class RoundHouse_659A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();

        int pos = a;

        if(b>= 0){
            for(int i = 1;i<=b;i++){
                if(pos==n){
                    pos = 1;
                }
                else{
                    pos++;
                }
            }

        }
        else{
            for(int i = 1;i<=-b;i++){
                if(pos==1){
                    pos = n;
                }
                else{
                    pos--;
                }
            }
        }

        System.out.println(pos);

    }
}
