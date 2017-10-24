import java.util.Scanner;

/**
 * Created by Rukshar Alam on 10/13/2017.
 */
public class I_Love_Username_155A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];
        int countAmazing = 0;
        for(int i =0 ;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int min = a[0], max = a[0];

        for(int i = 1;i<n;i++){

            if(a[i]<min){
                min = a[i]; countAmazing++;
            }

            if(a[i]>max){
                max = a[i]; countAmazing++;
            }


        }

        System.out.println(countAmazing);

    }

}
