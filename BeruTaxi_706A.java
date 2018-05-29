import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/21/2018.
 */
public class BeruTaxi_706A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int n = sc.nextInt();
        double x[] = new double[n];
        double y[] = new double[n];
        double v[] = new double[n];

        double minTime = Integer.MAX_VALUE;

        for(int i = 0;i<n;i++){
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
            v[i] = sc.nextDouble();

            double temp1 =( x[i]-a)*( x[i]-a);
            double temp2 = (y[i]-b)*(y[i]-b);
            double temp3 = temp1+temp2;
            double distance = Math.sqrt(temp3);
            double time = distance/v[i];
            if(time<minTime){
                minTime = time;
            }
        }

        System.out.println(minTime);


    }
}
