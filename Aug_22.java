
import java.util.Scanner;

public class Aug_22 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter String: ");
        String str=scn.nextLine ();

        String str2=str.trim().replaceAll("\\s+", " ");

        String[] words=str2.split(" ");

        StringBuilder result=new StringBuilder();
       
        for(int i=words.length-1;i>=0;i--){
            result.append(words[i]);
            if(i>0){
                result.append(" ");
            }
        }

        String reverse=result.toString();
        System.out.println(reverse);
        
    }
}
