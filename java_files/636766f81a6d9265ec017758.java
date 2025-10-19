import java.util.*;

public class Generated_636766f81a6d9265ec017758 {
    /**Compute a hash code according to the type.**/
@Override
    public int hashCode(){
        switch (type) {
            case STRING:
                return value.hashCode();
            case INTEGER:
                return value.intValue();
            case LONG:
                return value.longValue();
            case DOUBLE:
                return Double.valueOf(value).hashCode();
            case BOOLEAN:
                return Boolean.valueOf(value).hashCode();
            default:
                throw new IllegalStateException("Unknown type: " + type);
        }
    }
}