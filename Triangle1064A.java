/**
 * Created by Rukshar Alam on 10/11/2019.
 */
import  java.util.*;
public class Triangle1064A {

    // Function to calculate for validity
    public static boolean checkValidity(int a,
                                    int b, int c)
    {
        // check condition
        if (a + b <= c || a + c <= b || b + c <= a)
            return false;
        else
            return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();int b = input.nextInt();int c = input.nextInt();

        if(checkValidity(a,b,c)) System.out.println("0");
        else{
            //Approach 1
            /*
            int largest = Math.max(a,Math.max(b,c));
            int others = (a+b+c)-largest;
            int answer = largest-others+1;
            System.out.println(answer); */

            //approach 2

            int perimiter = 100000;
            for(int i = a;i<=100;i++){
                for(int j =b;j<=100;j++){
                    for(int k =c;k<=100;k++){
                        if(checkValidity(i,j,k)){
                            perimiter = Math.min(i+j+k,perimiter);
                        }

                    }
                }
            }
            int ans = perimiter - (a+b+c);
            System.out.println(ans);
        }
    }
}
