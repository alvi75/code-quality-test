import java.util.*;

public class Translation630 {
    public String toString() {
    final StringBuilder bufferName = new StringBuilder(getClass().getName());
    final int lastDotPos = name.lastIndexOf('.');
    if (lastDotPos > 0)name.setLength(lastDotPos);
    return name.substring(lastDotPos + 1).replace('$', '.');
}
}