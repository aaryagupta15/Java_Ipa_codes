import java.util.*;

public class ipa21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim[] sim = new Sim[5];
        for (int i = 0; i < 5; i++) {
            int simId = sc.nextInt();
            sc.nextLine();
            String customerName = sc.nextLine();
            double balance = sc.nextDouble();
            double ratePerSecond = sc.nextDouble();
            sc.nextLine();
            String circle = sc.nextLine();
            sim[i] = new Sim(simId, customerName, balance, ratePerSecond, circle);
        }
        String circle1 = sc.nextLine();
        String circle2 = sc.nextLine();

        Sim[] answer = transferCustomerCircle(sim, circle1, circle2);
        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i].getSimId() + " " + answer[i].getCircle() + " " + answer[i].getCustomerName() );
        }
    }

    public static Sim[] transferCustomerCircle(Sim[] arr, String circle1, String circle2){
        Sim[] arr2 = new Sim[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getCircle().equalsIgnoreCase(circle1)){
                arr[i].setCircle(circle2);
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }
        // Arrays.sort(arr2, (p1,p2) -> Double.compare(p2.getRatePerSecond(), p1.getRatePerSecond()));
        Arrays.sort(arr2, (p1,p2) -> Double.compare(p1.getSimId(), p2.getSimId()));
        return arr2;
    }
}

class Sim {
    int simId;
    String customerName;
    double balance;
    double ratePerSecond;
    String circle;

    public int getSimId() {
        return simId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

    Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
        this.simId = simId;
        this.ratePerSecond = ratePerSecond;
        this.customerName = customerName;
        this.circle = circle;
        this.balance = balance;
    }
}

// Create a class Sim with below attributes:
// simId - int
// customerName - String
// balance - double
// ratePerSecond - double
// circle – String
// Write getters, setters and parameterized constructor as required. Public
// class Solution is already created
// with main method. Code inside main method should not be altered else your
// solution might be scored as
// zero. You may copy the code from main method in eclipse to verify your
// implementation.
// Implement static method - transferCustomerCircle in Solution class. This
// method will take first parameter as
// array of Sim class objects, second parameter as circle to be transferred
// (which is String parameter circle1)
// and third parameter as new circle (which is String parameter circle2). Method
// will transfer the customer to
// new circle (circle2), where the circle attribute would match second parameter
// (circle1). Method will return
// array of Sim objects for which circle is transferred. Return array should be
// sorted in descending order of
// ratePerSecond (assuming ratePerSecond is not same for any of the Sim
// objects). This method should be
// called from main method and display the simId,customerName,circle and
// ratePerSecond of returned objects
// (as per sample output). Main method mentioned above already has Scanner code
// to read values, create
// objects and test above methods. Hence do not modify it.
// Consider below sample input and output:
// Input:
// 1
// raj
// 100
// 1.5
// KOL
// 2
// chetan
// 200
// 1.6
// AHD
// 3
// asha
// 150
// 1.7
// MUM
// 4
// kiran
// 50
// 2.2
// AHD
// 5
// vijay
// 130
// 1.8
// AHD
// AHD
// KOL
// Output:
// 4 kiran KOL 2.2
// 5 vijay KOL 1.8
// 2 chetan KOL 1.6