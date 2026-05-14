import java.util.*;

public class Translation563 {
    public static Format byId(final int id) {
    for(Format format : values()) {
        if(format.id == id)return format;
    }
    throw new IllegalArgumentException("Unknown format id: " + id);
}
}