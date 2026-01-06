import java.util.*;

public class Translation892 {
    ublic boolean equals(Object obj) {
    final State other = (State) obj;
    return isFinal == other.isFinal &&Arrays.equals(labels, other.labels) && states == other.states;
}
}