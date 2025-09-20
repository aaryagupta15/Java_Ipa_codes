import java.util.*;

class Student {

    int total_number_of_marks = 100;
    int total_subjects = 2;
    String name;
    int a;
    int b;

    Student(String name, int a, int b) {
        System.out.println("This is a constructor of object name " + name);
        this.name = name;
        this.a = a;
        this.b = b;
    }

    void names() {
        System.out.println("My name is: " + name);
    }

    void marks() {
        int sum = a + b;
        System.out.println("The total number of marks scored by " + name + " is " + sum);
    }

    void percentage() {
        int sum_marks = a + b;
        int remainder = total_number_of_marks * total_subjects;
        double percentage = (sum_marks * 100.0) / remainder;
        System.out.println("The percentage scored by " + name + " is " + percentage + "%");
    }
}

class FirstClass {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        int a = 20;
        int b = 30;
        int sum = a + b;
        System.out.println(sum);

        int ans = sum(3, 7);
        System.out.println(ans);

        Student obj1 = new Student("Aarya", 50, 30);
        obj1.names();
        obj1.marks();
        obj1.percentage();
        System.out.println();

        Student obj2 = new Student("Ajita", 80, 50);
        obj2.names();
        obj2.marks();
        obj2.percentage();
        System.out.println();

        System.out.println("Enter the name and marks of the third student: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int x = sc.nextInt();
        int y = sc.nextInt();
        Student obj3 = new Student(name, x, y);
        obj3.names();
        obj3.marks();
        obj3.percentage();
    }
}