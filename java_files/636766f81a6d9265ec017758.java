import java.util.*;

public class Generated_636766f81a6d9265ec017758 {
    /**
 * Compute a hash code according to the type.
 */ @Override public int hashCode() {
        switch (type) {
            case STRING:
                return value.hashCode();
            case INT:
                return Integer.valueOf(value).hashCode();
            case LONG:
                return Long.valueOf(value).hashCode();
            case FLOAT:
                return Float.valueOf(value).hashCode();
            case DOUBLE:
                return Double.valueOf(value).hashCode();
            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}