
import java.util.Scanner;
import java.util.Stack;

public class Aug_26 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        Stack<Character> stack=new Stack<>();

        System.out.println("Enter Parentheses: ");
        String str=scn.nextLine();
        
        char[] arry=str.toCharArray();

        if(arry.length==0){
            System.out.println("True");
        }
        else{
            for(int i=0;i<arry.length;i++){
            if(arry[i]=='(' || arry[i]=='{' || arry[i]=='['){
                char c=arry[i];
                stack.push(c);
            }
            if(arry[i]==')' && stack.peek()=='('){
                stack.pop();
            }
            if(arry[i]=='}' && stack.peek()=='{'){
                stack.pop();
            }
            if(arry[i]==']' && stack.peek()=='['){
                stack.pop();
            }
          }
        }

        if(stack.isEmpty()){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
