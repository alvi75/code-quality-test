import java.util.*;

public class Translation755 {
    public boolean equals(Object o) {
    if (!(o instanceof Property)) return false;
    Property p = (Property) o;
    Object pValue = p.getValue();
    long pId = p.getID();
    if (getID() != pId || (getID() != 0 && !typesAreEqual(getType(), p.getType()))) return false;
    if (getValue() == null && pValue == null) return true;
    if (getValue() == null || pValue == null) return false;
    Type valueClass = getValue().getClass();
    Type pValueClass = pValue.getClass();
    if (!(valueClass.isAssignableFrom(pValueClass)) && !(pValueClass.isAssignableFrom(valueClass))) return false;
    if (getValue() instanceof byte[]) return Arrays.equals((byte[]) getValue(), (byte[]) pValue);
    return getValue().equals(pValue);
}
}