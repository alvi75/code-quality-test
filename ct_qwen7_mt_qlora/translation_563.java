import java.util.*;

public class Translation563 {
    1 public static Format byId(int id) {
    2 for (Format format : values())3 if (format.id == id)4 return format;
    5 throw new IllegalArgumentException("Unknown format id: " + id);
}
}