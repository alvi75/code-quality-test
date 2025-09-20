import java.util.*;

public class Translation588 {
    public void setByteValue(byte value) {
    if (!(getValues()[0] instanceof Byte)) {
        throw new IllegalArgumentException("cannot change value type from " + getValues()[0].getClass().getName() + " to Byte");
    }
    setValues(new Byte[] {
        value }
        );
    }
}