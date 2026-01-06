import java.util.*;

public class Translation562 {
    public void registerDevice(String deviceId) {
    String path = "/devices/" + deviceId;
    String resourcePath = path.replaceFirst("^/[^/]+", "");
    setResourcePath(resourcePath);
    post(path);
}
}