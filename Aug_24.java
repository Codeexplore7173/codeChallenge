
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Aug_24 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        List<List<String>> list= new ArrayList<>();

        HashSet<String> visit=new HashSet<>();

        System.out.println("Enter size: ");
        int size=scn.nextInt();

        String[] str=new String[size];

        System.out.println("Enter strings: ");

        for(int i=0;i<size;i++){
            str[i]=scn.next();
        }

        for(int i=0;i<size;i++){

            if(visit.contains(str[i])) continue;

            List<String> temp=new ArrayList<>();
            temp.add(str[i]);
            visit.add(str[i]);
            for(int j=i+1;j<size;j++){
                if(!visit.contains(str[j])&& isAnagram(str[i], str[j])){
                    temp.add(str[j]);
                    visit.add(str[j]);
                }
            }

            if(temp.size()>=1){
                list.add(temp);
            }

        }

        System.out.println(list);
        
    }

    public static boolean isAnagram(String str1, String str2){
        if(str1.length()!=str2.length()) return false;

        char[] a=str1.toCharArray();
        char[] b=str2.toCharArray();
 

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
