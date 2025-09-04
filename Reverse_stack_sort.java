
import java.util.Scanner;
import java.util.Stack;

public class Reverse_stack_sort {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter stack size: ");
        int size=scn.nextInt();

        Stack<Integer> stk=new Stack<>();

        System.out.println("Enter elements of Stack: ");
        for(int i=0;i<size;i++){
            stk.push(scn.nextInt());
        }

        System.out.println("Before reverse: ");
        System.out.println(stk);

        reversestk(stk);

        System.out.println("After reverse: "+stk);
    }

    public static void reversestk(Stack<Integer> stk){
           if(!stk.isEmpty()){
               int temp=stk.pop();
               reversestk(stk);
               insertele(stk,temp);
           }
    }

    public static void insertele(Stack<Integer> newstk, int ele){
           if(newstk.isEmpty()){
              newstk.push(ele);
           }else{
              int temp=newstk.pop();
              insertele(newstk, ele);
              newstk.push(temp);
           }
    }
}
