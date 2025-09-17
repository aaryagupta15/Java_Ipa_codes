import java.util.*;

public class ipa15 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[5];
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            int a = sc.nextInt(); sc.nextLine();
            int b = sc.nextInt(); sc.nextLine();

            int count = 0;
            int sum = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>a && arr[i]<b){
                    sum = sum + arr[i];
                    count++;
                }
            }
            System.out.println(sum/count);
    }
    
}
