import java.util.*;

public class Translation892 {
    01 public boolean equals(Object obj) {
    State other = (State)obj;
    return isFinal == other.isFinal && Arrays.equals(labels, other.labels) && states == other.states;
}
}