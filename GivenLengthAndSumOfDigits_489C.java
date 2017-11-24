import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/23/2017.
 */
public class GivenLengthAndSumOfDigits_489C {

    static  boolean possible(int m , int s){
        boolean condition1 = s>=0;
        boolean condition2 = s<=9*m;
        return  condition1 && condition2;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m = sc.nextInt();
        int s = sc.nextInt();

        boolean condition1 = s<=0 && m>1;
        boolean condition2 = s> 9*m;


        if(condition1 || condition2){
            System.out.println("-1 -1");
        }
        else
        {
            int sum = s;
            String min = "";
            String max = "";

            for(int pos = 0;pos<m;pos++){
                for(int digit = 0;digit<=9;digit++){
                    if((pos>0||digit>0||(m == 1 && digit==0)) && possible(m-pos-1, sum - digit)){
                        min += ( digit);
                        sum -= digit;
                        //System.out.println(min);
                        break;
                    }
                }


            }

            sum  = s;

            for(int pos = 0;pos<m;pos++){
                for(int digit = 9;digit>=0;digit--){
                    if( possible(m-pos-1, sum - digit)){
                        max += ( digit);
                        sum -= digit;
                        break;
                    }
                }
            }

            System.out.println(min+" "+max);
        }
    }
}
