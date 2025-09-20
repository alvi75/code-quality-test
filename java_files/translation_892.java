import java.util.*;

public class Translation892 {
    public boolean equals(Object obj) {
    if (!(obj instanceof State)) return false;
    State other = (State) obj;
    return is_final == other.is_final && Arrays.equals(this.labels, other.labels) && Arrays.equals(this.states, other.states);
}
}