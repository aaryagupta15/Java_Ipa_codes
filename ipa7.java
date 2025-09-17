import java.util.*;

public class ipa7 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] arr = new Course[4];
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            int e = sc.nextInt(); sc.nextLine();

            arr[i] = new Course(a,b,c,d,e);
        }
        String givenadmin = sc.nextLine();
        int givenhandson = sc.nextInt(); sc.nextLine();

        int ans = findAvgOfQuizByAdmin(arr, givenadmin);
        if(ans == 0){
            System.out.println("No course found");
        }
        else{
            System.out.println(ans);
        }

        String arr2[] = sortCourseByHandsOn(arr, givenhandson);
        if(arr2 == null){
            System.out.println("No Course found with mentioned attribute.");
        }
        else{
            for(int i=0;i<arr2.length;i++){
                System.out.println(arr2[i]); 
            }
        }
    }

    private static int findAvgOfQuizByAdmin(Course[] arr, String givenadmin){
        int sum = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getCourseAdmin().equals(givenadmin)){
                sum = sum + arr[i].getQuiz();
                count++;
            }
        }
        if(sum == 0){
            return 0;
        }
        int average = sum/count;
        return average;
    }

    private static String[] sortCourseByHandsOn(Course[] arr, int givenhandson){
        String[] arr2 = new String[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getHandson()<givenhandson){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length - 1] = arr[i].getCourseName();
                Arrays.sort(arr2);
            } 
        }
        if(arr2.length==0){
            return null;
        }
        return arr2;
    }
}

class Course{
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    Course(int courseId, String courseName, String courseAdmin, int quiz, int handson){
        this.courseAdmin = courseAdmin;
        this.courseId = courseId;
        this.courseName = courseName;
        this.quiz = quiz;
        this.handson = handson;
    }

    public String getCourseAdmin() {
        return courseAdmin;
    }
    public int getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public int getHandson() {
        return handson;
    }
    public int getQuiz() {
        return quiz;
    }
}
// create the class Course with the below Attributes.

// courseId- int
// courseName- String
// courseAdmin- String
// quiz- int
// handson -int

// The above methods should be private ,write getter and
// setter and parametrized constructor as required.

// create class courseProgram with main method.

// implement two static methods-
//    findAvgOfQuizByAdmin method:this method will take array
// of Course objects and a String  value as input parameters.
// This method will find out Average (as int) of Quiz questions
// for given Course Admin (String parametre passed)
// This method will return Average if found.if there is no course
// that matches then the method should return 0.

// sortCourseByHandsOn method:
// This method will take an Array of Course Objects and int
// value as input parameters.
// This methods should return an Array of Course objects in an
// ascending order of their  handson which are less than the
// given handson(int parameter passed) value. if there is no
// such course then the method should return null.

// The above mentioned static methods should be called from
// main methods.

// for findAvgOfQuizByAdmin method: The main method
// should print the average if the returned value is not 0.
// if the returned value is 0 then it should print "No Course
// found."


// for sortCourseByHandsOn method:
//                         the  main method should print the name
// of the Course from the returned Course object Array if the
// returned value is not null.if the returned value is null then
// it should print "No Course found with mentioned attribute."

// input1:
// 111
// kubernetes
// Nisha
// 40
// 10
// 321
// cassandra
// Roshini
// 30
// 15
// 457
// Apache Spark
// Nisha
// 30
// 12
// 987
// site core
// Tirth
// 50
// 20
// Nisha
// 17

// output1:
// 35
// kubernetes
// Apache Spark
// cassandra

// input2:
// 111
// kubernetes
// Nisha
// 40
// 10
// 321
// cassandra
// Roshini
// 30
// 15
// 457
// Apache Spark
// Nisha
// 30
// 12
// 987
// site core
// Tirth
// 50
// 20
// Shubhamk
// 5

// output 2:
// No Course found
// No Course found with mentioned attributes.