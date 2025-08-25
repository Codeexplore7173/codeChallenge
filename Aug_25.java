
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aug_25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str=scn.nextLine();

        List<String> permut=new ArrayList<>();
        permut.add(str);
        String current=str;
        while (true) { 
            String next=checkpermut(current);
            if(next.equals(current)) break;
            permut.add(next);
            current=next;

        }
         
        System.out.println("All unique permutations: ");
        for(String s:permut){
            System.out.print(s+" ");
        }

    }

    public static String checkpermut(String strcheck) {
        
        int length=strcheck.length();
        char pivot;
        int position=-1;
        char[] charary=strcheck.toCharArray();
        for(int i=length-2;i>=0;i--){
            if(charary[i]<charary[i+1]){
                pivot=charary[i];
                position=i;
                break;
            }
        }

        if(position==-1) return strcheck;

        for(int i=length-1;i>position;i--){
            if(charary[i]>charary[position]){
               char temp=charary[i];
               charary[i]=charary[position];
               charary[position]=temp;
               break;
            }
        }

        int start=position+1;
        int end=length-1;
        
        while(start<end){
            char temp=charary[start];
            charary[start]=charary[end];
            charary[end]=temp;

            start++;
            end--;
        }

        String swapstr=new String(charary);

        return swapstr;
        
    }
}
