import java.util.*;

public class Translation892 {
    public boolean equals(Object obj) {
    if (this == obj)return true;
    if (obj == null || getClass() != obj.getClass())return false;
    State other = (State) obj;
    return isFinal == other.isFinal && Arrays.equals(labels, other.labels) && states == other.states;
}
}