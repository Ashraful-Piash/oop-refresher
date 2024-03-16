package piashraful.atm;

class Greet{
    public void sayGreetingMessage(){
        System.out.println("It varies from country to country! ");
    }
}
class Bangladesh extends Greet{
    @Override
    public void sayGreetingMessage() {
        System.out.println("Kemon acho? !");
    }
}
class Pakistan extends  Greet{
    @Override
    public void sayGreetingMessage() {
        System.out.println("Keysa hooo!");
    }
}


public class MethodOverridingExample {
    public static void main(String[] args) {
        Bangladesh bangladesh = new Bangladesh();
        bangladesh.sayGreetingMessage();
        Pakistan pakistan = new Pakistan();
        pakistan.sayGreetingMessage();

    }
}
