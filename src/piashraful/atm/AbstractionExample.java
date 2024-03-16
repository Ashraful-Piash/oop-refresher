package piashraful.atm;

abstract  class Vehicles{
    abstract public void run();

}
class Cars extends Vehicles{

    @Override
    public void run() {
        System.out.println("Car is running");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
       Cars cars = new Cars();
       cars.run();
    }
}
