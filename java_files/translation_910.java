import java.util.*;

public class Translationtranslation_910 {
    public final InputStream openResource(String resource) throws IOException {
        final URL url = clazz.getClassLoader().loadResource(resource);
        if (url == null) {
            throw new IOException("Resource not found: " + resource);
        }
        return new URLReader(url);
    }
}