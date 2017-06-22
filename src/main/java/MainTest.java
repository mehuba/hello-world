import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Nico on 6/1/17 18:30.
 */
public class MainTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(list);
        Collections.sort(list);
    }
}
