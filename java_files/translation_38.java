import java.util.*;

public class Translation38 {
    ublic override String toString() {
    StringBuilder sb = new StringBuilder(64);
    sb.Append(GetType().Name).Append(" [");
    sb.Append(GetValueAsString());
    sb.Append("]");
    return sb.ToString();
}
}