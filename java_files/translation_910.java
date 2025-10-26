import java.util.*;

public class Translation910 {
    public InputStream openResource(String resource) throws IOException {
    InputStream stream = clazz.getTypeInfo().getAssembly().findAndGetManifestResourceStream(clazz, resource);
    if (stream == null) {
        throw new IOException("Resource not found: " + resource);
    }
    return stream;
}
}