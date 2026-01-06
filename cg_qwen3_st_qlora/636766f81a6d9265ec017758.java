import java.util.*;

public class Generated_636766f81a6d9265ec017758 {
    @Override
    public int hashCode(){
        switch (type){
            case TYPE_INT:
                return Integer.hashCode(value);
            case TYPE_LONG:
                return Long.hashCode(value);
            case TYPE_FLOAT:
                return Float.floatToIntBits(value);
            case TYPE_DOUBLE:
                return Double.doubleToLongBits(value);
            case TYPE_BOOLEAN:
                return Boolean.valueOf(value).hashCode();
            case TYPE_STRING:
                return value.hashCode();
            default:
                throw new IllegalStateException("Unknown type: " + type);
        }
    }
}