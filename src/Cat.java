import java.util.Random;

public class Cat extends Animal {
    private String name = "Кот";
    Random random = new Random();
    private int runLenght = (200+(int)(200*(float)random.nextInt(10)/100));
    private float jumpHeight = (2+(2*(float)random.nextInt(50)/100));
    private int swimLenght = 0;

    public Cat() {
        super();
        super.setName(this.name);
        super.setRunLenght(this.runLenght);
        super.setSwimLenght(this.swimLenght);
        super.setJumpHeight(this.jumpHeight);
        Animal.addCountCat();
    }

    public Cat(String name) {
        super(name);
        this.name = name;
        super.setRunLenght(this.runLenght);
        super.setSwimLenght(this.swimLenght);
        super.setJumpHeight(this.jumpHeight);
        Animal.addCountCat();
    }

    @Override
    public void swim(int lenght) {
        System.out.printf("%s не может плавать :( \n",name);
        System.out.println(false);
    }

}
