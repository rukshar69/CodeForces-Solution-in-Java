import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 1/1/2018.
 */
public class TeamOlympiad_490A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[]=new int[n];
        int count1= 0; int count2= 0; int count3= 0;
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();

            if(a[i] == 1){
                count1++;
            }
            else if(a[i] == 2){
                count2++;
            }
            else if(a[i] == 3){
                count3++;
            }
        }

        int count[] ={count1,count2,count3};

        Arrays.sort(count);
        int minCount = count[0];

        System.out.println(minCount);

        for(int j = 1;j<=minCount;j++){
            boolean found1 = false; boolean found2 = false;boolean found3 = false;
            int one = -1; int two = -1;int three = -1;

            for(int i = 0;i<n;i++){
                if(found1 && found2 && found3){
                    //System.out.println(one+" "+two+" "+three);
                    break;
                }

                if(a[i] == 1 && found1 != true){
                    one = i+1; found1= true;
                    a[i] = -1;
                }
                else if(a[i] == 2 && found2 != true){
                    two = i+1; found2= true;
                    a[i] = -1;
                }
                else if(a[i] == 3 && found3 != true){
                    three = i+1; found3= true;
                    a[i] = -1;
                }
            }

            if(found1 && found2 && found3){
                System.out.println(one+" "+two+" "+three);

            }

            /*for(int i = 0;i<n;i++)
                System.out.print(a[i]+" ");
            System.out.println();*/

        }




    }
}
