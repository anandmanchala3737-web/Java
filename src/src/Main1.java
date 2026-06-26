import java.util.LinkedList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // 1. Using JCF LinkedList instead of a custom class
        LinkedList<Integer> list = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        int value;
        int ch;
        
        do {
            System.out.println("1.Insert at begin");
            System.out.println("2.Delete at begin");
            System.out.println("3.Display");
            System.out.println("Enter the choice:");
            ch = s.nextInt();
            
            switch (ch) {
                case 1 -> {
                    System.out.println("Enter the value:");
                    value = s.nextInt();
                    // 2. JCF equivalent to insertBegin() is addFirst()
                    list.addFirst(value); 
                }
                case 2 ->{
                    System.out.println("The "+list.removeFirst()+" is deleted");
                    System.out.println();
                }
                case 3 -> {
                    // 3. Simple for-each loop to print elements in your "->" format
                    for (int num : list) {
                        System.out.print(num + "->");
                    }
                    System.out.println("NULL");
                }
                default -> System.out.println("Invalid");
            }
        } while (ch != 3); // Keeps your original exit condition intact

        s.close();
    }
}