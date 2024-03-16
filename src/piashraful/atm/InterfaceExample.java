package piashraful.atm;

interface Animal{
    public void run();
}
class Lion implements Animal{

    @Override
    public void run() {
        System.out.println("Lion Runs!!!!");
    }
}

class Tiger implements Animal{

    @Override
    public void run() {
        System.out.println("Tiger runs!!");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.run();
        Animal tiger = new Tiger();
        tiger.run();


    }
}
