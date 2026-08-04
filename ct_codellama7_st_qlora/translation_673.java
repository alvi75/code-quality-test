import java.util.*;

public class Translation673 {
    public static int getEffectivePort(String scheme, int specifiedPort) {
    if (specifiedPort != -1) {
        return specifiedPort;
    }
    if (scheme.equals("http")) {
        return 80;
    }
    else if (scheme.equals("https")) {
        return 443;
    }
    else {
        return -1;
    }
}
}