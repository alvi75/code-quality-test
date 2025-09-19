import java.util.*;

public class Translation673 {
    ublic static int getEffectivePort(String scheme, int specifiedPort) {
    if (specifiedPort != -1) {
        return specifiedPort;
    }
    if ("http".equals(scheme)) {
        return 80;
    }
    else if ("https".equals(scheme)) {
        return 443;
    }
    else {
        return -1;
    }
}
}