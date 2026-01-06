import java.util.*;

public class Translation755 {
    @Override public boolean equals(Object o) {
    if (!(o instanceof Property)) return false;
    final Property p = (Property) o;
    final Object pValue = p.getValue();
    final long pId = p.getID();
    if ( id != pId || (id != 0 && !typesAreEqual(getType(), p.getType())) ) return false;
    if (value == null && pValue == null) return true;
    if (value == null || pValue == null) return false;
    final Class<?> valueClass = value.getClass();
    final Class<?> pValueClass = pValue.getClass();
    if (!valueClass.isAssignableFrom(pValueClass) && !pValueClass.isAssignableFrom(valueClass)) return false;
    if (value instanceof byte[] && pValue instanceof byte[]) return Arrays.equals((byte[]) value, (byte[]) pValue);
    return value.equals(pValue);
}
}