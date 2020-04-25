import java.util.Random;

public class Animal {
    private String name;
    Random random = new Random();
    private int runLenght = (500+(int)(500*(float)random.nextInt(10)/100));
    private float jumpHeight = (2+(2*(float)random.nextInt(50)/100));
    private int swimLenght = (50+(int)(50*(float)random.nextInt(20)/100));
    private static int count = 0;
    private static int countDog = 0;
    private static int countCat = 0;

    public Animal() {
        this.name = "Животное";
        this.count++;
    }

    public Animal(String name) {
        this.name = name;
        this.count++;
    }

    public void run(int lenght){
        if(lenght <= this.runLenght) {
            System.out.printf("%s бежит %d метров\n",this.name,lenght);
        } else {
            System.out.printf("%s не может пробежать столько метров\n",this.name);
        }
        System.out.println(lenght <= this.runLenght);
    }

    public void swim(int lenght){
        if (lenght <= this.swimLenght) {
            System.out.printf("%s плывет %d метров\n",this.name,lenght);
        } else {
            System.out.printf("%s не может проплыть столько метров\n",this.name);
        }
        System.out.println(lenght <= this.swimLenght);
    }

    public void jump(int height){
        if(height <= this.jumpHeight) {
            System.out.printf("%s прыгнул на %d метров\n",this.name,height);
        } else {
            System.out.printf("%s не может прыгнуть так высоко\n",this.name);
        }
        System.out.println(height <= this.jumpHeight);
    }

    public void infoCount(){
        System.out.printf("У нас создано %d животных, из них %d котов и %d собак",count,countCat,countDog);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRunLenght(int runLenght) {
        this.runLenght = runLenght;
    }

    public static void addCountDog() {
        Animal.countDog ++;
    }

    public static void addCountCat() {
        Animal.countCat ++;
    }

    public void setJumpHeight(float jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public void setSwimLenght(int swimLenght) {
        this.swimLenght = swimLenght;
    }

}
