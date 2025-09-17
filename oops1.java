class oops1{
    public static void main(String[] args) {
        // Let's create an object of any class
        Info aarya = new Info(); // aarya is an object which has three properties roll,name,marks
        aarya.rollno = 3;
        aarya.name = "Aarya";
        aarya.marks = 8.12;

        Info chiya = new Info(2,"Chiya",8.72); // chiya has three properties roll,name,marks

        aarya.show_percentage();
        chiya.show_percentage();

        Info aju = new Info();
        System.out.println(aju.name);

    }
}

class Info{
    int rollno;
    String name;
    double marks;

    Info(){ // will be called for object aarya
        // Calling another constructor from this constructor
        this(12,"Aju",9.6);

    }

    Info(int rollno, String name, double marks){ // will be called for object chiya
        this.rollno = rollno; // this.rollno means object.rollno
        this.name = name;
        this.marks = marks;

        System.out.println("This is a parameterised constructor with attributes " + rollno + ", " + name + " and "+ marks);
    }

    void show_percentage(){
        System.out.println("This is the percentage of " + this.name + " and i.e. " + Math.round(this.marks * 10));
    }
}