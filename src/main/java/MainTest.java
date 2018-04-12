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

        String key = "71721965595071481856146123";
        System.out.println(getClusterIndex(key, 16));
//        String id = "F007123456";
//        System.out.println(Integer.valueOf(id.substring(1, id.length())));
//        System.out.println("F007" + String.format("%06d", 123456789));
    }
    public static int getClusterIndex(String partionKey, int clusterNums) {
        return Math.abs(partionKey.hashCode()) % clusterNums;
    }

    //
//  int    polyCorners  =  how many corners the polygon has (no repeats)
//  float  polyX[]      =  horizontal coordinates of corners
//  float  polyY[]      =  vertical coordinates of corners
//  float  x, y         =  point to be tested
//
//  (Globals are used in this example for purposes of speed.  Change as
//  desired.)
//
//  The function will return YES if the point x,y is inside the polygon, or
//  NO if it is not.  If the point is exactly on the edge of the polygon,
//  then the function may return YES or NO.
//
//  Note that division by zero is avoided because the division is protected
//  by the "if" clause which surrounds it.

    boolean pointInPolygon(int polyCorners, float[] polyX, float[] polyY, float x, float y) {

        int i, j = polyCorners - 1;
        boolean oddNodes = false;

        for (i = 0; i < polyCorners; i++) {
            if (polyY[i] < y && polyY[j] >= y
                || polyY[j] < y && polyY[i] >= y) {
                if (polyX[i] + (y - polyY[i]) / (polyY[j] - polyY[i]) * (polyX[j] - polyX[i]) < x) {
                    oddNodes = !oddNodes;
                }
            }
            j = i;
        }
        return oddNodes;
    }
}
