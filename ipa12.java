import java.util.*;

public class ipa12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HeadSets[] arr = new HeadSets[4];
        
        for(int i=0;i<arr.length;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            boolean d = sc.nextBoolean(); sc.nextLine();
            arr[i] = new HeadSets(a,b,c,d);
        }
        String givenBrand = sc.nextLine().trim();
        int ans = findTotalPricebyGivenBrand(arr, givenBrand);
        if(ans == 0){
            System.out.println("No Headsets Available");
        }
        else{
            System.out.println(ans);
        }

        HeadSets arr2 = findAvailablePricewithSecondMinPrice(arr);
        if(arr2 == null){
            System.out.println("No headsets Available");
        }
        else{
            System.out.println(arr2.headsetName);
            System.out.println(arr2.price);
        }
    }

    public static int findTotalPricebyGivenBrand(HeadSets[] arr, String givenBrand){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getBrand().equalsIgnoreCase(givenBrand)){
                sum = sum + arr[i].getPrice();
            }
        }
        return sum;
    }

    public static HeadSets findAvailablePricewithSecondMinPrice(HeadSets[] arr){
        int min = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i].getAvailable()==true){
                if(arr[i].getPrice()<min){
                    second = min;
                    min = arr[i].getPrice();
                }
                else if(arr[i].getPrice()<second && arr[i].getPrice()!=min){
                    second = arr[i].getPrice();
                }                
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i].getPrice() == second && arr[i].getAvailable()){
                return arr[i];
            }
        }
        return null;
    } 
}

class HeadSets{
    String headsetName;
    String brand;
    int price;
    boolean available;

    HeadSets(String headsetName, String brand, int price, boolean available){
        this.headsetName = headsetName;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }

    public String getBrand() {
        return brand;
    }
    public String getHeadsetName() {
        return headsetName;
    }
    public int getPrice() {
        return price;
    }
    public boolean getAvailable(){
        return available;
    }
}
