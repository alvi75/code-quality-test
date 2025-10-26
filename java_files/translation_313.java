import java.util.*;

public class Translation313 {
    ublic String toString() {
    StringBuilder sb = new StringBuilder(64);
    sb.append(getType().getName()).append(" [");
    sb.append(_index).append(" ").append(_name);
    sb.append("]");
    return sb.toString();
}
}