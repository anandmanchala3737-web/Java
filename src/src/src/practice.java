
import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int hashArr[]=new int[6];
        int n;
        System.out.println("Enter the no.of elements:");
        n=s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numners:");
        for(int i =0; i<n; i++){
            arr[i] =s.nextInt();
        }
        // System.out.println();
        // for(int i=0; i<n; i++){
        //     System.out.println(arr[i]);
        // }

        for(int i=0; i<n; i++){
            hashArr[arr[i]]++;
        }


        for(int i=0; i<6; i++){
            System.out.println(i+"->"+hashArr[i]);
        }

        s.close();


    }   
}
