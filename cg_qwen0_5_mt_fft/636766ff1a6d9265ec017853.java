import java.util.*;

public class Generated_636766ff1a6d9265ec017853 {
    protected Label readLabel(final int bytecodeOffset,final Label[] labels){
        final Label l = labels[bytecodeOffset];
        if (l != null) {
            return l;
        }
        l = new Label();
        labels[bytecodeOffset] = l;
        return l;
    }
}