
import java.util.Scanner;

public class Trapping_rain_water {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size=scn.nextInt();

        System.out.println("Enter elements of array: ");
        int[] arr=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=scn.nextInt();
        }

        int sum=0;

        for(int i=1;i<size;i++){
            int leftmax=0;
            int rightmax=0;
        
            for(int j=0;j<i;j++){
                if(arr[j]>leftmax){
                    leftmax=arr[j];
                }
            }

            for(int j=i+1;j<size;j++){
                if(arr[j]>rightmax){
                    rightmax=arr[j];
                }
            }
            
            int min=Math.min(leftmax, rightmax);
            
            if(min>arr[i]){
                sum+=min-arr[i];
            }
           
            
        }

        System.out.println("Total water trapped: "+sum);
    }
}
