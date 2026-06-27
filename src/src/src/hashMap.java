import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        int[] arr = {34, 12, 78, 9, 56, 1, 90, 45, 23, 67, 89, 10, 5, 99, 32};
        System.out.println("Bubble Sort:");
        display(Bubble_sort(arr));
        System.out.println("\nInsertion Sort:");
        display(insertion_sort(arr));
        System.out.println("\nQuick sort:");
        display(qs(arr, 0, arr.length-1));
        System.out.print("\nMarge sort:");
        margeSort(arr,0,arr.length-1);
        display(arr);
    }
    // -----------------**********--------------------
    static void margeSort(int[] arr, int low, int high){
        if(low>=high)
           return ;

        int mid = (low+high)/2;

            margeSort(arr,low,mid);
            margeSort(arr,mid+1,high);
            marge(arr,mid,low,high);
        
    }

    static void marge(int[] arr, int mid, int low, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low; i<=high; i++){
            arr[i]=temp.get(i-low);
        }
    }
// -----------------**************-------------------------------
     static int[] qs(int[] arr, int low, int high){
            if(low<high){
            int pIndex = quictSort(arr, low, high);
            qs(arr, low, pIndex-1);
            qs(arr, pIndex+1, high);
        }
        return arr;
    }

    static int quictSort(int[] arr, int low, int high){
        int pivat = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivat && i<=high-1){
                i++;
            }
            while(arr[j]>pivat && j>=low+1){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr, low,j);
        return j;
    }
// ----------------------*********************----------------------
    static int[] Bubble_sort(int[] arr){
        int n= arr.length;
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    return arr;
    }
// ---------------------****************---------------------------
    static int[] insertion_sort(int[] arr){
        int n = arr.length;
        for(int i=1; i<=n-1; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;        
                    j--;  
            }
        }
        return arr;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void display(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
