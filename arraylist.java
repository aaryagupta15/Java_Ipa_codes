import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list1 = new ArrayList<>(5);
        list1.add(66);
        System.out.println(list1);
        System.out.println(list1.contains(66));
        list1.set(0,99);
        System.out.println(list1);
        list1.remove(0);
        for(int i=0;i<5;i++){ // Input arraylist
            list1.add( sc.nextInt()); 
        }
        for(int i=0;i<5;i++){ // Printing arraylist
            System.out.print(list1.get(i) + " ");
        }
    }
}
