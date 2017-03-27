package thkinjava.string;

/**
 * Created by Nico on 2/13/17 14:43.
 */
public class WhitherStringBuilder {
    public String implicit(String[] fields) {
        String result = "";
        for (int i = 0; i < fields.length; i++) {
            result += fields[i];
        }
        return result;
    }
}
