package piashraful.atm;

class Student{
    private String name;
    private String email;
    private int rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Piash");
        student1.setEmail("haque@gmail.com");
        student1.setRollNo(1);
        System.out.println(student1.getName());
        System.out.println(student1.getEmail());
        System.out.println(student1.getRollNo());

    }
}
