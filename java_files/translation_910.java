import java.util.*;

public class Translationtranslation_910 {
    public InputStream openResource(String resource) throws IOException {
        InputStream stream = getClass().getClassLoader().getResource(resource);
        if (stream == null) {
            throw new FileNotFoundException("Resource not found: " + resource);
        }
        return stream;
    }
}