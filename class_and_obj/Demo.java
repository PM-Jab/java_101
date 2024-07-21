package class_and_obj;

// super class
class Human {
    private String name;
    private int age;

    public Human() {
        name = "BigTuu";
        age = 18;

        System.out.println("Define Human");
    }

    // overload providing multiple methods with the same name but different
    // parameter lists
    public Human(String name) {
        this.name = name;
        age = 18;

        System.out.println("Define Human with custom name");
    }

    public Human(int age) {
        name = "BigTuu";
        this.age = age;

        System.out.println("Define Human with custom age");
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("Define Human with custom name and age");
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

// sub class
class Employee extends Human {
    private String employee_id;
    private String role;
    private int salary;

    // java constructor always execute super() first
    public Employee() {
        super(); // if super class exist then execute super class's constructor
        employee_id = "a1" + this.getName() + this.getAge();
        role = "associate";
        salary = 15000;

        System.out.println("Define Employee");
    }

    public Employee(String name) {
        super(name); // if super class exist then execute super class's constructor with
                     // (string argument)
        employee_id = "a1" + this.getName() + this.getAge();
        role = "associate";
        salary = 15000;

        System.out.println("Define Employee");
    }

    public Employee(String name, int age) {
        super(name, age); // if super class exist then execute super class's constructor with
                          // (string and int arguments)
        employee_id = "a1" + this.getName() + this.getAge();
        role = "associate";
        salary = 15000;

        System.out.println("Define Employee");
    }

    public String getEmployeeId() {
        return this.employee_id;
    }

    public String getRole() {
        return this.role;
    }

    public int getSalary() {
        return this.salary;
    }
}

public class Demo {
    public static void main(String[] args) {
        // human_class();
        employee_class();
    }

    public static void human_class() {
        Human jab = new Human();
        jab.setName("Jab");
        jab.setAge(10);

        System.out.println(jab.getName() + ":" + jab.getAge());
    }

    public static void employee_class() {
        Employee jab = new Employee("Robert", 50);

        System.out.println(jab.getEmployeeId() + ":" + jab.getRole() + ":" + jab.getSalary());
    }
}
