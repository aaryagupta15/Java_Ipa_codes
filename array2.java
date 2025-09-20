import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        subarray_equal_sum();   
    }

    static void target_sum(){
        int[] arr = {4,6,3,5,8,2};
        int sum = 7;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+ arr[j] == sum){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    static void target_sum_pointer(){
        int[] arr = {4,6,3,5,8,2};
        Arrays.sort(arr);
        int sum = 7;
        int count = 0;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            if(arr[start]+arr[end]==sum){
                count++;
                start++;
                end--;
            }
            else if(arr[start]+arr[end]<=sum){
                start++;
            }
            else{
                end--;
            }
        }
        System.out.println(count);
    }

    static void unique_number(){
        int[] arr = {1,0,2,2,4,3,3,1,4};
        int prod = 0;
        for(int i=0;i<arr.length;i++){
            prod = prod ^ arr[i];
        }
        System.out.println(prod);
    }

    static void repeated(){
        int[] arr = {1,2,4,3,6,7,3,4,5};
        int start = 0;
        int end = start+1;
        boolean found = false;

        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    found = true;
                    break;
                }
                if(found == true){
                    break;
                }
            }
        }
        if(found == false){
            System.out.println(-1);
        }        
    }
    static void reverse(int arr[], int start, int end){
        // int arr[] = {1,2,3,4,5};
        // int start = 0;
        // int end = arr.length-1;
        while(start<end){
            int temp =arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotate_k(){
        int arr[] = {1,2,3,4,5};
        int k = 2;
        reverse(arr,0,k);
        reverse(arr,k+1,arr.length-1);
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort_0_1_2(){
        int arr[] = {0,1,2,2,1,1,0,1,2,1,0};
        int count_0 = 0;
        int count_1 = 0;
        for(int num : arr){
            if(num == 0){
                count_0 ++;
            }
        }
        for(int num : arr){
            if(num == 1){
                count_1 ++;
            }
        }
        for(int i=0;i<=count_0;i++){
            arr[i] = 0;
        }
        for(int i=count_0 + 1;i<=count_1;i++){
            arr[i] = 1;
        }
        for(int i=count_1 + 1;i<arr.length;i++){
            arr[i] = 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void sort_even_odd(){
        int arr[] = {1,2,3,4,5,6};
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            if(arr[end]%2==0 && arr[start]%2!=0){
                int temp =arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            else if(arr[start]%2==0){
                start ++;
            }
            else{
                end --;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void squares_sorted(){
        int arr[] = {100,1,2,-3,4,-10,5,6};

        int[] result = new int[arr.length];
        int start = 0;
        int end = arr.length-1;
        int idx = arr.length-1;
        while(start<=end){
            int leftSquare = arr[start] * arr[start];
            int rightSquare = arr[end] * arr[end];

             if (leftSquare < rightSquare) {
                result[idx] = leftSquare;
                start++;
            } else {
                result[idx] = rightSquare;
                end--;
            }
            idx--;
        }
        System.out.println(Arrays.toString(result));
    }

    static void prefix_sum(){
        int[] arr = {2,1,3,4,5};
        int[] brr = new int[arr.length];
        brr[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            brr[i] = arr[i] + brr[i-1];
        }
        System.out.println(Arrays.toString(brr));
    }

    static void range_sum(){
        int[] arr = {0,2,4,1,3,6};
        int l=1;
        int r=3;
        int pref = 0;
        for(int i=l;i<=r;i++){
            pref = pref + arr[i];
        }
        System.out.println(pref);
    }

    static void subarray_equal_sum(){
        int[] arr = {5,3,2,6,3,1};
        int pref = arr[0];
        int suff = 0;
        int total_sum = 0;
        boolean ans = false;

        for(int num : arr){
            total_sum = total_sum + num;
        }

        for(int i=1;i<arr.length;i++){
            pref = pref + arr[i];
            suff = total_sum - pref;
            if(pref == suff){
                ans = true;
                break;
            }
        }
        System.out.println(ans);
    }
}
