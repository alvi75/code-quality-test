import java.util.*;

public class Translation755 {
    public boolean equals(Object o) {
    if (!(o instanceof Property))return false;
    Property p = (Property) o;
    final long pId = p.getId();
    final int pType = p.getType();
    final Object pValue = p.getValue();
    final long pId1 = pId;
    pType = (short)pType;
    if (!equals(pValue, pId1))return false;
    return true;
}
}