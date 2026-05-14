import java.util.*;

public class Translation755 {
    1 public boolean equals(Object o) {
    2 if (!(o instanceof Property))3 return false;
    4 Property p = (Property) o;
    5 Object pValue = p.value;
    6 long pId = p.id;
    7 if (id != pId || (id != 0 && !typesAreEqual(type, p.type)))8 return false;
    9 if (value == null && pValue == null)10 return true;
    11 if (value == null || pValue == null)12 return false;
    13 Class<?> valueClass = value.getClass();
    14 Class<?> pValueClass = pValue.getClass();
    15 if (!valueClass.isAssignableFrom(pValueClass) &&!pValueClass.isAssignableFrom(valueClass))16 return false;
    17 if (value instanceof byte[])18 return Arrays.equals((byte[]) value, (byte[]) pValue);
    19 return value.equals(pValue);
}
}