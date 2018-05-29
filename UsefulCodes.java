import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/22/2018.
 */
public class UsefulCodes {

    public static int fun(int[] a,int n){
        return  0;
    }

    public static void printArray(int[] a,int n){
        for(int i =0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static int get(){
        Scanner input = new Scanner(System.in);
        int v = input .nextInt();
        if(v>20){
            return v;
        }
        else return get();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        /*
        //int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.nextLine();
        int n = sc.nextInt();

        int m = sc.nextInt();
        int[] a= new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        for(int i =0;i<n;i++){
            char c = s.charAt(i);
        }
        */

    }
}
