
import java.util.Scanner;

public class Aug_30 {

    public static void main(String[] args) {
        //LCM 

        Scanner scn=new Scanner(System.in);
        
        System.out.println("Find LCM: ");
        System.out.println("Enter first no: ");
        long num1=scn.nextInt();

        System.out.println("Enter second number: ");
        long num2=scn.nextInt();

        long fianl=lcm(num1, num2);

        System.out.println("LCM: "+fianl);


    }


    public static long hcf(long a,long b){
          while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
          }

          return a;
    }

    public static long lcm(long num1,long num2){

        long lcm=(num1/hcf(num1,num2))*num2;

        return lcm;
    }
}


