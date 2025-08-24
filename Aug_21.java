
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aug_21 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        
        System.out.println("Enter size: ");
        int size=scn.nextInt();

        int[] arr=new int[size];

        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<size;i++){
            arr[i]=scn.nextInt();
        }

        for(int i=0;i<size;i++){
            int sum=0;
            for(int j=i;j<size;j++){
                sum+=arr[j];
                if(sum==0){
                    List<Integer> group=new ArrayList<>();
                    group.add(i);
                    group.add(j);

                    list.add(group);
                }
            }
        }

        System.out.println(list);

    }
}
