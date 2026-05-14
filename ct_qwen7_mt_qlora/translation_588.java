import java.util.*;

public class Translation588 {
    1 public final void setByteValue(byte value) {
    2 if (!(fieldsData instanceof Byte))3 throw new IllegalArgumentException4 ("cannot change value type from "5 + fieldsData.getClass().getName()6 + " to Byte");
    7 fieldsData = new Byte(value);
}
}