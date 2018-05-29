import java.util.*;

/**
 * Created by Rukshar Alam on 4/3/2018.
 */
public class AmrMusic_507A {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int k= sc.nextInt();


        int a[] = new int[n];
        int index[] = new int[n];

        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
            index[i] = i+1;
        }

        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(a[j-1] > a[j]){
                    //swap elements
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;

                    temp = index[j-1];
                    index[j-1] = index[j];
                    index[j] = temp;
                }

            }
        }

       /* for(int i = 0;i<n;i++){
            System.out.print(a[i]+" ");
            System.out.println(index[i]);
        }*/

       int sum = 0;
       int count = 0;

        for(int i =0;i<n;i++){
            sum += a[i];
            if(sum>k){
                break;
            }

            count++;
        }

        System.out.println(count);

        for(int i =0;i<count;i++){
            System.out.print(index[i]+" ");
        }

    }
}
