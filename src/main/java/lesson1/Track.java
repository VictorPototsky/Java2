package lesson1;

public class Track implements Obstacle{
 private int value;

    public Track(int value) {
        this.value = value;
    }

    @Override
    public void doAction() {
        System.out.println(" пробежишь  по дорожке "+ getValue()+ " м?");
    }

    @Override
    public String getName() {
        return "Track";
    }

    @Override
    public int getValue() {
        return value;
    }
}
