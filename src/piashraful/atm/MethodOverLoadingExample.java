package piashraful.atm;

import static piashraful.atm.Main.sum;

class Main{
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b,int c){
        return a+b+c;
    }

    public static String sum(String a, String b){
        return a+b;
    }
}

public class MethodOverLoadingExample {
    public static void main(String[] args) {
        System.out.println(sum(5,6));
        System.out.println(sum(1,2,3));
        System.out.println(sum("Hello ", "Piash"));

    }
}
