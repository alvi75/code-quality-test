import java.util.*;

public class Translation892 {
    public boolean equals(Object obj) {
    State other = (State) obj;
    return is_final == other.is_final && Arrays.equals(this.labels, other.labels) && states == other.states;
}
}