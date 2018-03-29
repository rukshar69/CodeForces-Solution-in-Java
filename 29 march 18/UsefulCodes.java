import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/22/2018.
 */
public class UsefulCodes {

    public static void printArray(int[] a,int n){
        for(int i =0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = sc.nextInt();

        int m = sc.nextInt();
        int[] a= new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for(int i =0;i<n;i++){
            char c = s.charAt(i);
        }
    }
}
