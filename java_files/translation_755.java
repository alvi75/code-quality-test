import java.util.*;

public class Translation755 {
    public boolean equals(final Object o) {
    if (!(o instanceof Property))return false;
    final Property p = (Property) o;
    final Object pValue = p.getValue();
    long pId = p.getID();
    return id == pId && (name.equals(p.getName()) || name.equalsIgnoreCase(p.getName()))&& value.equals(pValue);
}
}