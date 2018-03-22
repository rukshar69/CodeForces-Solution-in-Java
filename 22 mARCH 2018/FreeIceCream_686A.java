import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/22/2018.
 */
public class FreeIceCream_686A {

    public static void printArray(int[] a,int n){
        for(int i =0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = sc.nextInt();
        sc.nextLine();

        int[] a= new int[n];
        for(int i =0;i<n;i++){
            String  input = sc.nextLine();

            char sign = input.charAt(0);

            String sub = input.substring(2);
            a[i] = Integer.valueOf(sub);
            if(sign == '-'){
                a[i] = -1*a[i];
            }

        }

        //printArray(a,n);

        long iceCreamLeft = x;

        int distressCHild = 0;
        for(int i =0;i<n;i++){

            int temp = a[i];
            if(a[i]>=0){
                iceCreamLeft+= temp;
            }
            else{
                if(iceCreamLeft+temp>=0){
                    iceCreamLeft += temp;
                }
                else{
                   distressCHild++;
                }
            }
            //System.out.println(iceCreamLeft+" "+distressCHild);

        }
        System.out.println(iceCreamLeft+" "+distressCHild);


        //printArray(a,n);

    }
}
