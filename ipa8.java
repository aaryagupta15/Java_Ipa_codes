import java.util.*;

public class ipa8 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] arr = new Employee[4];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();
            boolean e = sc.nextBoolean(); sc.nextLine();

            arr[i] = new Employee(a,b,c,d,e);
        }
        String givenBranch = sc.nextLine();
        int ans = findCountOfEmployeesUsingCompTransport(arr,givenBranch);
        if(ans > 0)
            System.out.println(ans);
        else
            System.out.println("No such Employees");

        Employee arr2 = findEmployeeWithSecondHighestRating(arr);
        if(arr2 == null){
            System.out.println("All are using company transport");
        }
        else{
            System.out.println(arr2.getEmployeeId());
            System.out.println(arr2.getName());
        }
    }

    public static int findCountOfEmployeesUsingCompTransport(Employee[] arr, String givenBranch){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getCompanyTransport() == true && arr[i].getBranch().equalsIgnoreCase(givenBranch)){
                count++;
            }
        }
        return count;
    }

    public static Employee findEmployeeWithSecondHighestRating(Employee[] arr){
        double max = Double.MIN_VALUE;
        double second = Double.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
        if(!arr[i].getCompanyTransport()){
            double rating = arr[i].getRating();
            if(rating > max){
                second = max;
                max = rating;
            } else if(rating > second && rating != max){
                second = rating;
            }
        }
    }
        if(second == Double.MIN_VALUE){
        return null;
    }
    for(int i=0;i<arr.length;i++){
        if(!arr[i].getCompanyTransport() && arr[i].getRating() == second){
            return arr[i];
        }
    }
        return null;
    }
}

class Employee{
    int employeeId;
    String name;
    String branch;
    double rating;
    boolean companyTransport;

    Employee(int employeeId, String name, String branch, double rating, boolean companyTransport){
        this.employeeId = employeeId;
        this.companyTransport = companyTransport;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
    }
    public String getBranch() {
        return branch;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public double getRating() {
        return rating;
    }  
    public boolean getCompanyTransport(){
        return companyTransport;
    }  
}

// Create a class called Employee with the below attributes:

// employeeld - int
// name - String
// branch - String
// rating - double
// company Transport - boolean
// The above attributes should be private. write getters, setters and parameterized constructor as required.

// Create class MyClass with main method.
// Implement two static methods findCountOfEmployeesUsingCompTransport and findEmployeeWithSecondHighestRating
// in MyClass class.

// findCountOfEmployeesUsingCompTransport method: 
// ----------------------------------------------
// This method will take an array of Employee object and a String parameter as input parameters. 
// This method will calculate and return the count of Employees who are all using company transport 
// in the given branch (String parameter passed).
// If no Employee in the given branch using company transport in the array of Employee objects, then 
// the method should return 0.

// findEmployeeWithSecondHighestRating method: 
// --------------------------------------------
// This method will take an array of Employee objects as an input parameter. This method will return 
// the object of the second highest rating employee from the array of Employee objects who are not using 
// company transport.
// If all Employees using company transport in the array of Employee objects, then the method should return null.

// Note: All the searches should be case sensitive, companyTransport and rating combination of each Employee 
// is unique.
// For findCountOfEmployeesUsingCompTransport method, The main method should print the returned count as it 
// is if the returned value is greater than 0, else it should print "No such Employees".
// Ex: 2 , where 2 is the count
// For findEmployeeWithSecondHighestRating method: The main method should print the employeeld and name from 
// the returned object if the returned value is not null. If the returned value is null, then it should 
// print "All Employees using company transport".
// Ex: 1003
//     Uma
// where 1003 is the employeeld and Uma is the name.
// Before calling these static methods in main, use Scanner object to read the values of four Employee 
// objects referring attributes in the above mentioned attributes sequence. Next, read the value of String
// parameter for capturing branch.

// Input : 

// 1001
// Ashwa
// IT
// 5
// true
// 1002
// Preeti
// IT
// 4
// true
// 1003
// Uma
// Admin
// 3
// false
// 1004
// Akash
// Hardware
// 4.5
// false
// IT



// Output : 

// 2
// 1003
// Uma

