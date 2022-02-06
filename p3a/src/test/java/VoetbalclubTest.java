import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoetbalclubTest {
    private Voetbalclub Club;

    @BeforeEach
    public void init() {
        Club = new Voetbalclub("utreg");
    }

    @Test
    void verwerkResultaatw() {
        System.out.println("test winner");

        Club.verwerkResultaat('w');

        assertEquals(3, Club.aantalPunten());
    }

    @Test
    void verwerkResultaatg() {
        System.out.println("test even");

        Club.verwerkResultaat('g');

        assertEquals(1, Club.aantalPunten());

    }

    @Test
    void verwerkResultaatl() {
        System.out.println("test loser");

        Club.verwerkResultaat('l');

        assertEquals(0, Club.aantalPunten());
    }

    @Test
    void verwerkResultaaterror() {
        System.out.println("test error");

        Club.verwerkResultaat('e');

        assertEquals(0, Club.aantalPunten());
    }


    @Test
    void nameTestingw() {
        System.out.println("test win name error");

        Club = new Voetbalclub("");
        Club.verwerkResultaat('w');

        assertEquals(3, Club.aantalPunten());
    }

    @Test
    void nameTestingg() {
        System.out.println("test even name error");

        Club = new Voetbalclub("");
        Club.verwerkResultaat('g');

        assertEquals(1, Club.aantalPunten());
    }

    @Test
    void nameTestingl() {
        System.out.println("test lose name error");

        Club = new Voetbalclub("");
        Club.verwerkResultaat('l');

        assertEquals(0, Club.aantalPunten());
    }

    @Test
    void nameTestingerror() {
        System.out.println("test name error");

        Club = new Voetbalclub("");
        Club.verwerkResultaat('e');

        assertEquals(0, Club.aantalPunten());
    }
}
