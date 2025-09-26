import java.util.*;

public class Translation892 {
    ublic boolean equals(Object o) {
    if (!(o instanceof State)) return false;
    State other = (State)o;
    return isFinal == other.isFinal && Arrays.equals(labels, other.labels) && states.equals(other.states);
}
}