import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/21/2018.
 */
public class Drazil_Factorial_515C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        long a = sc.nextLong();
        ArrayList<Integer>arrayList = new ArrayList<>();

        while (a!= 0){
            int digit = (int)(a%10);
            a/=10;
            if (digit == 2 ) {

                //System.out.println("in 2");
                arrayList.add(2);
            }
            else if (digit == 3 ) {

                //System.out.println("in 3");
                arrayList.add(3);
            }
            else if (digit == 4 ) {

                //System.out.println("in 4");
                arrayList.add(3);
                arrayList.add(2);
                arrayList.add(2);
            }
            else if (digit == 5 ) {

                arrayList.add(5);

            }
            else if (digit == 6 ) {

                arrayList.add(5);
                arrayList.add(3);
            }
            else if (digit == 7) {

                arrayList.add(7);
            }
            else if (digit == 8) {

                arrayList.add(7);
                arrayList.add(2);
                arrayList.add(2);
                arrayList.add(2);
            }
            else if (digit == 9) {

                arrayList.add(7);
                arrayList.add(3);
                arrayList.add(3);
                arrayList.add(2);
            }
        }

        Collections.sort(arrayList);
        int size = arrayList.size();
        for(int i = size-1;i>=0;i--){
            System.out.print(arrayList.get(i));
        }
    }
}
