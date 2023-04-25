import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testCompareChoicesTie() {
        // Test a tie
        int result = Game.compareChoices("kivi", "kivi");
        assertEquals(0, result);

        result = Game.compareChoices("paperi", "paperi");
        assertEquals(0, result);

        result = Game.compareChoices("sakset", "sakset");
        assertEquals(0, result);
    }

    @Test
    public void testCompareChoicesPlayer1Wins() {
        // Test player 1 wins
        int result = Game.compareChoices("kivi", "sakset");
        assertEquals(1, result);

        result = Game.compareChoices("paperi", "kivi");
        assertEquals(1, result);

        result = Game.compareChoices("sakset", "paperi");
        assertEquals(1, result);
    }

    @Test
    public void testCompareChoicesPlayer2Wins() {
        // Test player 2 wins
        int result = Game.compareChoices("kivi", "paperi");
        assertEquals(2, result);

        result = Game.compareChoices("paperi", "sakset");
        assertEquals(2, result);

        result = Game.compareChoices("sakset", "kivi");
        assertEquals(2, result);
    }

}