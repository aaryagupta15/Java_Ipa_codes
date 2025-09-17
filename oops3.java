abstract class Parent{ // I can't make the class "final" because final class can't be inherited. 
    abstract void career();
    abstract void partner();

    // abstract static not_possible(){} 

    static void possible(){
        System.out.println("Static methods can be made under abstract classes  ");
    }

    void normal_method(){
        System.out.println("Normal methods can be made under normal_methods but can only be called by" + 
        " subclass objects as abstract classes don't have an object.");
    }

}

class Son extends Parent{

    @Override
    void career(){
        System.out.println("I am his son, and I want to be a house-man.");
    }

    void career(String name){
        System.out.println("I want to be " + name);
    }

    @Override
    void partner(){
        System.out.println("I want to marry Pepper Potts.");
    }

    @Override
    void normal_method(){
        System.out.println("I am overidding a normal method");
    }

}

class Daughter extends Parent{

    @Override
    void career(){
        System.out.println("I am his daughter, and I want to be a System Programmar at Infosys.");
    }

    @Override
    void partner(){
        System.out.println("I want to marry Iron Man.");
    }

    void partner(String name){
        System.out.println("I want to marry "+ name);
    }

}
public class oops3 {
    public static void main(String[] args) {

        // Parent mom = new Parent(); // cannot create objects and constructors of an abstract class

        Son son = new Son();
        son.career();
        son.career("Doctor");
        Daughter daughter = new Daughter();
        daughter.career();
        daughter.partner("Spider Man");

        Parent.possible();
        son.normal_method();

        Parent son2 = new Son(); // Abstract class can also act as reference variable
        son2.partner();
    }    
}
