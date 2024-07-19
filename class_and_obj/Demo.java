package class_and_obj;

class Human {
    private String name;
    private int age;

    public Human() {
        name = "John Doe";
        age = 18;
    }

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

    public void setName(String name, Human obj) {
        System.out.println("a");
        obj.name = name;
    }

    public void setName(String name) {
        System.out.println("b");
        this.name = name;
    }

    public void setAge(int new_age) {
        this.age = new_age;
    }
}

public class Demo {
    public static void main(String[] args) {
        Human jab = new Human();
        // jab.setName("Jab");
        // jab.setAge(10);

        System.out.println(jab.getName() + ":" + jab.getAge());
    }
}
