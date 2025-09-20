import java.util.*;

class Arrays1{
    void array_access(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    int array_sum(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    int array_max(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    void array_second_max(){
        int[] arr = {-1,-2,-3,-4};
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>second_max && arr[i]< max){
                second_max = arr[i];
            }
        }
        System.out.println(second_max);
    }

    int array_find(int arr[], int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    int array_occur(int arr[], int x){
        int count = 0;
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count = count+1;
                found = true;
            }
        }
        if(found == false){
            return -1;
        }
        return count;
    }

    int array_last_occur(int arr[], int x){
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    int array_greater_x(int arr[], int x){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count = count+1;
            }
        }
        return count;
    }

    boolean array_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    void array_smallest_largest(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] ans = new int[2];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        ans[0] = max;
        ans[1] = min;
        
        for(int num : ans){
            System.out.print(num + " ");
        }
    }

    void array_swap(int arr[], int ind1, int ind2){
        System.out.println("Before swapping: " + Arrays.toString(arr));
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp; 
        System.out.print("After swapping: "+ Arrays.toString(arr));
    }

    void array_reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp; 
            start++;
            end--;
        }
        System.out.print("After reversing: "+ Arrays.toString(arr));
    }
}

class array1{
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);

        // int arr3[] = new int[5];
        // for(int i=0;i<arr3.length;i++){
        //     arr3[i] = sc.nextInt();
        // }

        // int arr2[] = {1,2,3,4,5,5,5,6};
        // Arrays1 obj1 = new Arrays1();

        // obj1.array_access(arr2);
        // System.out.println();
        // System.out.print(obj1.array_sum(arr2));
        // System.out.println();
        // System.out.print(obj1.array_max(arr2));
        // System.out.println();
        // System.out.print(obj1.array_find(arr2,10));
        // System.out.println();
        // System.out.print(obj1.array_occur(arr2,5));
        // System.out.println();
        // System.out.print(obj1.array_last_occur(arr2,5));
        // System.out.println();
        // System.out.print(obj1.array_greater_x(arr2,2));
        // System.out.println();
        // System.out.print(obj1.array_sort(arr2));
        // System.out.println();
        // obj1.array_smallest_largest(arr2);
        // System.out.println();
        // obj1.array_swap(arr2, 1, 3);
        // System.out.println();
        // obj1.array_reverse(arr2);
        // System.out.println();
        // System.out.println("Second max: ");
        // obj1.array_second_max();
        // arr2[3] = 12; // Directly modified
        // System.out.println("After modifying element: "+ Arrays.toString(arr2)); // New Printing type

        // // // String[] arr5 = new String[5]; // String Array
        // // // for(int i=0;i<arr5.length;i++){
        // // //     arr5[i] = sc.next();
        // // // }
        // // // for(String num : arr5){ // New Input Type
        // // //     System.out.print(num + " ");
        // // // }

        // int arr2d2[][] = { // 2d array
        //     {1,2,3},
        //     {4,5},
        //     {6,7,8,9}
        // };
        // for(int i=0;i<arr2d2.length;i++){ // Printing 2d array
        //     for(int j=0;j<arr2d2[i].length;j++){
        //         System.out.print(arr2d2[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // for(int[] num : arr2d2){ // New Printing 2d array
        //     System.out.println(Arrays.toString(num));
        // }


        // // int arr2d1[][] = new int[3][]; // 2d array for no columns defined
        // // for(int i=0;i<arr2d1.length;i++){ // Input 2d array with no columns defined
        // //     System.out.println("Enter the number of columns for this row: ");
        // //     int cols = sc.nextInt();
        // //     arr2d1[i] = new int[cols];
        // //     for(int j=0;j<cols;j++){
        // //         arr2d1[i][j] = sc.nextInt();
        // //     }
        // // }
        // // for(int i=0;i<arr2d1.length;i++){ // New Printing 2d array
        // // System.out.println(Arrays.toString(arr2d1[i]));
        // // }


        // String[] arr = new String[5]; // object inside array is string i.e. refrence
        // for(String num : arr){
        //     System.out.print(num + " "); // null
        // }

        // int[] arr6 = new int[5]; // object inside array is int i.e. primitive
        // for(int num : arr6){
        //     System.out.print(num + " "); // 0
        // }

        Pascal_triangle();
    }

    static void add(){
        int[][] arr1 = {{1,2,3},
                       {2,3,4},
                       {4,5,6}};

        int[][] arr2 = {{1,2,3},
                       {2,3,4},
                       {4,5,6}};   
        
        int[][] arr3 = new int[arr1.length][arr1.length];
                       
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];                
            }
        }

        for(int i=0;i<arr3.length;i++){
            System.out.println(Arrays.toString(arr3[i]));
        }
    }

    static void transpose(){
        int r=3; 
        int c=4;
        int[][] arr1 = new int[][] {
                                    {1,2,3,7},
                                    {2,3,4,8},
                                    {4,5,6,9}
                                   };     

        int[][] arr3 = new int[c][r];
        // int temp = 0;

        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                // temp = arr1[i][j];
                // arr1[i][j] = arr1[j][i];
                // arr1[j][i] = temp;
                arr3[i][j] = arr1[j][i];
            }
        }
        for(int i=0;i<arr3.length;i++){
            System.out.println(Arrays.toString(arr3[i]));
        }               
    }

    static void clockwise_90(){
        int[][] arr1 = {{1,2,3},
                       {2,3,4},
                       {4,5,6}};

            for(int i=0;i<arr1.length;i++){
            for(int j= i + 1; j < arr1[0].length;j++){
                int temp = arr1[i][j];
                arr1[i][j] = arr1[j][i];
                arr1[j][i] = temp;
            }
        }

        for(int i=0;i<arr1.length;i++){
            System.out.println(Arrays.toString(arr1[i]));
        } 

        System.out.println();
            for(int i=0;i<arr1.length;i++){
            int start = 0;
            int end = arr1[i].length-1;
            while(start<end){
                int temp = arr1[i][start];
                arr1[i][start] = arr1[i][end];
                arr1[i][end] = temp;
                start++;
                end--;
            }
        }    
            for(int i=0;i<arr1.length;i++){
                System.out.println(Arrays.toString(arr1[i]));
        }     
    }

    static void Pascal_triangle(){
        int n=4;
         for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
         }            
    }
}