package lesson1;

public interface Competitor extends Jumper,Runner{
  void run();
  void jump();
  String getName();
  int getDistance();
  int getHeight();
  String iDidIt(boolean yes);

}
