import java.util.*;

public class ipa14 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Resort[] arr = new Resort[4];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();
            double e = sc.nextDouble(); sc.nextLine();
            arr[i] = new Resort(a,b,c,d,e);
        }
        String givenCategory = sc.nextLine();
        int ans = findAvgPriceByCategory(arr, givenCategory);
        if(ans == 0){
            System.out.println("No resort found");
        }
        else{
            System.out.println(ans);
        }
    }
    public static int findAvgPriceByCategory(Resort[] arr, String givenCategory){
        int count = 0;
        double sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getCategory().equalsIgnoreCase(givenCategory) && arr[i].getRating()>4){
                sum = sum + arr[i].getPrice();
                count++;
            }
        }

        if(count == 0){
            return 0;
        }
        double average = sum/count;  
        int int_average = (int)average;   
        return int_average;   
    }
}

class Resort{
    private int resortId;
    private String resortName, category;
    private double price, rating;

    Resort(int resortId, String resortName, String category,double price, double rating){
        this.category = category;
        this.resortId = resortId;
        this.rating = rating;
        this.price = price;
        this.resortName = resortName;
    }
    public String getCategory(){
        return category;
    }
    public double getPrice() {
        return price;
    }
    public double getRating() {
        return rating;
    }
    public int getResortId() {
        return resortId;
    }
    public String getResortName() {
        return resortName;
    }

}