import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Map m = new HashMap();
        // String str = "Hello my name is Suman Saurav";// space-5, a-4, e-2, h-1, i-1,
        // l-2.....

        // // System.out.println(str.toCharArray());
        // for (char x : str.toCharArray()) {
        // // System.out.println(x);
        // if (m.containsKey(x)) {
        // int old = (int) m.get(x);
        // m.put(x, old + 1);
        // } else {
        // m.put(x, 1);
        // }
        // }
        // m.remove(' ');//remove the space
        // System.out.println(m);

        int[] x = { -99, 5, 6, 3, 2, 4 };
        int y = x.length;
        Arrays.sort(x, 0, y);
        for (int i : x) {
            System.out.print(i + ", ");
        }

    }
}
