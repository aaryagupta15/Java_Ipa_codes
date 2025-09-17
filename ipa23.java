import java.util.Scanner;

public class ipa23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Spotify[] arr = new Spotify[4];
        for (int i = 0; i < arr.length; i++) {
        int a = sc.nextInt(); sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        double d = sc.nextDouble(); sc.nextLine();
        String e = sc.nextLine();
        arr[i] = new Spotify(a, b, c, d, e);
        }
        String giventype = sc.nextLine();
        String givengroup = sc.nextLine();

        double ans = findAvgSpotifySubsByType(arr, giventype, givengroup);
        if(ans == 0){
            System.out.println("There are no Spotify subscriptions");
        }
        else{
            System.out.println(ans);
        }
    }

    public static double findAvgSpotifySubsByType(Spotify[] arr, String giventype, String givengroup){
        double sum = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getSubscriptionType().equalsIgnoreCase(giventype) && arr[i].getGroupSessionAvailable().equalsIgnoreCase(givengroup)){
                sum = sum + arr[i].getSubscriptionPrice();
                count++;
            }
        }
        if(count == 0){
            return 0;
        }
        double average = sum/count;
        return average;
    }
}

class Spotify{
    int spotifyId;
    String profileName;
    String subscriptionType;
    double subscriptionPrice;
    String groupSessionAvailable;

    Spotify(int spotifyId, String profileName, String subscriptionType, double subscriptionPrice, String groupSessionAvailable){
        this.spotifyId= spotifyId;
        this.profileName= profileName;
        this.subscriptionType= subscriptionType;
        this.subscriptionPrice= subscriptionPrice;
        this.groupSessionAvailable= groupSessionAvailable;
    }

    public String getGroupSessionAvailable() {
        return groupSessionAvailable;
    }
    public String getProfileName() {
        return profileName;
    }
    public int getSpotifyId() {
        return spotifyId;
    }
    public double getSubscriptionPrice() {
        return subscriptionPrice;
    }
    public String getSubscriptionType() {
        return subscriptionType;
    }
}
