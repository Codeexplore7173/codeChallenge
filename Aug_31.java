
import java.util.ArrayList;
import java.util.Scanner;

public class Aug_31 {

    //prime factorization..
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter number: ");
        int N=scn.nextInt();

        ArrayList<Integer> list=new ArrayList<>();

        while(N%2==0){
            list.add(2);
            N=N/2;
        }

        int limit=(int)Math.sqrt(N);

        for(int i=3;i<=limit;i=i+2){
            while(N%i==0){
                list.add(i);
                N=N/i;
                limit=(int)Math.sqrt(N);
            } 
        }

        if(N>2){
            list.add(N);
        }

        System.out.println(list);

    }
}
