import java.util.*;

public class Translation892 {
    ublic boolean equals(Object obj) {
    if (!(obj instanceof State)) {
        return false;
    }
    State other = (State) obj;
    if (label != other.label) {
        return false;
    }
    if (nextFinalState != other.nextFinalState) {
        return false;
    }
    if (!Arrays.equals(nextStates, other.nextStates)) {
        return false;
    }
    return true;
}
}