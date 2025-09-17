class Learning_super{
    int a;
    int b;
    int c;

    Learning_super(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println(a+b+c);
    }

    Learning_super(){
        System.out.println("Learning worked");
    }
}

    class Subclass extends Learning_super{
        int x;

        Subclass(){
            System.out.println("Subclass worked");
        }
        Subclass(int a, int b, int c, int x){
            super(a,b,c);
            this.x = x;
            System.out.println(a+b+c+x);
        }
}



public class oops4 {
    public static void main(String[] args) {
        Learning_super obj1 = new Learning_super(10, 20, 30); 
        Subclass obj2 = new Subclass(100,200,300,400);       
    }
    
}
