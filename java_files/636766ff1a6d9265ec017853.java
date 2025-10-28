import java.util.*;

public class Generated_636766ff1a6d9265ec017853 {
    protected Label readLabel(final int bytecodeOffset, final Label[] labels) {
        Label label = null;
        for (int i = 0; i < labels.length; i++) {
            if (labels[i].getBytecodeOffset() == bytecodeOffset) {
                label = labels[i];
                break;
            }
        }

        if (label == null) {
            label = new Label();
            label.setBytecodeOffset(bytecodeOffset);
            labels[labels.length] = label;
        }
        return label;
    }
}