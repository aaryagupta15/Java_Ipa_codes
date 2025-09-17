import java.util.*;
public class ipa13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count = 0;
        a = a.toLowerCase();
        String[] arr = new String[a.length()];
        arr = a.split(" ");
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            if(arr[i].charAt(0) =='a' || arr[i].charAt(0) =='e'|| arr[i].charAt(0) =='i' || arr[i].charAt(0) =='o'|| arr[i].charAt(0) =='u'){
               count++; 
            }
        }
        if(count == 0){
            System.out.println("No String");
        }
        else{
        System.out.println(count);
        }
    }  
}

//Write main method in Solution class.
// In the main method, read a string and find the count of words starting with a vowel in the string. If no words
// are present in the String value then it should print "No String found".
// Note:
// All search should be case insensitive.
// Sample input1:
// Everyone should practice and learn to became professional.
// Output:
// 2
// Sample input2:
// hi guys
// Output:
// No String found
// Solution: