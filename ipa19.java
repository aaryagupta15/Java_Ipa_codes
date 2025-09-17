import java.util.*;
public class ipa19 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String ans = sc.nextLine();
String result = "";
for (int i = 0; i < ans.length(); i++) {
if (ans.charAt(i) == 'a' || ans.charAt(i) == 'e' || ans.charAt(i) == 'i' ||
ans.charAt(i) == 'o' || ans.charAt(i) == 'u') {
result += ans.charAt(i);
}
}
String[] answer = result.split("");
Arrays.sort(answer);
System.out.println(answer[0]);
}
}