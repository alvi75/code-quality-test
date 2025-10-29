import java.util.*;

public class Generated_636766f81a6d9265ec017758 {
    @Override
    public int hashCode(){
        switch (type){
            case INT:
                return Integer.hashCode(value);
            case LONG:
                return Long.hashCode(value);
            case FLOAT:
                return Float.floatToIntBits(value);
            case DOUBLE:
                return Double.doubleToLongBits(value);
            case STRING:
                return value.hashCode();
            default:
                throw new IllegalStateException("Unknown type: " + type);
        }
    }
}