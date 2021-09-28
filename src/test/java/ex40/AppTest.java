package ex40;

import ex40.App;
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
        ArrayList<Map<String, String>> filteredMaps = app.filterMaps(maps, "Jac");
        Collections.sort(filteredMaps, app.mapComparator);

        Map<String, String> map;

        map = filteredMaps.get(0);
        assertEquals(map.get("First Name"), "Jacquelyn");
        map = filteredMaps.get(1);
        assertEquals(map.get("First Name"), "Jake");
    }
}
