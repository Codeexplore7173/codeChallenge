
import java.util.ArrayList;
import java.util.Scanner;

public class Sliding_window_max {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("array size: ");
        int size=scn.nextInt();

        int[] arr=new int[size];

        ArrayList<Integer> finallist = new ArrayList<>();
        
        System.out.println("enter window size: ");
        int winsize=scn.nextInt();

        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++){
            arr[i]=scn.nextInt();
        }

        for(int i=0;i<=size-winsize;i++){
            int max=arr[i];
    
            for(int j=i;j<i+winsize;j++){
                if(arr[j]>max){
                    max=arr[j];
                    
                }
                
            }

            finallist.add(max);
        }

        System.out.println(finallist);
    }
}
