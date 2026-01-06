import java.util.*;

public class Generated_636766f81a6d9265ec017758 {
    @Override
    public int hashCode() {
        if (type == null) {
            return 0;
        }
        switch (type) {
            case BOOLEAN:
                return 1;
            case BYTE:
                return 2;
            case CHAR:
                return 3;
            case DOUBLE:
                return 4;
            case FLOAT:
                return 5;
            case INT:
                return 6;
            case LONG:
                return 7;
            case SHORT:
                return 8;
            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}