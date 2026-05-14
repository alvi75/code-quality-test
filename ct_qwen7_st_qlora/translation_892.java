import java.util.*;

public class Translation892 {
    public boolean equals(Object o) {
    if (!(o instanceof State)) return false;
    final State other = (State)o;
    return isFinal==other.isFinal&&Arrays.equals(labels, other.labels)&&states==other.states;
}
}