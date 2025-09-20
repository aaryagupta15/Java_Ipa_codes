
public class strings1 {

    static void substrings(String str){
        for(int i=0;i<=str.length();i++){
            for(int j=i;j<=str.length();j++){
            System.out.print(str.substring(i,j)+ " ");
        }
        System.out.println();
    }
    }
    public static void main(String args[]){
        String str4 = "xyz";
        String gtr = "abcd";

        System.out.println(str4.compareTo(gtr));
        System.out.println(str4.concat(gtr));
        substrings("abcd");
        String s2 = "Aarya";
        String s1 = new String("Aarya");

        if(s1==s2){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        if(s1.compareTo(s2)==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        StringBuilder str = new StringBuilder("Aarya");
        StringBuilder str2 = new StringBuilder("Aarya");


        
    }
    
}
