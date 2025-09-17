import java.util.*;
public class ipa10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(); 
        int count = 0;
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(ch<=122 && ch>=97 ){
                count++;
            }
        }
        if(count == 0){
            System.out.println("No lower case present");
        }
        else{
            System.out.println(count);
        }
    }
}
