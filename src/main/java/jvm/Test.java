package jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * switch jdk version and set jvm params to see exceptions.
 * jdk6:-XX:PermSize=10M -XX:MaxPermSize=10M
 * jdk7:-Xmx20m -Xms20m
 * Created by Nico on 5/9/17 17:51.
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        int i=0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
