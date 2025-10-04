import java.util.*;

public class Translation588 {
    public void setByteValue(byte value) {
    if (!(fieldsData instanceof Byte)) {
        throw new IllegalArgumentException("cannot change value type from " + fieldsData.getClass().getSimpleName() + " to Byte");
    }
    fieldsData = Byte.valueOf(value);
}
}