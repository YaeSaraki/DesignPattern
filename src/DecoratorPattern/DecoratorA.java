package DecoratorPattern;

public class DecoratorA extends Decorator {
    public DecoratorA(Person person) { this.person = person; }
    @Override
    public void operation() {
        person.operation();
        System.out.println("Do homework");
    }
}
