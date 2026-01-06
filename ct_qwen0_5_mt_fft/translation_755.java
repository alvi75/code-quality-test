import java.util.*;

public class Translation755 {
    public boolean equals(Object o) {
    if (!(o instanceof Property)) return false;
    Property p = (Property)o;
    Object pValue = p.value;
    final long pId = p.id;
    if (id != pId || (id != 0 && !TypesAreEqual(type, p.type)))return false;
    if (value == null && pValue == null)return true;
    if (value == null || pValue == null)return false;
    final Type valueClass = value.getClass();
    final Type pValueClass = p.value.getClass();
    if (!valueClass.isAssignableFrom(pValueClass))return false;
    if (value == null || pValue == null)return true;
    if (valueClass.equals(pValueClass))return value.equals(pValue);
    return value.getClass().isArray()&&Arrays.deepEquals(value, pValue);
}
}