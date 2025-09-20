import java.util.*;

public class Translation892 {
    @Override public boolean equals(Object obj) {
    if (!(obj instanceof State)) return false;
    final State other = (State) obj;
    return isFinal() == other.isFinal()&&Arrays.equals(labels, other.labels)&&Reference.compare(this.states, other.states);
}
}