
import java.util.ArrayList;
import java.util.Scanner;

public class Aug_19 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size=scn.nextInt();

        int[] arr=new int[size];

        ArrayList<Integer> arrlist=new ArrayList<>();

        System.out.println("Enter array elements: ");
        for(int i=0;i<arr.length;i++){
             arr[i]=scn.nextInt();
        }

        if(arr.length==1){
            arrlist.add(arr[0]);
        }
        else{
            
           for(int i=0;i<arr.length;i++){
            int counter=0;
            for(int j=i+1;j<arr.length;j++){
                 if(arr[i]>arr[j]){
                     counter++;
                 }  
            }
            if(counter==arr.length-(i+1)){
                arrlist.add(arr[i]);
            }
          }
        }

        System.out.println("Leaders are: ");
        System.out.println(arrlist);

        //..

        
        
    }
}
