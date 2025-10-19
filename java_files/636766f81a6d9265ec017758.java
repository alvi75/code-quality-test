import java.util.*;

public class Generated_636766f81a6d9265ec017758 {
    @Override
    public int hashCode() {
        if (type == Type.OBJECT) {
            return super.hashCode();
        } else if (type == Type.ARRAY) {
            return 31 * super.hashCode() + ArrayUtil.hashCodeArray((Object[]) get());
        } else {
            throw new IllegalArgumentException("Unsupported type: " + type);
        }
    }
}