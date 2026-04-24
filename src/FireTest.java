import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FireTest {
    @Test
    public void testTimeToBurnExample() {
        char[][] forest = {
                { 't', '.', '.', 't', 't', 't', 't', '.', 't' },
                { '.', '.', 't', 't', '.', '.', '.', '.', 't' },
                { '.', '.', 't', 't', 't', 't', 't', 't', 't' },
                { 't', 't', 't', 't', '.', '.', '.', '.', '.' }
        };

        int matchR = 2;
        int matchC = 6;

        int expected = 8;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }

    // Add more tests!

    @Test
    public void testLineOfTrees() {
        char[][] forest = {
                { 't', 't', 't', 't' }
        };

        int expected = 3;
        int actual = Fire.timeToBurn(forest, 0, 0);

        assertEquals(expected, actual);
    }

    @Test
    public void testSingleTree() {
        char[][] forest = {
                { 't' }
        };

        int expected = 0;
        int actual = Fire.timeToBurn(forest, 0, 0);

        assertEquals(expected, actual);
    }

    @Test
    public void testStartOnEmpty() {
        char[][] forest = {
                { 't', '.', 't' },
                { '.', '.', 't' }
        };

        int expected = -1;
        int actual = Fire.timeToBurn(forest, 0, 1);

        assertEquals(expected, actual);
    }
}
