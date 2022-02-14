package lesson1;

public class Human implements Competitor {
    private int distance;
    private int height;
    private String name;


    public Human(int distance, int height) {
        this.distance = distance;
        this.height = height;
        this.name = "Человек";
    }

    @Override
    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String iDidIt(boolean yes) {
        return (yes == true) ? "Вот я дал! Вот я молодец!" : "Нашли дурака, сами попробуйте... ";
    }

    @Override
    public void jump() {
        System.out.println("Человек не кенгуру! Прыгает не выше " + getHeight() + " м \n");
    }

    @Override
    public void run() {
        System.out.println("Зачем человеку так далеко бежать? Он может пробежать только " + getDistance() + " м \n");

    }
}
