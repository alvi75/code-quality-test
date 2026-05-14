import java.util.*;

public class Translation910 {
    public InputStream openResource(String resource) throws IOException {
    InputStream stream = clazz.getResourceAsStream(resource);
    if (stream == null) {
        throw new FileNotFoundException(resource);
    }
    return stream;
}
}