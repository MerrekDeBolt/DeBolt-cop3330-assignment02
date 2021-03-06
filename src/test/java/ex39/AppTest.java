package ex39;

import ex39.App;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        App app = new App();
        ArrayList<Map<String, String>> maps = app.createMaps();
        Collections.sort(maps, app.mapComparator);

        Map<String, String> map;

        map = maps.get(0);
        assertEquals(map.get("First Name"), "Jacquelyn");
        map = maps.get(1);
        assertEquals(map.get("First Name"), "Jake");
        map = maps.get(2);
        assertEquals(map.get("First Name"), "John");
        map = maps.get(3);
        assertEquals(map.get("First Name"), "Michaela");
        map = maps.get(4);
        assertEquals(map.get("First Name"), "Sally");
        map = maps.get(5);
        assertEquals(map.get("First Name"), "Tou");
    }
}
