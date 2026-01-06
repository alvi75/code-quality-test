import java.util.*;

public class Generated_636766ff1a6d9265ec017853 {
    protected Label readLabel(final int bytecodeOffset,final Label[] labels) {
        final Label result;
        if (labels == null || (result = labels[bytecodeOffset]) != null) {
            return result;
        }
        return labels[bytecodeOffset] = new Label();
    }
}