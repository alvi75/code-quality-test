import java.util.*;

public class Translationtranslation_910 {
    public InputStream openResource(String resource) throws IOException {
        InputStream stream = clazz.getClassLoader().getResourceAsStream(resource);
        if (stream == null) {
            throw new IOException("Resource not found: " + resource);
        }
        return stream;
    }
}