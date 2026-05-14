import java.util.*;

public class Generated_636766f81a6d9265ec017758 {
    @Override
    public int hashCode(){
        if (type == null) return 0;
        switch(type){
            case STRING:
                return ((String)value).hashCode();
            case INT:
                return Integer.valueOf((Integer)value).hashCode();
            case LONG:
                return Long.valueOf((Long)value).hashCode();
            case FLOAT:
                return Float.valueOf((Float)value).hashCode();
            case DOUBLE:
                return Double.valueOf((Double)value).hashCode();
            default:
                throw new RuntimeException("Unknown type: " + type);
        }
    }
}