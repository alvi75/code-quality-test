import java.util.*;

public class Translation563 {
    public static Format byId(int id) {
    for (Format format : values()) {
        if (format.getId() == id) {
            return format;
        }
    }
    throw new IllegalArgumentException("Unknown format id: " + id);
}
}