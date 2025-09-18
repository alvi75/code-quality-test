import java.util.*;

public class Translation229 {
    public short getGB2312Id( char ch ) {
    Integer id = getUnicodeId(ch);
    if (id == null) {
        return -1;
    }
    return id;
}
}