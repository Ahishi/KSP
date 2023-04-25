package kivipaperisakset;

/**
 * @author Ira Dook
 */
public class Game {

    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();

        boolean gameEnded = false;
        int gamesPlayed = 1;           // Pelattujen pelien lkm
        int draws = 0;              // Tasapelien lkm

        do {
            print("Erä: " + gamesPlayed + " =====================\n");
            print("Tasapelien lukumäärä: " + draws + "\n");

            print("Pelaaja 1: " + player1.getNewChoice() + "\n\t Pelaaja 1:llä koossa " + player1.getWins() + " voittoa.");
            print("Pelaaja 2: " + player2.getNewChoice() + "\n\t Pelaaja 2:lla koossa " + player2.getWins() + " voittoa.");

            //Käyttää metodia compareChoices, joka päättelee voittiko pelaajan 1 vai pelaajan 2 valinta.
            int gameResult = compareChoices(player1.getChoice(), player2.getChoice());

            //Merkitesee gameResultin perusteella voittajan ylös
            switch (gameResult) {
                case 0 -> draws++;
                case 1 -> player1.incrementPlayerWins();
                case 2 -> player2.incrementPlayerWins();
                default -> System.err.println("Invalid result");
            }

            gamesPlayed++;

            if ((player1.getWins() >= 3) || (player2.getWins() >= 3)) {
                gameEnded = true;
                print("KOLME VOITTOA - PELI PÄÄTTYY");
            }

            print("");

        } while (!gameEnded);
    }

    public static int compareChoices(String player1Choice, String player2Choice) {
        if (player1Choice.equals(player2Choice)) {
            print("Tasapeli!\n");
            return 0;
        }

        if ((player1Choice.equals("kivi") && player2Choice.equals("sakset")) ||
                (player1Choice.equals("paperi") && player2Choice.equals("kivi")) ||
                (player1Choice.equals("sakset") && player2Choice.equals("paperi"))) {
            print("Pelaaja 1 voittaa!\n");
            return 1;
        }
        print("Pelaaja 2 voittaa!\n");
        return 2;
    }


    private static void print(String text) {
        System.out.println(text);
    }
}
