import java.util.*;
public class ipa9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); sc.nextLine();
        int count = 0;

        while(num>0){
            int last = num%10;
            if(last%2!=0){
                count++;
            }
            num = num/10;
        }
        if(count>=3){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }    
}

// Question:
// Write the main method in the Solution class.
// In the main method, read an integer value and print "TRUE" if it contains at least 3 odd digits. Else it should
// print "FALSE".
// For example, if the value is 123456 and it contains 3 odd digits such as 1,3,5. So it should print "TRUE".
// The output should be in the format of sample output.
// Sample input1:
// 123456
// Output:
// TRUE
// Sample input2:
// 123
// Output:
// FALSE
