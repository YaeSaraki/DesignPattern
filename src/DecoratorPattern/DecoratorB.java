package DecoratorPattern;

public class DecoratorB extends  Decorator {
    public DecoratorB(Person person) { this.person = person; }
    @Override
    public void operation() {
        person.operation();
        System.out.println("exam");
    }
}
