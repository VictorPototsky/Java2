package lesson1;

public class Robot implements Competitor {

    private int distance;
    private int height;
    private String name;

    public Robot(int distance, int height) {
        this.distance = distance;
        this.height = height;
        this.name = "Робот";
    }

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
        return (yes == true) ? "Yeeeee! I did it !!!" : "No, not now... I'll be back... ";
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгает до " + getHeight() + " м");
    }

    @Override
    public void run() {
        System.out.println("Робот бежит " + getDistance() + " м");
    }
}
