import java.util.*;

public class Translationtranslation_755 {
    public boolean equals(final Object o) {
        if (!(o instanceof Property)) {
            return false;
        }
        final Property p = (Property) o;
        final Object pValue = p.getValue();
        final long pId = p.getId();
        if (id != pId || (id != 0 && !type.equals(p.getType()))) {
            return false;
        }
        if (value == null && pValue == null) {
            return true;
        }
        if (value == null || pValue == null) {
            return false;
        }
        final Class<?> valueClass = value.getClass();
        final Class<?> pValueClass = pValue.getClass();
        if (!valueClass.isAssignableFrom(pValueClass) && !pValueClass.isAssignableFrom(valueClass)) {
            return false;
        }
        if (value instanceof byte[]) {
            return Arrays.equals((byte[]) value, (byte[]) pValue);
        }
        return value.equals(pValue);
    }
}