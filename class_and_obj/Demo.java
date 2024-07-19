package class_and_obj;

class Human {
    private String name;
    private int age;

    public Human() {
        name = "John Doe";
        age = 18;
    }

    // overload providing multiple methods with the same name but different
    // parameter lists
    public Human(String name) {
        this.name = name;
        age = 18;
    }

    public Human(int age) {
        name = "John Doe";
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // obj.name accesses name field of the object referenced by obj in argument.
    public void setName(String name, Human obj) {
        System.out.println("a");
        obj.name = name;
    }

    // this.name accesses name field of the current object(the method caller)
    public void setName(String name) {
        System.out.println("b");
        this.name = name;
    }

    public void setAge(int new_age) {
        this.age = new_age;
    }
}

class Employee extends Human {
    private String employee_id;
    private String role;
    private int salary;

    public Employee() {
        employee_id = "a1" + this.getName();
        role = "associate";
        salary = 15000;
    }
}

public class Demo {
    public static void main(String[] args) {
        Human jab = new Human();
        jab.setName("Jab");
        jab.setAge(10);

        System.out.println(jab.getName() + ":" + jab.getAge());
    }
}
