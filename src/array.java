public class array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.print("Array is:");
        System.out.println(isSorted(arr));
        int[] temp=OLR(arr);
        for(int num:temp){
            System.out.print(num+" ");
        }
    }
    static boolean isSorted(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            if(arr[i]<arr[i+1]){
                return true;
            }
        }
        return false;
    }
// ---------------************----------------------------
    static int removeDupli(int[] arr){
        int n = arr.length;
        int[] arr1= new int[5];
        for(int i=0; i<=n-1; i++){
            if(arr[i]==arr[i+1]){
                arr1[i]=arr[i];
            }
        }
        int len = arr1.length;
        return len;
    }
// --------------------------*************------------------------------

    static int secLarge(int[] arr){
        int n = arr.length;
        int max=0;
        int sec_max=0;
        for(int i=1; i<n; i++){
            if(arr[max]<arr[i] && arr[sec_max]<arr[i]){
                sec_max=max;
                max=i;
            }
        }
        return sec_max;
    }
    static int[] OLR(int[] arr){
        int k=2;
        int n = arr.length;
        int[] temp = new int[6];
        int j =0;
        while(k!=0){
            for(int i=k; i<n; i++){
            temp[j]=arr[i];
            j++;
            k--;
        }
        temp[n-1]=arr[0];
        }
        return temp;
    }
}