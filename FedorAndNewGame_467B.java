import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/1/2018.
 */
public class FedorAndNewGame_467B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt();
        int k = sc.nextInt();

        int a[]= new int[m+1];

        for(int i = 0;i<m+1;i++){
            a[i] = sc.nextInt();
        }

        String s[]=new String[m+1];

        String zero = "";

        for(int i = 0;i<n;i++){
            zero += "0";
        }

        String zeros = zero;
        for(int i = 0;i<m+1;i++){

            int myinteger = a[i];
            String bitsnlz = Integer.toBinaryString( myinteger );
            String lz = zeros.substring( 0, n - bitsnlz.length() );
            String bitslz = lz.concat( bitsnlz );

            s[i] = bitslz;

        }

        String fedor = s[m];

        int friends = 0;

        for(int i = 0;i<m;i++){
            String temp = s[i];
            int diff = 0;
            for(int j = 0;j<n;j++){
                char f = fedor.charAt(j);
                char t = temp.charAt(j);

                if(f!=t){
                    diff++;
                }
            }

            if(diff<=k){
                friends++;
            }
        }

        System.out.println(friends);

    }
}
