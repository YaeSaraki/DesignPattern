package DecoratorPattern;

public class Student extends Person {
    public Student(String name) { this.name = name; }
    @Override
    public void operation() {
        System.out.println(name + "'s responsibility:");
        System.out.println("Study");
    }
}
