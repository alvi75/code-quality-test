import java.util.*;

public class Translation883 {
    public static String getExtension(String name) {
    int dotPos = name.lastIndexOf('.');
    if (dotPos == -1)return "";
    else return name.substring(dotPos + 1, name.length());
}
}