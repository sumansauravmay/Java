import java.util.Map;
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("a", 5);
        m.put("b", 10);
        m.put("c", 15);

        // String y=m.containsValue("a");

        // System.out.println(m);
        // System.out.println(m.get("c"));
        // System.out.println(m.containsKey("a"));
        // System.out.println(m.containsValue(15));

        m.clear();
        System.out.println(m);

    }
}
