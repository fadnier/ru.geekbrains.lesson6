import java.util.Random;

public class Dog extends Animal {
    private String name = "Собака";
    Random random = new Random();
    private int runLenght = (500+(int)(500*(float)random.nextInt(10)/100));
    private float jumpHeight = (0.5f+(0.5f*(float)random.nextInt(50)/100));
    private int swimLenght = (10+(int)(10*(float)random.nextInt(20)/100));

    public Dog() {
        super();
        super.setName(this.name);
        super.setRunLenght(this.runLenght);
        super.setSwimLenght(this.swimLenght);
        super.setJumpHeight(this.jumpHeight);
        Animal.addCountDog();
    }

    public Dog(String name) {
        super(name);
        this.name = name;
        super.setRunLenght(this.runLenght);
        super.setSwimLenght(this.swimLenght);
        super.setJumpHeight(this.jumpHeight);
        Animal.addCountDog();
    }

}
