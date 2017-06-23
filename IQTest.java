import java.util.Scanner;

/**
 * Created by Rukshar Alam on 6/23/2017.
 */
public class IQTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        boolean oddEven[] = new boolean[n];//false even, true odd
        int evenCount = 0, oddCount =0;
        for(int i = 0;i<n;i++)
        {
            a[i] =sc.nextInt();
            if(a[i]%2 ==1)
            {
                oddCount++;
                oddEven[i]=true;
            }
            else evenCount++;
        }
        int index = 0;

        if(evenCount ==1)
        {
            for(int i =0;i<n;i++)
            {
                if(!oddEven[i])
                {
                    index = i + 1; // 1 based index
                }
            }
        }
        else
        {
            for(int i =0;i<n;i++)
            {
                if(oddEven[i])
                {
                    index = i + 1; // 1 based index
                }
            }
        }

        System.out.println(index);
    }
}
