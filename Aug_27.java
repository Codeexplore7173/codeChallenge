import java.util.Scanner;

public class Aug_27 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter String: ");
        String str=scn.nextLine();
        String ans="";
        
        int length=str.length();

        for(int i=0;i<length;i++){
            int l=i, r=i;

            while(l>=0 && r<length && (str.charAt(l)==str.charAt(r))){
                 if((r-l+1)>ans.length()){
                    ans=str.substring(l,r+1);
                 }

                 l--; r++;
            }

            l=i; r=i+1;
            
            while(l>=0 && r<length && (str.charAt(l)==str.charAt(r))){
                 if((r-l+1)>ans.length()){
                    ans=str.substring(l,r+1);
                 }

                 l--; r++;
            }
        }

        System.out.println("Longest palindrome:"+ans);
    }
}
