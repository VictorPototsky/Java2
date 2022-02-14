package lesson1;

public class Cat implements Competitor {
    private int distance;
    private int height;
    private String name;

    public Cat(int distance, int height) {
        this.distance = distance;
        this.height = height;
        this.name= "Кот";
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

        return (yes) ? "Коты не только по ночам орать горазды !!! Мяу, готово!" : "Котов еще летать заставьте... ";
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает не выше " + getHeight()+" м \n");
    }

    @Override
    public void run() {
        System.out.println("Кот может пробежать не более " + getDistance()+" м \n" );
    }

}
