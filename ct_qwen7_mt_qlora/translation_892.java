import java.util.*;

public class Translation892 {
    1 public boolean equals(Object o) {
    2 if (!(o instanceof State)) return false;
    3 State s = (State)o;
    4 return this.isFinal() == s.isFinal()5 && Arrays.equals(this.labels, s.labels)6 && Objects.equals(this.states, s.states);
}
}