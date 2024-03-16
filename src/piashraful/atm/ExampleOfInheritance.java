package piashraful.atm;

class Vehicle{
    String name;
    int price;
    String colour;

    public void displayInformation(){
        System.out.println(name);
        System.out.println(price);
        System.out.println(colour);

    }
}

class Car extends Vehicle{
    String brand;
}







public class ExampleOfInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "My Car";
        car.brand = "Ferrari";
        car.colour = "RED";
        car.price = 100000;
       car.displayInformation();

    }
}
