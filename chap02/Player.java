package chap02;

public class Player {
    int number = 0;
    String name = "";

    Player(String name){
        this.name = name;
    }

    public void guess()
    {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
