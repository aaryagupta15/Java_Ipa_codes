import java.util.*;

public class lex1 {
    public static void main(String[] args) {
        // pattern10();
        temperature();
    }

    static void maximum_number() {
        int num1 = 3;
        int num2 = 4;
        int num3 = 1;
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " is the maximum number");
            } else {
                System.out.println(num3 + "is the maximum number");
            }
        } else {
            System.out.println(num2 + "is the maximum number");
        }
    }

    static void reverse_number(int num) {
        int rem = 0;
        while (num > 0) {
            int last = num % 10; // 5 6 8 7
            rem = last + rem * 10; // 5 50+6=56 560+8= 568 5680+7=5687
            num = num / 10; // 786 78 7 5687
        }
        System.out.println(rem);
    }

    static void food_cost() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the food bar, what would you like to order?, Y or N");
        String ans = sc.nextLine();
        int total_cost = 0;
        if (ans.equals("Y")) {
            while (true) {
                System.out.println("Enter the food item");
                String food = sc.nextLine();
                System.out.println("Enter the cost of " + food);
                int cost = sc.nextInt();
                total_cost = total_cost + cost;
                sc.nextLine(); // For consumption of new line
                System.out.println("Do you want to order more: Y or N");
                String more = sc.nextLine();
                if (!more.equals("Y")) {
                    break;
                }
            }
        }
        System.out.println("The total cost is: " + total_cost);
    }

    static void sum_do(int num) {
        int sum = 0;
        do {
            int last = num % 10;
            sum = sum + last;
            num = num / 10;
        } while (num > 0);
        System.out.println(sum);
    }

    static void customer_id_generator() {
        int number_of_customers = 5;
        for (int i = 0; i < number_of_customers; i++) {
            String customer_id = "";
            if (i < 9) {
                customer_id = "CID0" + (i + 1);
            } else {
                customer_id = "CID" + (i + 1);
            }
            System.out.println("This is your customer ID for customer: " + customer_id);
        }
    }

    static void pattern1() {
        for (int i = 4; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    static void pattern3() {
        int n = 5;
        for (int i = 0; i < 2 * n; i++) {
            int total = i > n ? 2 * n - i : i;
            int total_spaces = n - total;
            for (int j = 0; j < total_spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < total; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4() {
        int n = 5;
        int count = 1;
        for (int i = 0; i <= (2 * n) - 1; i++) {
            if (i < n) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int j = i; j > count; j--) {
                    System.out.print("* ");
                }
                count = count + 2;
                System.out.println();
            }
        }
    }

    static void pattern5() {
        int n = 5;
        for (int i = 0; i < 2 * n; i++) {
            int total = i < n ? i + 1 : 2 * n - i - 1;
            for (int j = 0; j < total; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern7(){
        int n = 5;
        for(int rows = 1; rows<=n; rows++){
            for(int spaces = 0; spaces< n-rows; spaces++){
                System.out.print(" ");
            }
            for(int cols = rows; cols>=1;cols--){
                System.out.print(cols);
            }
            for(int cols = 2; cols<=rows;cols++){
                System.out.print(cols);
            }
            System.out.println();
        }
    }

    static void pattern8(){
        int n = 4;
        for(int rows=0;rows<n;rows++){
            for(int spaces=0;spaces<rows;spaces++){
                System.out.print(" ");
            }
            for(int cols=1;cols<=n-rows;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(){
        int n = 5;
        for(int rows=1;rows<=n;rows++){
            for(int spaces=2*n;spaces>rows;spaces--){
                System.out.print(" ");
            }
            for(int cols=1;cols<=rows;cols++){
                System.out.print(rows + " ");
            }
            System.out.println();
        }
    }

    static void pattern10(){
        int n = 3;
         // 1. Top Half
        for (int i = 1; i <= n; i++) {
            // Left Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
             int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }  
        
          // 2. Bottom Half
        for (int i = n; i >= 1; i--) {
            // Left Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void factorial() {
        int n = 5;
        int prod = 1;
        while (n > 0) {
            prod = prod * n;
            n--;
        }
        System.out.println(prod);
    }

    static void geometric_sequence() {
        int a = 2;
        int n = 5;
        int r = 3;
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            int temp = (int) Math.pow(r, i - 1);
            prod = a * temp;
            System.out.println(prod);
        }
    }

    static void quadratic_roots(){
        String q = "1x^2 + 4x + 5";
        q = q.replaceAll("x\\^2", "").replaceAll("x", "").replaceAll(" ", "");
        String[] parts = q.split("(?=[+-])");

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);

        System.out.println();
        System.out.print(a + " ");
        System.out.print(b+ " ");
        System.out.print(c + " ");
        System.out.println();

        double D = b * b - 4 * a * c;
        System.out.println("Discriminant (D) = " + D);

        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Roots are Real and Distinct:");
            System.out.println("Root1 = " + root1);
            System.out.println("Root2 = " + root2);
        } else if (D == 0) {
            double root = -b / (2.0 * a);
            System.out.println("Roots are Real and Equal:");
            System.out.println("Root = " + root);
        } else {
            // D < 0 → Imaginary Roots
            double real = -b / (2.0 * a);
            double imag = Math.sqrt(-D) / (2 * a);
            System.out.println("Roots are Complex/Imaginary:");
            System.out.printf("Root1 = %.2f + %.2fi\n", real, imag);
            System.out.printf("Root2 = %.2f - %.2fi\n", real, imag);
        }
    }

    static void food_bill(){
        System.out.println("Enter Veg(V) or Non-Veg(N)? ");
        char ans = 'V';
        System.out.println("Enter quantity: ");
        int quantity = 5;
        if(quantity<0){
            System.out.println("Invalid selection");
            return;
        }
        System.out.println("Enter the distance from your house: ");
        int distance = 10;
        double price_V = 12.0;
        double price_N = 14.0;
        if(distance <=0){
            System.out.println("Invalid distance");
            return;
        }
        else if(distance<=3){
            if(ans == 'V'){
                System.out.println(price_V * quantity);
            }
            else{
                System.out.println(price_N * quantity);
            }
        }
        else if(distance>3 && distance<=10){
            if(ans == 'V'){
                System.out.println(price_V * quantity * (distance-3) * 1);
            }
            else{
                System.out.println(price_N * quantity * (distance-3) * 1);
            }
        }
        else{
            if(ans == 'V'){
                System.out.println(price_V * quantity * (distance-3) * 5);
            }
            else{
                System.out.println(price_N * quantity * (distance-3) * 5);
            }
        }
    }

    static void date_month(){
        String date = "28/2/2024";
        
        String[] parts = date.split("/");
        for(String num : parts){
            System.out.println(num);
        }

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        int[] days_in_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        boolean leap_year = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
        if (leap_year) {
        days_in_month[1] = 29;
        }

        day = day + 1;

        if(day>days_in_month[month - 1]){
            month = month + 1;
            day = 1;
        }

        if (month > 12) {
            month = 1;
            year += 1;
        }
        System.out.println(day + "/" + month + "/" + year);
    }

    static void palindrome(){
        int n = 323;
        int num = n;
        int rem = 0;
        
        while(num>0){
            int last = num%10;
            rem = rem*10 + last;
            num = num/10;
        }
        if(rem == n){
            System.out.println("True");
        }
    }

    static void heads_legs(){
        int heads = 150;
        int legs = 500;

        // Let rabbits = r, chickens = c
        // c + r = heads
        // 2c + 4r = legs

        // From c + r = heads ⇒ c = heads - r
        // Substitute in legs equation:
        // 2*(heads - r) + 4*r = legs

        int rabbits = (legs - 2 * heads) / 2;
        int chickens = heads - rabbits;

        // Check for validity
        if (rabbits >= 0 && chickens >= 0 && (2 * chickens + 4 * rabbits) == legs) {
            System.out.println("Chickens: " + chickens);
            System.out.println("Rabbits: " + rabbits);
        } else {
            System.out.println("No valid solution.");
        }
    }

    static void lcm(){
        int a = 12;
        int b = 5;

        for(int i=2;i<=a*b;i++){
            if(i%a==0 && i%b==0){
                System.out.println(i);
                break;
            }
        }
    }

    static void temperature(){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[7][2];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<2;j++){
                arr[i][j] = sc.nextInt();
            }            
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<2;j++){
                if(j==0){
                    System.out.println("The minimum temperature for day " + (i+1) + " is: "+ arr[i][j]);  
                }
                else{
                    System.out.println("The maximum temperature for day " + (i+1) + " is: " + arr[i][j]);  
                }
                  System.out.println();             
            }
        }
    }
}