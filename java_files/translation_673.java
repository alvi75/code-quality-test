import java.util.*;

public class Translation673 {
    ublic static int getEffectivePort(String scheme, int specifiedPort) {
    if (specifiedPort != -1) {
        return specifiedPort;
    }
    if (scheme.equalsIgnoreCase("http")) {
        return 80;
    }
    else if (scheme.equalsIgnoreCase("https")) {
        return 443;
    }
    else {
        return -1;
    }
}
}