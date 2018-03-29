import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/27/2018.
 */
public class Party_115A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();


        int[] a= new int[n+1];
        for(int i =1;i<=n;i++){
            a[i] = sc.nextInt();
        }

        int max = 0;
        int temp ;

        for(int i =1;i<=n;i++){
            temp = 1;
            int currentEmp = i;
            while (a[currentEmp]!= -1){
                currentEmp = a[currentEmp];
                temp++;
            }
            max = Math.max(max, temp);
        }
        System.out.println(max);

    }
}
