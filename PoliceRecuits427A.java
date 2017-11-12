import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/12/2017.
 */
public class PoliceRecuits427A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        int policeAvailable = 0;
        int crimeUnsolved =0;

        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i] != -1)policeAvailable+= a[i];
            else {
                if(policeAvailable==0)crimeUnsolved++;
                else  policeAvailable--;
            }
        }
        System.out.println(crimeUnsolved);
    }
}
