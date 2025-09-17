import java.util.*;

public class Translationtranslation_673 {
    public static int getEffectivePort(String scheme, int defaultPort) {
        int port = parsePort(scheme);
        if (port == -1) {
            return defaultPort;
        }
        else if (port > 65535) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.get().invalidPortNumber, Integer.valueOf(port)));
        }
        return port;
    }
}