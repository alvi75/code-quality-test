import java.util.*;

public class Generated_636766f81a6d9265ec017758 {
    /**Compute a hash code according to the type.**/
    @Override public int hashCode(){
        switch (type){
            case STRING:
                return value.hashCode();
            case INTEGER:
                return value.intValue();
            case DOUBLE:
                return value.doubleValue();
            default:
                throw new IllegalStateException("Unknown type");
        }
    }
}