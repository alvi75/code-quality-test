import java.util.*;

public class Translation892 {
    public boolean equals(Object obj) {
    if (!(obj instanceof State)) {
        return false;
    }
    State other = (State) obj;
    return getNumber() == other.getNumber()&& (target != null ? target.equals(other.target) : other.target != null)&& label.equals(other.label);
}
}