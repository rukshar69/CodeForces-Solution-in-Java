import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/21/2018.
 */
public class Gukiz_Contest_551A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];


        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();

        }

        int[] positions= new int[n];

        for(int i = 0;i<n;i++){
            int temp = a[i];
            int pos = 1;
            for(int j = 0;j<n;j++){
                if(i!=j){
                    if(a[j]>temp){
                        pos++;
                    }
                }
            }
            positions[i]=pos;

        }


        for(int i = 0;i<n;i++){
            System.out.print(positions[i]+" ");

        }
        System.out.println();
    }
}
