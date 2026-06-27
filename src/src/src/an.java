import java.util.Scanner;
import java.util.Stack;

public class an{
      public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<=10; i++){
            System.out.println("Enter a number:");
            int elements=s.nextInt();
            if(elements==00){
                break;
            }
            else{
                stack.add(elements);
            }
        }

        for(int element : stack){
            System.out.print(element+" ");
        }
        
        s.close();
        }
} 