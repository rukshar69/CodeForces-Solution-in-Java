import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/14/2018.
 */
public class AsphaltingRoads_583A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean hused[] = new boolean[n+1];
        boolean vused[] = new boolean[n+1];
        for(int i = 0;i<=n;i++) hused[i]=false;
        for(int i = 0;i<=n;i++) vused[i]=false;
        ArrayList<Integer> arrayListI = new ArrayList<>();

        for(int i = 1;i<=n*n;i++){
            int tempi = sc.nextInt();
            int tempj = sc.nextInt();
            //System.out.println(tempi+" "+tempj);
            //System.out.println(hused[tempi]+" "+vused[tempj]);
            if(hused[tempi]==false && vused[tempj] == false){
                arrayListI.add(i);

                hused[tempi]  = true;
                vused[tempj] = true;

            }

        }

        int size = arrayListI.size();

        for(int i = 0;i<size;i++){
            System.out.print(arrayListI.get(i)+" ");
        }


    }
}
