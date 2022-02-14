package lesson1;

public class Wall implements Obstacle{
    private int value;

    public Wall(int value) {
        this.value = value;
    }

    @Override
    public void doAction() {
        System.out.println(" перепрыгнешь стену в "+ getValue()+ " м?");
    }

    public int getValue() {
        return value;
    }


    @Override
    public String getName() {
        return "Wall";
    }


}
