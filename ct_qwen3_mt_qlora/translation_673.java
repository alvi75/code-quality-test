import java.util.*;

public class Translation673 {
    2 public static int getEffectivePort(String scheme, int specifiedPort) {
    if (specifiedPort != -1) {
        return specifiedPort;
    }
    if ("http".equalsIgnoreCase(scheme)) {
        return 80;
    }
    else if ("https".equalsIgnoreCase(scheme)) {
        return 443;
    }
    else {
        return -1;
    }
}
}