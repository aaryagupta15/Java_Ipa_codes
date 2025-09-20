import java.util.ArrayList;
import java.util.Arrays;

public class Linear_Search {
    public static int array_find(int arr[], int x){ // Array Find
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }  

    public static int arraylist_find(ArrayList<Integer>list, int x){ // ArrayList Find
        if(list.size()==0){
            return -1;
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)==x){
                return i;
            }
        }
        return -1;
    }  

    public static int string_find(String s, char x) {
        if(s.length()==0){
            return -1;
        }   
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==x){
                return i;
            }
        }     
        return -1;
    }

    public static int[] array2d_find(int[][]arr, int x){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==x){
                    return new int[]{i,j};
                }
            }
        }
        return new int []{-1};
    }

    static int digits(int num){
        if(num<0){
            num = num * -1;
        }
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }
    static int even_number_digits(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int ans = digits(arr[i]);
            if(ans%2==0){
                count ++;
            }
        }
        return count;
    }

    static int max_wealth(int arr[][]){
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[i].length;j++){
            sum = sum + arr[i][j];
            }
            if(max_sum<=sum){
                max_sum = sum;
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(array_find(arr,5));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(arraylist_find(list, 5));

        String s = "Cat";
        System.out.println(string_find(s, 'a'));

        int[][] arr2d = {
            {1,2,3},
            {3,5,6,4},
            {5,6,7,8,9}
        };
        System.out.println(Arrays.toString(array2d_find(arr2d, 4)));

        // Even Number of digits
        int[] arr3 = {12,3405,2,-12,6,7896};
        System.out.println(even_number_digits(arr3));

        //Max Wealth
        int[][] arr4 = {
            {1,5},
            {7,3},
            {3,5}
        };
        System.out.println(max_wealth(arr4));
}
}
