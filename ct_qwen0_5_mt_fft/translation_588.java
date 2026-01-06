import java.util.*;

public class Translation588 {
    public void setValue(byte value) {
    if (getFieldsData() instanceof byte[]) {
        setBytes(0, (byte[]) getFieldsData());
    }
    else {
        throw new IllegalArgumentException("cannot change value type from " + getFieldsData().getClass().getName() + " to byte");
    }
}
}