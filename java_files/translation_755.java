import java.util.*;

public class Translation755 {
    0) {
    return false;
}
if (value == null && p.value == null)return true;
if (value == null || p.value == null)return false;
Type valueClass = value.getClass();
Type pValueClass = p.value.getClass();
if (!valueClass.isAssignableFrom(pValueClass)&&!pValueClass.isAssignableFrom(valueClass))return false;
if (value instanceof byte[])return Arrays.equals((byte[])value,(byte[])p.value);
return value.equals(p.value);
}
}