import java.util.*;

public class Translation892 {
    public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    State other = (State) obj;
    if (isFinal != other.isFinal) return false;
    if (!Arrays.equals(labels, other.labels)) return false;
    if (states == null) return other.states == null;
    return Arrays.equals(states, other.states);
}
}