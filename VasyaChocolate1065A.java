/**
 * Created by Rukshar Alam on 10/19/2019.
 */
import java.util.*;
public class VasyaChocolate1065A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        for(int t=0;t<T;t++){
            long s = input.nextLong();long a = input.nextLong();long b = input.nextLong();long c = input.nextLong();

            long boughtChocolate = s/c;
            long extraChoco = (boughtChocolate/a)*b;
            System.out.println(boughtChocolate+extraChoco);
        }


    }
}
