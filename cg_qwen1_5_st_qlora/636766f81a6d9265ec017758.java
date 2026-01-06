import java.util.*;

public class Generated_636766f81a6d9265ec017758 {
    @Override
    /**Compute a hash code according to the type.**/
    public int hashCode(){
        if (type == null) return 0;
        switch(type){
            case STRING:
                return String.hashCode(value);
            case INT:
                return Integer.hashCode((int)value);
            case LONG:
                return Long.hashCode((long)value);
            case FLOAT:
                return Float.hashCode((float)value);
            case DOUBLE:
                return Double.hashCode((double)value);
            default:
                throw new RuntimeException("Unknown type: "+type);
        }
    }
}