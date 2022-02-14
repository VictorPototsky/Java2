package lesson1;

public class Main {


    public static void main(String[] args) {

        Cat cat = new Cat(200, 5);
        Human human = new Human(500, 2);
        Robot robot = new Robot(1200, 9);

        Wall wall = new Wall(2);
        Track track = new Track(1500);

        Competitor[] competitors = {cat, human, robot};
        Obstacle[] obstacles = {wall, track};

        for (int i = 0; i < competitors.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (!obstaclePass(competitors[i], obstacles[j])) {
                    break;
                }
            }
        }
    }


    public static boolean obstaclePass(Competitor c, Obstacle o) {

        System.out.print("Ну что, " + c.getName() + ",");
        o.doAction();
        switch (o.getName()) {
            case "Wall": {
                if (c.getHeight() < o.getValue()) {
                    negativeResult(c, o);
                    c.jump();
                    return false;
                } else {
                    positiveResult(c, o);
                    break;
                }
            }
            case "Track": {
                if (c.getDistance() < o.getValue()) {
                    negativeResult(c, o);
                    c.run();
                    return false;
                } else {
                    positiveResult(c, o);
                    break;
                }
            }
        }
        return true;
    }


    public static void negativeResult(Competitor c, Obstacle o) {
        System.out.println(c.iDidIt(false));
        System.out.println("Участник " + c.getName() + " не смог преодолеть препятствие " + o.getName() + " (" + o.getValue() + " м) и закончил выступления...");
    }

    public static void positiveResult(Competitor c, Obstacle o) {
        System.out.println(c.iDidIt(true));
        System.out.println("Испытание " + o.getName() + " (" + o.getValue() + " м) покорилось участнику " + c.getName() + ". \n");
    }
}
