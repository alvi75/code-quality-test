import java.util.*;

public class Translationtranslation_892 {
    public boolean equals(Object obj) {
        if (!(obj instanceof State)) {
            return false;
        }
        State that = (State) obj;
        return this.stateNumber==that.stateNumber&& this.context.equals(that.context);
    }
}