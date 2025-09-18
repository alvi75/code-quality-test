import java.util.*;

public class Translation892 {
    public boolean equals(Object obj) {
    if (!(obj instanceof State)) {
        return false;
    }
    State other = (State) obj;
    return isFinal == other.isFinal &&Arrays.equals(this.labels, other.labels);
}
}