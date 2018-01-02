import java.util.Scanner;

/**
 * Created by Rukshar Alam on 1/2/2018.
 */

//Brute force -- doesn't solve all cases
public class ZeroAndOne_556A {

    static boolean isChangeable(String input){
        int len = input.length();


        for(int i = 0;i<len-1;i++){
            if(input.charAt(i) != input.charAt(i+1)){
                return true;
            }
        }

        return false;
    }

    static int[] findMismatch(String input){
        int len = input.length();

        int a[]=new int[2];
        for(int i = 0;i<len-1;i++){
            if(input.charAt(i) != input.charAt(i+1)){
                a[0] = i;
                a[1] = i+1;
            }
        }

        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();
        String input = sc.nextLine();

        //System.out.println(input);
        while (isChangeable(input)){
            int[] misMatch = findMismatch(input);
            int index1 = misMatch[0]; int index2 = misMatch[1];

            input= input.substring(0, index1) + input.substring(index2+1);
            //System.out.println(input);

        }

        System.out.println(input.length());

    }
}
