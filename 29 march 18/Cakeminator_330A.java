import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/27/2018.
 */
public class Cakeminator_330A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();

        String s[] = new String[r];
        for(int i =0;i<r;i++){
            String  t = sc.nextLine();

            s[i] = t;
        }

        int r_prime = 0;
        int c_prime = 0;
        for(int i = 0;i<r;i++){
            int index = s[i].indexOf('S');
            if(index!= -1)
                r_prime++;
        }

        for(int i = 0;i<c;i++){
            for(int j =0;j<r;j++){
                char ch = s[j].charAt(i);
                if(ch == 'S'){
                    c_prime++;
                    break;
                }
            }
        }

        //System.out.println(r_prime+" "+c_prime);

        System.out.println(r*c - r_prime*c_prime);


    }
}
