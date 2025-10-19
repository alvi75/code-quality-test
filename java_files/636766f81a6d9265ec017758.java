import java.util.*;

public class Generated_636766f81a6d9265ec017758 {
    @Override
    public int hashCode(){
        if (this.type == null) {
            return 0;
        }
        switch (type.getType()) {
            case INTEGER:
                return ((Integer) this.value).intValue();
            case LONG:
                return ((Long) this.value).intValue();
            case FLOAT:
                return Float.floatToIntBits((Float) this.value);
            case DOUBLE:
                long temp = Double.doubleToRawLongBits((Double) this.value);
                //the last 32 bits of a double is the same as its integer representation.
                return (int)temp;
            default:
                return this.type.getName().hashCode() * 17 + this.value.hashCode();
        }
    }
}