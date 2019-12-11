import java.util.Scanner;

/**
 * Created by Rukshar Alam on 12/11/2019.
 */
public class JeffDigit_352A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        boolean zeroPresent = false; int countFive = 0, countZero = 0;

        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();

            if(a[i]==0) {
                zeroPresent=true;countZero++;
            }else countFive++;
        }

        int divByNine[] = new int[countFive+1];
        for(int i =1;i<=countFive;i++){
            divByNine[i]=(5*i)%9;
        }

        if(zeroPresent == false ) System.out.println("-1");
        else {

            if(countFive ==0 ) System.out.println("0");
            else{
                int maxfives=-1;
                for(int i = countFive;i>=1;i--){
                    if(divByNine[i]==0) {
                        maxfives = i; break;
                    }
                }

                if(maxfives==-1) System.out.println("0");
                else{
                    for(int i = 1;i<=maxfives;i++){
                        System.out.print("5");
                    }
                    for(int i = 1;i<=countZero;i++){
                        System.out.print("0");
                    }

                }
            }
        }


    }
}
