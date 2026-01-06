import java.util.*;

public class Translation709 {
    public String toString() {
    StringBuilder sb = new StringBuilder(64);
    sb.append(getType().getName());
    sb.append(" [").append(getFirstRowFormatString()).append(':').append(getLastRowFormatString()).append("]");
    return sb.toString();
}
}