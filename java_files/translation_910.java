import java.util.*;

public class Translation910 {
    ublic InputStream openResource(String resource) throws IOException {
    InputStream stream = clazz.getClassLoader().getResourceAsStream(resource);
    if (stream == null) {
        throw new FileNotFoundException("Resource not found: " + resource);
    }
    return stream;
}
}