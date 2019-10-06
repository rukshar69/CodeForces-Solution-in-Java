/**
 * Created by Rukshar Alam on 10/1/2019.
 */

import java.util.Scanner;
public class Vacations698A {
    public static void main(String[] args) {
        //System.out.println("hello world");
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i] = input.nextInt();
        }


        int minDaysRest[][] =new int[n+1][2];
        minDaysRest[0][0] = 0; minDaysRest[0][1] = 0;


        for(int i =1;i<=n;i++){
            //fill the gym
            if(a[i-1]==2 || a[i-1]==3){

                minDaysRest[i][0] = Math.min(minDaysRest[i-1][1],Math.min(minDaysRest[i-1][0],minDaysRest[i-1][1])+1);
            }
            else{

                minDaysRest[i][0] = Math.min(minDaysRest[i-1][0],minDaysRest[i-1][1])+1;

            }

            //fill the contest
            if(a[i-1]==1 || a[i-1]==3){

                minDaysRest[i][1] = Math.min(minDaysRest[i-1][0],Math.min(minDaysRest[i-1][0],minDaysRest[i-1][1])+1);
            }
            else{

                minDaysRest[i][1] = Math.min(minDaysRest[i-1][0],minDaysRest[i-1][1])+1;

            }
        }

        /*
        for(int i =0;i<=n;i++){
            System.out.println(minDaysRest[i][0]+" "+minDaysRest[i][1]);
        }*/

        int minRest = Math.min(minDaysRest[n][0],minDaysRest[n][1]);
        System.out.println(minRest);
    }
}
