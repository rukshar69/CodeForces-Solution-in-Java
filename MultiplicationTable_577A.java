import java.util.Scanner;

/**
 * Created by Rukshar Alam on 1/3/2018.
 */
public class MultiplicationTable_577A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();int x = sc.nextInt();

        int count = 0;

        for(int i = 1;i<=Math.sqrt((double)(x));i++){


            if(x%i == 0){
                int a = i;
                int b = x/i;

                if(a<= n && b<= n){
                    if(a!=b){
                    count += 2;
                    //System.out.println(a+" "+b);
                    }
                    else
                    {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
