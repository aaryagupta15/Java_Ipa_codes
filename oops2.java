class Box{
    int l;
    int b;
    int h;
    static String fruit;

    Box(){ // method overloading = static or compile time polymorphism
        System.out.println("Just a default one for Box");
    }
    Box(int l,int b,int h){ // method overloading = static or compile time polymorphism
        this.l = l;
        this.b = b;
        this.h = h;
    }
    void greetings(){  // Method overiding = run time polymorphism
        System.out.println("Greetings by Box!");
    }

    void area_calculation(){
        System.out.println(l*b*h);
    }

    static void cannot_be_overidden(String fruit){
        Box.fruit = fruit;
        System.out.println(fruit);
        // System.out.println("Cannot be overidden as it does not depend on object...");
        //Because they’re resolved at compile time (known as static binding), 
        //not at runtime like instance methods.
    }
}

class Boxweight extends Box{
    int weight;
    Boxweight(){
        System.out.println("Just a default one for Boxweight");
    }  
    Boxweight(int l, int b, int h, int weight){
        super(l, b, h); // To initialize the constructor of Box
        this.weight = weight;
        System.out.println(weight);
    }  

    @Override
    void greetings(){ // Method overiding = run time polymorphism
        System.out.println("Greetings by boxweight!");
    }

    void metric_calculation(){
        int metric = this.l * this.h * this.b * this.weight;
        System.out.println(metric);
    }
}

class oops2 {
    public static void main(String[] args) {
        Box box1 = new Box(); // Just a default one for Box
        Box box2 = new Box(1,2,3); 
        Boxweight boxw1 = new Boxweight(); // Just a default one for Box (default parent class)
                                           // Just a default one for Boxweight (child class)
        Boxweight bowx2 = new Boxweight(10, 10, 10, 50); //50
                                                                    
        box1.greetings(); //Greetings by Box!
        boxw1.greetings(); //Greetings by boxweight!
        boxw1.h = 10;
        boxw1.b = 10;
        boxw1.l = 10;
        boxw1.weight = 20; 
        boxw1.metric_calculation(); //20000
        bowx2.metric_calculation(); //50000

        box2.greetings(); //Greetings by Box!
        box2.area_calculation();
        box2.cannot_be_overidden("apple"); //apple (Not conventional)
        box1.cannot_be_overidden("mango"); //mango (Not conventional)
        Box.cannot_be_overidden("apple"); //apple
        Box.cannot_be_overidden("mango"); //mango

        Box box3 = new Boxweight(); // refernce variable type (Parent) and object type (Child)
        box3.area_calculation(); // It is the type of reference variable that decided which members 
                                 // can be accessed by the object

    }    
}
