

public class practice {

    public static void main(String[] args) {

        int[] arr={1000,12,-3,-10,4,-5,0};
        int n = arr.length;
        System.out.println("Before Sort:");
        for(int i : arr){
            System.out.print(i+" ");
        }
        bubbleRecursive(arr, n);
        System.out.println("\nAfter Sort:");
        for(int i : arr){
            System.out.print(i+" ");
        }


    }   
    static void bubbleRecursive(int[] arr , int n){

        if(n==1){
            return ;
        }

        
        for(int i=0; i<=n-2; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleRecursive(arr, n-1);
    }
}
