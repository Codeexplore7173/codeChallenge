import java.util.HashSet;
import java.util.Scanner;

public class Aug_28 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.println("Enter String: ");
        String str=scn.nextLine();

        System.out.println("Enter k value: ");
        int k=scn.nextInt();

        int length=str.length();
        int counter=0;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<=length;j++){
                if(distictchar(str.substring(i, j),k)){
                   counter++;
                }
            }
        }

        System.out.println(counter);
    }

    public static boolean distictchar(String str,int s){

        char[] a=str.toCharArray();
         HashSet<Character> chars=new HashSet<>();
        int max=s;
        for(int i=0;i<a.length;i++){ 
           chars.add(a[i]);
        }
        
        return chars.size()==max;
    }
}
