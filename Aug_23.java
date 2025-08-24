
import java.util.Scanner;

public class Aug_23 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("enter size: ");
        int size=scn.nextInt();

        String[] str=new String[size];
        
        for(int i=0;i<size;i++){
            str[i]=scn.next();
        }

        if(str.length==0 || str==null){
            System.out.println("");
        }
        else{
             if(str.length==1){
                System.out.println(str[0]);
             }
             else{
                 String result = null;
                 int counter=0;
                 String prefix=str[0];
                   for(int i=1;i<size;i++){
                       String c=str[i];
                       if(prefix.substring(0, 2) == null ? c.substring(0, 2) == null : prefix.substring(0, 2).equals(c.substring(0, 2))){
                       counter++;
                       result=prefix.substring(0,2);
                       }
                    }

                   if(counter>0){
                       System.out.println("longest common prefix: "+result);
                    }
                    else{
                      System.out.println("No any ");
                    }
            }
         
        }

    }
}

