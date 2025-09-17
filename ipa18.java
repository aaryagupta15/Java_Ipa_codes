import java.util.Scanner;

public class ipa18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel[] arr = new Hotel[4];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();
            double f = sc.nextDouble(); sc.nextLine();

            arr[i] = new Hotel(a, b, c, d, e, f);
        }
        String month = sc.next();
        String wifiOption = sc.next();
        int roomBook = noRoomBook(arr, month);
        Hotel hotelSecond = searchWifi(arr, wifiOption);
        if (roomBook > 0) {
        System.out.println(roomBook);
        } else {
        System.out.println("No rooms booked in the given month");
        }
        if (hotelSecond != null) {
        System.out.println((int)hotelSecond.gettbill());
        } else {
        System.out.println("No such option available");
        }
    }

    public static int noRoomBook(Hotel[]arr, String givenmonth){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            String month = arr[i].getdBook();
            if(arr[i].getdBook().contains(givenmonth)){
                count = count + arr[i].getnoRoom();
            }
        }
        return count;
    }

    public static Hotel searchWifi(Hotel[]arr, String givenwifi){
        double max = Double.MIN_VALUE;
        double second = Double.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getwifi().equalsIgnoreCase(givenwifi)){
                if(arr[i].gettbill()>=max){
                    second = max;
                    max = arr[i].gettbill();
                }
                else if(arr[i].gettbill() > second && arr[i].gettbill() != max){
                    second = arr[i].gettbill();
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i].gettbill() == second){
                return arr[i];
            }
        }
        return null;
    }
}

class Hotel {
    private int hId;
    private String hName;
    private String dBook;
    private int noRoom;
    private String wifi;
    private double tBill;

    public Hotel(int hId, String hName, String dBook, int noRoom, String wifi, double tBill) {
        this.hId = hId;
        this.hName = hName;
        this.dBook = dBook;
        this.noRoom = noRoom;
        this.wifi = wifi;
        this.tBill = tBill;
    }

    public int gethId() {
        return hId;
    }

    public String gethName() {
        return hName;
    }

    public String getdBook() {
        return dBook;
    }

    public int getnoRoom() {
        return noRoom;
    }

    public String getwifi() {
        return wifi;
    }

    public double gettbill() {
        return tBill;
    }

}

// You are provided with a class named Hotel that stores the details of hotel
// bookings. Each hotel booking record contains the following attributes:

// hId (int): Hotel ID

// hName (String): Hotel name

// dBook (String): Booking date in format like "22-Jan-2023"

// noRoom (int): Number of rooms booked

// wifi (String): Wifi option provided ("Yes" / "No")

// tBill (double): Total bill amount for the booking

// You need to perform the following tasks:

// 🧩 Task 1:
// Function Name: noRoomBook
// Purpose: Return the total number of rooms booked across all hotels in a
// specific month (e.g., "Jan", "Feb", etc.)
// Input: An array of 4 Hotel objects and a String representing the month
// Output: Return an int representing the total rooms booked in that month.
// If no bookings match the month, return 0.

// 🧩 Task 2:
// Function Name: searchWifi
// Purpose: Find the hotel that has the second highest total bill among hotels
// with the given Wi-Fi option.
// Input: An array of 4 Hotel objects and a String representing the Wi-Fi option
// ("Yes" or "No")
// Output: Return the Hotel object with the second highest total bill.
// If no such hotel exists, return null.

// 🧪 Input Format:
// 4 sets of hotel data with each set consisting of:

// hId (int)

// hName (String)

// dBook (String, date format like "22-Jan-2023")

// noRoom (int)

// wifi (String: "Yes" or "No")

// tBill (double)

// Then,

// month (String, e.g. "Jan")

// wifiOption (String, e.g. "Yes" or "No")

// 📤 Output Format:
// Print total number of rooms booked in the given month.
// If none, print: "No rooms booked in the given month"

// Print the hId of the hotel with second highest bill having the given wifi
// option.
// If none found, print: "No such option available"

// ✅ Example Input:
// 101
// Taj Hotel
// 22-Jan-2023
// 3
// Yes
// 15000
// 102
// Oberoi
// 19-Feb-2023
// 5
// Yes
// 18000
// 103
// Holiday Inn
// 20-Jan-2023
// 2
// No
// 14000
// 104
// Lemon Tree
// 10-Jan-2023
// 4
// Yes
// 17000
// Jan
// Yes
// ✅ Example Output:
// Copy
// Edit
// 9
// 17000
// Let me know if you want this converted into a PDF or formatted for Word
// submission.