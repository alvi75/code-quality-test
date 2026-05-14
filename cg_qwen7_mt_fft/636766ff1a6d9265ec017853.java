import java.util.*;

public class Generated_636766ff1a6d9265ec017853 {
    protected Label readLabel(final int bytecodeOffset,
                              final Label[] labels) {
        // Finds or creates the corresponding Label.
        for (int i = 0; i < this.labelCount; ++i) {
            if (bytecodeOffset == this.labels[i].position) {
                return this.labels[i];
            }
        }

        if (labels != null && labels.length > 0) {
            return labels[labels.length - 1];
        } else {
            return new Label();
        }
    }
}