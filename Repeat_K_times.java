
import java.util.HashSet;
import java.util.Scanner;

public class Repeat_K_times {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size=scn.nextInt();

        int[] arr=new int[size];
        
        System.out.println("Enter value of K: ");
        int k=scn.nextInt();

        System.out.println("Enter elements of array: ");
        for(int i=0;i<size;i++){
            arr[i]=scn.nextInt();
        }

        int ele=-1;
        boolean found=false;
        HashSet<Integer> ht=new HashSet<>();

        for(int i=0;i<size && !found;i++){

            if(ht.contains(arr[i])){
                continue;
            }

            int freq=1;
            for(int j=i+1;j<size;j++) {
                if(arr[i]==arr[j]){
                    freq++;
                    
                }
            }

            ht.add(arr[i]);

            if(k==freq){
                    ele=arr[i];
                    found=true;
                    break;
            }
        }
        
        System.out.println();
        if(ele==-1){
            System.out.println(-1);
        }else{
            System.out.println(ele);
        }


    }
}
