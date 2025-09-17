import java.util.*;

public class Translationtranslation_644 {
    public ObjectToPack(AnyObjectId src, int type) {
        super(src);
        flags = type << PACK_DELTA;
    }
    Type type(int) {
        return (flags >> TYPE_SHIFT) & 0x7;
    }
}