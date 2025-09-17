import java.util.*;

public class ipa20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Med[] arr = new Med[4];
        for (int i = 0; i < arr.length; i++) {
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        int d = sc.nextInt();
        sc.nextLine();
        arr[i] = new Med(a, b, c, d);
        }
        String q = sc.nextLine();
        ArrayList<Integer>answer = medicinePriceForGivenDisease(q, arr);
        for(int i: answer){
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> medicinePriceForGivenDisease(String givendisease, Med[] arr){
        ArrayList<Integer>prices = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].getdis().equalsIgnoreCase(givendisease)){
                prices.add(arr[i].getprice());
            }
        }
        Collections.sort(prices);
        return prices;
    }
}

class Med{
    private String name;
    private String batch;
    private String dis;
    private int price;

    public String getdis() {
    return dis;
    }

    public int getprice() {
    return price;
    }

    public Med(String name, String batch, String dis, int price) {
    this.name = name;
    this.batch = batch;
    this.dis = dis;
    this.price = price;
    }
}

// Create a Class Medicine with the below attributes:
// medicineName - String
// batchNo - String
// disease - String
// price - int
// Write getters, setters and parameterized constructor as required.
// Public class Solution is already created with main method.
// Code inside main method should not be altered else your solution might be scored as zero.
// You may copy the code from main method in eclipse to verify your implementation.
// Implement static method - medicinePriceForGivenDisease in Solution class.
// This method will take a String parameter named disease along with the other parameter as array of
// Medicine objects.
// The method will return an array of Integer containing the price of the medicines in ascending order, if the
// given input(disease) matches the disease attribute of the medicine objects in the Array.
// Note : 1) Same disease can have more than one medicine.
// 2) disease search should be case insensitive.
// This method should be called from the main method and display the prices.
// Main method mentioned above already has Scanner code to read values, create objects and test above
// methods. Hence do not modify it.
// Consider below sample input and output:
// Input:
// Hyadry
// FHW0602
// EyeDryness
// 140
// Dolo
// FHW0603
// Fever
// 10
// OpsionHA
// P5011
// EyeDryness
// 435
// Mucinex
// C0011
// Cold
// 15
// EyeDryness
// Output:
// 140
// 435