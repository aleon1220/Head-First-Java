package chap02;

public class Player {
    // This variable holds the player's guess number
    int number = 0;

    // This method generates a random guess number between 0 and 9 (inclusive)
    public void guess() {
        // Generate a random number between 0 and 9 and assign it to the number variable
        number = (int) (Math.random() * 10);
        // Print out the guessed number to the console
        System.out.println("I'm guessing " + number);
    }
}