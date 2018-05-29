import java.util.Scanner;

/**
 * Created by Rukshar Alam on 5/26/2018.
 */
public class Arya_bran_839A {
    static void solution1(int[] a, int n, int k){
        int saved = 0;
        int day = -1;
        boolean flag = false;
        for(int i =0;i<n;i++){
            saved += a[i];
            if (saved<8){
                k -= saved;
                saved = 0;
            }
            else {
                k-= 8;
                saved -= 8;
            }
            if(k<=0){
                flag = true;
                day = i+1;
                break;
            }
        }


            System.out.println(day);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a= new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        solution1(a,n,k);

    }
}
