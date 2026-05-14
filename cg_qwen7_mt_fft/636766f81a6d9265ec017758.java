import java.util.*;

public class Generated_636766f81a6d9265ec017758 {
    @Override
    public int hashCode() {
        if (type == null) return 0;
        else switch(type){
            case BOOLEAN:return bVal?1:0;
            case BYTE:return ((int)bVal)&0xFF;
            case SHORT:return ((int)sVal)&0xFFFF;
            case CHAR:return ((int)cVal)&0xFFFF;
            case INT:return iVal;
            case FLOAT:return Float.floatToIntBits(fVal);
            case LONG:return Long.hashCode(lVal);
            case DOUBLE:return Double.doubleToLongBits(dVal);
            default:return objVal.hashCode();
        }
    }
}