package Builder;

public class BuilderTest {
    public static void main(String[] args) {
        Director director = new Director();
        Human human = director.createHUmanByDirector(new SmartManBuilder());
        System.out.println(human.getHead());
        System.out.println(human.getBody());
        System.out.println(human.getHand());
        System.out.println(human.getFoot());
    }
}
