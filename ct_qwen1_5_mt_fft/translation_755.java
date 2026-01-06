import java.util.*;

public class Translation755 {
    public boolean equals(Object o) {
    if (!(o instanceof Property)) return false;
    Property p = (Property) o;
    final Object pValue = p.getValue();
    final long pId = p.getID();
    if (id != pId || (id != 0 && !typesAreEqual(type, p.getType()))) return false;
    if (value == null && pValue == null) return true;
    if (value == null || pValue == null) return false;
    final Class<?> valueClass = value.getClass();
    final Class<?> pValueClass = pValue.getClass();
    if (!valueClass.isAssignableFrom(pValueClass) && !pValueClass.isAssignableFrom(valueClass)) return false;
    if (value instanceof byte[]) {
        final byte[] v = (byte[]) value;
        final byte[] pv = (byte[]) pValue;
        return Arrays.equals(v, pv);
    }
    else if (value instanceof char[]) {
        final char[] v = (char[]) value;
        final char[] pv = (char[]) pValue;
        return Arrays.equals(v, pv);
    }
    else if (value instanceof double[]) {
        final double[] v = (double[]) value;
        final double[] pv = (double[]) pValue;
        return Arrays.equals(v, pv);
    }
    else if (value instanceof float[]) {
        final float[] v = (float[]) value;
        final float[] pv = (float[]) pValue;
        return Arrays.equals(v, pv);
    }
    else if (value instanceof int[]) {
        final int[] v = (int[]) value;
        final int[] pv = (int[]) pValue;
        return Arrays.equals(v, pv);
    }
    else if (value instanceof long[]) {
        final long[] v = (long[]) value;
        final long[] pv = (long[]) pValue;
        return Arrays.equals(v, pv);
    }
    else if (value instanceof short[]) {
        final short[] v = (short[]) value;
        final short[] pv = (short[]) pValue;
        return Arrays.equals(v, pv);
    }
    else if (value instanceof boolean[]) {
        final boolean[] v = (boolean[]) value;
        final boolean[] pv = (boolean[]) pValue;
        return Arrays.equals(v, pv);
    }
    else if (value instanceof Object[]) {
        final Object[] v = (Object[]) value;
        final Object[] pv = (Object[]) pValue;
        for (int i = 0;
        i < v.length;
        i++) {
            if (!v[i].equals(pv[i]))return false;
        }
        return true;
    }
    else {
        throw new IllegalArgumentException("Cannot compare values of types " + value.GetType() + " and " + pValue.GetType());
    }
}
}