import java.util.Scanner;

/**
 * Created by Rukshar Alam on 6/22/2017.
 */
public class NewYearTransportation {
    public static void main(String[] args) {
        int n, t;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); t = sc.nextInt();

        int a[] = new int[n];
        for(int i = 1;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        int currentIndex = 1;
        boolean done = false;
        while (currentIndex<n)
        {
            currentIndex = currentIndex + a[currentIndex];

            if(currentIndex == t)
            {
                done = true; break;

            }
            else if(currentIndex > t)
            {
                break;
            }
            
        }
        if(done)
        {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
