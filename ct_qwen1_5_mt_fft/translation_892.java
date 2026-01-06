import java.util.*;

public class Translation892 {
    public boolean equals(Object o) {
    if (!(o instanceof State)) {
        return false;
    }
    State other = (State)o;
    return isFinal() == other.isFinal()&& Arrays.equals(this.labels, other.labels)&& Objects.equals(this.states, other.states);
}
}