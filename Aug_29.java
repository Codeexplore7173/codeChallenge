
import java.util.ArrayList;
import java.util.Scanner;

public class Aug_29 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter String: ");
        String str=scn.nextLine();

        char[] a=str.toCharArray();
       
    
        int max=0;
        for(int i=0;i<a.length;i++){
            ArrayList<Character> list=new ArrayList<>();
            list.add(a[i]);
            int counter=1;
           for(int j=i+1;j<a.length;j++){
              if(!list.contains(a[j])){
                 counter++;
                 list.add(a[j]);
              }
              else{
                break;
              }
              
           }
           if(counter>max){
              max=counter;
           }
        }

        System.out.println(max);
    }
}
