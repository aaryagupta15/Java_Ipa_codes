import java.util.*;

public class ipa22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Bill[] arr = new Bill[num];
        for (int i = 0; i < arr.length; i++) {
        int a = sc.nextInt();
        sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        double d = sc.nextDouble();
        boolean e = sc.nextBoolean();
        sc.nextLine();
        arr[i] = new Bill(a, b, c, d, e);
        }

        boolean givenstatus = sc.nextBoolean(); sc.nextLine();
        String giventype = sc.nextLine();

        Bill[] arr2 = findBillWithMaxBillAmountBasedOnStatus(arr, givenstatus);
        if(arr2 == null){
            System.out.println("There are no bill with the given status");
        }
        else{
            for(int i=0;i<arr2.length;i++){
                System.out.println(arr2[i].getid() + "#" + arr2[i].getname());
            }
        }

        int ans = getCountWithTypeOfConnection(arr, giventype);
        if(ans == 0){
            System.out.println(" There are no bills with given type of connection");
        }
        else{
            System.out.println(ans);
        }
    }  

    public static Bill[] findBillWithMaxBillAmountBasedOnStatus(Bill[] arr, boolean givenstatus){
        double max = Double.MIN_VALUE;
        Bill[] arr2 = new Bill[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getamount()>max && arr[i].getstatus() == givenstatus){
                max = arr[i].getamount();
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }
        if(arr2.length == 0){
            return null;
        }
        Arrays.sort(arr2, (p1,p2)-> Double.compare(p1.getid(),p2.getid()));
        return arr2;
    }

    public static int getCountWithTypeOfConnection(Bill[] arr, String giventype){
        int count = 0;
        Bill[] arr2 = new Bill[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].gettype().equalsIgnoreCase(giventype)){
                count++;
            }
        }
        return count;
    }
}

class Bill {
    private int id;
    private String name, type;
    private double amount;
    private boolean status;

    public int getid() {
        return id;
    }
    public String getname() {
        return name;
    }
    public String gettype() {
        return type;
    }
    public double getamount() {
        return amount;
    }
    public boolean getstatus() {
        return status;
    }
    public Bill(int id, String name, String type, double amount, boolean status) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.status = status;
    }
}

// Create a class Bill with below attributes:
// billNo- int
// name - String
// typeOfConnection - String
// billAmount - double
// status – boolean
// where billNo is the bill number, name is the name of the customer, typeOfConnection is the type of the
// connection (prepaid, postpaid), billAmount is the bill amount and status is whether the bill is paid or not (if
// paid then value is TRUE else value is FALSE).
// The above attributes should be private, write getters, setters and parameterized constructor as required.
// Create class Solution with main method.
// Implement two static methods - findBillWithMaxBillAmountBasedOnStatus and
// getCountWithTypeOfConnection in Solution class.
// findBillWithMaxBillAmountBasedOnStatus method:
// This method will take an array of Bill objects and a boolean parameter as parameters.
// The method will return bill object array in ascending order of their bill number from the array of Bill objects
// whose bill Amount is maximum in the array with the status attribute that matches with the input parameter.
// If no Bill with the given status is present in the array of Bill objects, then the method should return null.
// getCountWithTypeOfConnection method:
// This method will take two input parameters - array of Bill objects and string parameter ( for type of
// connection).
// The method will return the count of bills from array of bill objects for the given type of connection.
// If no bill with the given type of connection is present in the array of bill objects, then the method should
// return 0.
// Note :
// Two bill object can have the same bill amount.
// All the searches should be case insensitive.
// The above mentioned static methods should be called from the main method.
// For findBillWithMaxBillAmountBasedOnStatus method - The main method should print the billNo followed
// by # and name from the returned Bill object array if the returned value is not null.
// If the returned value is null then it should print "There are no bill with the given status".
// For getCountWithTypeOfConnection method - The main method should print the count of bills as it is, if the
// returned value is greater than 0, otherwise it should print "There are no bills with given type of connection".
// Before calling these static methods in main, use Scanner to read the number of object and objects to read the
// TCS IPA QUESTION ANSWER
// values of Bill objects referring attributes in the above mentioned attribute sequence.
// Next, read the value for status and typeOfConnection.
// Consider below sample input and output:
// Input:
// 4
// 111
// Aman Mittal
// Prepaid
// 914.25
// true
// 222
// Rekha Kumar
// Prepaid
// 1425.75
// false
// 333
// Samyra Gupta
// Prepaid
// 1305.00
// true
// 444
// Mohit Saxena
// Postpaid
// 1300.50
// false
// false
// Prepaid
// Output:
// 222#Rekha Kumar
// 3