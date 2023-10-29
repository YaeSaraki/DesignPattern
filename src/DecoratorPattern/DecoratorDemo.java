package DecoratorPattern;

public class DecoratorDemo {
    public static void main(String[] args) {
        Person zhangsan = new Student("ZhangSan");
        zhangsan.operation();

        System.out.println("======");

        zhangsan = new DecoratorA(zhangsan);
        zhangsan.operation();

        System.out.println("======");

        zhangsan = new DecoratorB(zhangsan);
        zhangsan.operation();
    }
}
