import java.util.*;

public class Translation673 {
    public static int getEffectivePort(String scheme, int specifiedPort) {
    if (specifiedPort != -1) {
        return specifiedPort;
    }
    if ("http".equals(scheme)) {
        return 80;
    }
    else if ("https".equals(scheme)) {
        return 443;
    }
    elsereturn -1;
}
}