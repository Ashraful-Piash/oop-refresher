package piashraful.atm;

class Character{
    String name;
    String power;

    public Character(String name, String power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}


public class ConstructorExample {
    public static void main(String[] args) {
        Character harry = new Character("Harry potter", "Wizard");
        System.out.println(harry);

    }
}
