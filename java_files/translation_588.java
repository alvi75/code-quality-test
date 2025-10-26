import java.util.*;

public class Translation588 {
    ublic void setByteValue(byte value) {
    if (!(FieldsData instanceof Byte)) {
        throw new IllegalArgumentException("cannot change value type from " + FieldsData.getClass().getName() + " to Byte");
    }
    FieldsData = new Byte(value);
}
}