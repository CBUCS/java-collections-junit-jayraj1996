import org.junit.jupiter.api.Test;
import org.hamcrest.collection.IsMapContaining;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;


public class TestMap {

    @Test
    public void testMap(){
        Map<String, String> map = new HashMap<>();
        map.put("v", "vismay");
        map.put("j", "jay");


        Map<String, String> expected = new HashMap<>();
        expected.put("v", "vismay");
        expected.put("j", "jay");


        //2. Test size
        assertThat(map.size(), is(2));

        assertThat(map, not(IsMapContaining.hasEntry("s", "shyam")));

        //4. Test map key
        assertThat(map, IsMapContaining.hasKey("j"));

        //5. Test map value
        assertThat(map, IsMapContaining.hasValue("vismay"));

    }
}
