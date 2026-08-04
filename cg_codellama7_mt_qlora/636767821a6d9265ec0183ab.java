import java.util.*;

public class Generated_636767821a6d9265ec0183ab {
    public boolean hasThrown() {
        if (thrown == null) {
            return false;
        }
        if (thrown.getClass() == Throwable.class) {
            return true;
        }
        if (thrown.getClass() == Throwable[].class) {
            return true;
        }
        return false;
    }
}