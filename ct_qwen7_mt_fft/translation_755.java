import java.util.*;

public class Translation755 {
    public boolean equals(Object o) {
    if (!(o instanceof Property)) return false;
    Property p = (Property) o;
    final Object pValue = p.getValue();
    final long pId = p.getID();
    if (id != pId || (id != 0 && !typesAreCompatible(type,p.getType())))return false;
    if (value == null && pValue == null) return true;
    if (value == null || pValue == null) return false;
    final Class<?> valueClass = value.getClass();
    final Class<?> pValueClass = pValue.getClass();
    if (!valueClass.isAssignableFrom(pValueClass))return false;
    if (pValueClass.isAssignableFrom(valueClass))return true;
    if (value instanceof byte[])return Arrays.equals((byte[]) value, (byte[]) pValue);
    return value.equals(pValue);
}
}