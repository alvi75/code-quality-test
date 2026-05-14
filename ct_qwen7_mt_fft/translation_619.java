import java.util.*;

public class Translation619 {
    public ParserExtension getExtension(String key) {
    ParserExtension value = extensions.get(key);
    if(value==null) {
        for(ParserExtension ext : extensions.values()) {
            if(ext.acceptsKey(key)) {
                value=ext;
                break;
            }
        }
    }
    return value;
}
}