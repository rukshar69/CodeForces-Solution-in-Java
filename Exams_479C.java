import java.util.*;

/**
 * Created by Rukshar Alam on 4/3/2018.
 */



public class Exams_479C  {


    static class Date{
        private int a;
        private int b;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public Date(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    static class comparison implements Comparator<Date>{
        @Override
        public int compare(Date t1, Date t2) {
            int result = t1.getA() - t2.getA();
            if (result == 0)
                result = t1.getB() - t2.getB();

            return result;
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        ArrayList<Date>d = new ArrayList<Date>();

        for(int i =0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            d.add(new Date(x,y));
        }


        Collections.sort(d, new comparison());

        /*for(Date dt:d){
            System.out.println(dt.getA()+" "+dt.getB());
        }*/

        int minDate = -1;

        for(Date dt:d){
            //System.out.println(dt.getA()+" "+dt.getB());
            if(minDate<=dt.getB()){
                minDate = dt.getB();
            }
            else {
                minDate = dt.getA();
            }
        }
        System.out.println(minDate);
    }
}
