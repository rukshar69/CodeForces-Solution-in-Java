import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/7/2017.
 */
public class NewYearHurry_750A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int k = sc.nextInt();

        int totalTime = 240; //4 hours in minutes
        totalTime -= k;
        int timeTakenUpByContest = 0;
        int numberOfProblemsSolved =0;

        for(int i = 1;i<=n;i++){
            timeTakenUpByContest += 5*i;
            if(timeTakenUpByContest<= totalTime){
                numberOfProblemsSolved++;
            }
        }

        System.out.println(numberOfProblemsSolved);
    }
}
