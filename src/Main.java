public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Мурзик");
        cat.run(100);
        cat.swim(200);
        Cat cat2 = new Cat("Котэ");
        Dog dog = new Dog("Тузик");
        dog.run(501);
        cat2.jump(2);

        cat.infoCount();
    }
}
