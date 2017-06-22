package jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nico on 6/19/17 15:15.
 */
public class HeapOOM {

    static class OOMObject {
    }

    public static void main(String[] args) {

        List<OOMObject> list = new ArrayList<OOMObject>();
        while(true) {
            list.add(new OOMObject());
        }

    }
}
