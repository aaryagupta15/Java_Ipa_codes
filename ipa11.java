import java.util.*;
public class ipa11 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Projector[] arr = new Projector[4];     
    for(int i=0;i<arr.length;i++){
        int a = sc.nextInt(); sc.nextLine();
        String b = sc.nextLine();
        int c = sc.nextInt(); sc.nextLine();
        int d = sc.nextInt(); sc.nextLine();
        String e = sc.nextLine();    
        arr[i] = new Projector(a,b,c,d,e);    
        }
        int givenrating = sc.nextInt(); sc.nextLine();
        Projector ans = findMaximumPriceByRating(arr,givenrating);
        if(ans == null){
            System.out.println("No such projector");
        }
        else{
            System.out.println(ans.getProjectorId());
        }
    }  

    public static Projector findMaximumPriceByRating(Projector[] arr, int givenrating){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getRating()>givenrating && arr[i].getAvailableIn().equalsIgnoreCase("TataCliq")){
                if(arr[i].getPrice()>max){
                    max = arr[i].getPrice();
                }                                
            }   
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i].getPrice() == max){
                return arr[i];
            }
        }
        return null;
    }
}

class Projector{
    private int projectorId;
    private String projectorName;
    private int price;
    private int rating;
    private String availableIn;

    Projector(int projectorId, String projectorName, int price, int rating, String availableIn){
        this.projectorId = projectorId;
        this.projectorName = projectorName;
        this.price = price;
        this.rating = rating;
        this.availableIn = availableIn;
    }

    public String getAvailableIn() {
        return availableIn;
    }
    public int getPrice() {
        return price;
    }
    public int getProjectorId() {
        return projectorId;
    }
    public String getProjectorName() {
        return projectorName;
    }
    public int getRating() {
        return rating;
    }

}

// Question:
// Create a class Projector with below attributes:
// projectorId - int
// projectorName - String
// price - int (per unit)
// rating - int
// availableIn - String (Amazon, Flipkart, TataCliq)
// The above attributes should be private, write getters, setters and parameterized constructor as required.
// Create class Solution with main method.
// Implement one static method - findMaximumPriceByRating in Solution class.
// findMaximumPriceByRating method:
// The method will return the maximum priced Projector object from array of Projector objects whichever has
// rating greater than the given rating and which is available in TataCliq.
// If no Projector with the above conditions is present in the array of Projector objects, then the method should
// return null.
// Note : No two Projector will have the same price.
//  All the searches should be case insensitive.
// The above mentioned static method should be called from the main method.
// For findMaximumPriceByRating method - The main method should print the projectorId from returned object
// if the returned value is not null else it should print "No such Projector".
// Eg: 1001
// where 1001 is the projectorId which has the maximum price.
// Before calling these static methods in main, use Scanner object to read the values of four Projector objects
// referring attributes in the above mentioned attribute sequence.
// Next, read the value of one int parameter for capturing rating value.
// Consider below sample input and output

// Input:
// 1001
// Epson
// 30000
// 5
// TataCliq
// 1002
// BenQ
// 40000
// 4
// Amazon
// 1003
// Sony
// 80000
// 5
// TataCliq
// 1004
// Optomo
// 7000
// 3
// Flipkart
// 3
// Output:
// 1003

// Sample Testcase2:
// Input:
// 1001
// Epson
// 30000
// 5
// Flipkart
// 1002
// BenQ
// 40000
// 4
// Amazon
// 1003
// Sony
// 80000
// 5
// TataCliq
// 1004
// Optomo
// 7000
// 3
// Flipkart
// 5
// Output:
// No such Projector

// 12345
// Epson
// 30000
// 5
// TataCliq
// 54321
// BenQ
// 40000
// 4
// Amazon
// 12789
// Sony
// 80000
// 5
// TataCliq
// 98765
// Optomo
// 7000
// 3
// Flipkart
// 3
