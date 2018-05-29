import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/29/2018.
 */
public class MaximumIncrease_702A {


    public static int returnMaximum2(int[] a, int n){
        int maxLength = 0;
        int currentLength = 0;

        int index = 1;

        while (index<n){

            if(a[index-1]>=a[index]){

                maxLength = Math.max(currentLength, maxLength);
                currentLength = 0;
            }
            else{
                currentLength++;
                //System.out.println("c "+currentLength);
            }
            index++;
        }
        maxLength = Math.max(currentLength, maxLength);

        return  maxLength + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] a= new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int maxLen = returnMaximum2(a,n);
        System.out.println(maxLen);




    }
}
