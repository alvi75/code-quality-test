import java.util.*;

public class Generated_636766ff1a6d9265ec017853 {
    public Label readLabel(final int bytecodeOffset, final Label[] labels) {
        Label result = labels[bytecodeOffset];
        if (result == null) {
            result = new Label();
            labels[bytecodeOffset] = result;
        }
        return result;
    }
}