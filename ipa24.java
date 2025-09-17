import java.util.*;

public class ipa24 {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Account[] arr = new Account[num];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            double b = sc.nextDouble(); sc.nextLine();
            double c = sc.nextDouble();
            arr[i] = new Account(a,b,c);
        }
        int years = sc.nextInt();
        double ans = calculateInterest(arr,years);
        System.out.println(ans);
    }
    
    public static double calculateInterest(Account[] a, int noOfYears)
    {
        double rate = 0;
        double ans = 0;
       for(int i=0;i<a.length;i++){
        rate = a[i].getInterestRate() + (a[i].getInterestRate()/100)*noOfYears;
        ans = ans + (a[i].getBalance()*rate*noOfYears)/100;
       }
       return ans;
    }
}

class Account
{
    int id;
    double balance;
    double interestRate;
    
    Account(int id, double balance, double interestRate){
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;      
        
    }
    
    public int getId(){
        return id;
    }
    
    public double getBalance() {
        return balance;
    }
    public double getInterestRate() {
        return interestRate;
    }
    
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
}

