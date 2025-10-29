import java.util.*;

public class Translation910 {
    public static InputStream openResource(Class clazz, String resource) throws IOException {
    InputStream stream = clazz.getClassLoader().getResourceAsStream(resource);
    if (stream == null) {
        throw new IOException("Resource not found: " + resource);
    }
    return stream;
}
}