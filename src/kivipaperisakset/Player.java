
package kivipaperisakset;

import java.util.Random;

/**
 *
 * @author Ira Dook
 */
public class Player {

    private int wins;      // Voittojen lukumäärä
    private String choice = "";

    /**
     * Valitse satunnaisesti kivi, paperi tai sakset
     */
    public String getNewChoice() {

        Random random = new Random();
        int c = random.nextInt(3);
        switch (c) {
            case 0 -> choice = ("kivi");
            case 1 -> choice = ("paperi");
            case 2 -> choice = ("sakset");
            default -> System.err.println("Invalid choice");
        }
        return choice;
    }

    public String getChoice(){
        return choice;
    }

    public void incrementPlayerWins() {
        wins++;
    }

    public void resetWins(){
        wins = 0;
    }

    public int getWins() {
        return (wins);
    }
}
