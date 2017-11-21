import java.util.Scanner;
public class Buttons268B
{
    public static void main(String[] args)
    {
        Scanner z=new Scanner(System.in);
        long n=z.nextLong();
        long result = 0;
         result += n ;
         result+= n*(n*(n+1))/2;
         result-=(n*(n+1)*(2*n+1))/6;

        System.out.println(result);
    }
}