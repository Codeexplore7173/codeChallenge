
import java.util.Scanner;

public class day_one {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter size of array1: ");
        int size1=scn.nextInt();

        System.out.println("Enter size of arr2: ");
        int size2=scn.nextInt();
        
        int[] arr1=new int[size1];
        int[] arr2=new int[size2];

        System.out.println("Enter element of array1: ");
        for(int i=0;i<size1;i++){
            arr1[i]=scn.nextInt();
        }

        System.out.println("Enter element of array2:");
        for(int i=0;i<size1;i++){
            arr2[i]=scn.nextInt();
        }

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr2[j]<arr1[i]){
                    int temp=arr1[i];
                    arr1[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }
        
        for(int i=0;i<arr2.length;i++){
            for(int j=i+1;j<arr2.length;j++){
                if(arr2[i]>arr2[j]){
                    int temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }
        
        
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr2[i]+" ");
        }

    }
}
