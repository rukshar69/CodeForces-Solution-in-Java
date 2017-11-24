import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/24/2017.
 */
public class BustoUdayland_711A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String configBus[] = new String[n];


        for(int i = 0;i<n;i++){
            String temp = sc.nextLine();

            configBus[i] = temp;

        }

        //System.out.println();

        /*for(int i = 0;i<n;i++){
            System.out.println(configBus[i]);
        }*/

        String result[]= new String[n];
        boolean done = false;

        for(int i = 0;i<n;i++){
            String temp = configBus[i];

            if((temp.charAt(0)=='O'&& temp.charAt(1)=='O') && done == false){
                StringBuilder t = new StringBuilder(temp);
                t.setCharAt(0,'+');
                t.setCharAt(1,'+');
                String temp2 = new String (t);
                //System.out.println(temp2);

                result[i] = temp2;
                done = true;
            }
            else if ((temp.charAt(3)=='O'&& temp.charAt(4)=='O') && done == false){
                StringBuilder t = new StringBuilder(temp);
                t.setCharAt(3,'+');
                t.setCharAt(4,'+');
                String temp2 = new String (t);
                //System.out.println(temp2);

                result[i] = temp2;
                done = true;
            }
            else{
                result[i]=configBus[i];
            }

        }

        if (done == true) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        for(int i = 0;i<n && done;i++){
            System.out.println(result[i]);
        }



    }
}
