import java.util.*;

public class Translation892 {
    public boolean equals(Object obj) {
    if (!(obj instanceof State)) {
        return false;
    }
    State other = (State) obj;
    return this.isFinal == other.isFinal && Arrays.equals(this.labels, other.labels) && Objects.equal(this.states, other.states);
}
}