import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    public static String unescapeJava(String str) throws Exception {
        if (str == null || str.length() == 0) return "";
        int start = 0;
        while ((start = findJava(str, start)) != -1) {
            int end = findEndJava(str, start);
            if (end < 0) throw new IllegalArgumentException("Invalid escape sequence: " + str.substring(start));
            //System.out.println("unescaped "+str.substring(start,end)+" at index "+start+" with length "+(end-start));
            str = str.substring(0, start) + unescapeJava(str.substring(end));
        }
        return str;
    }
}