import java.util.*;

public class Translation673 {
    public static int getEffectivePort(String scheme new URL(strUrl);
String host = u.getHost();
int port = u.getPort();
if (host == null) {
    return DEFAULT_PORT;
}
if (port == -1) {
    if ("https".equals(u.getProtocol())) {
        port = HTTPS port = DEFAULT_HTTPPort;
    }
    else if ("http".equals(u.getProtocol())) {
        port = DEFAULT_HTTPPort;
    }
    else {
        return -1;
    }
}
}
}