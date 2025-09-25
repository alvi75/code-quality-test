import java.util.*;

public class Translation588 {
    public void setByteValue(Byte value) {
    if (fieldsData == null) {
        throw new IllegalArgumentException("cannot change value type from " + fieldsData.getClass().getName() + " to Byte");
    }
    fieldsData = new Byte(value);
}
}