import java.util.*;

public class Generated_636766ff1a6d9265ec017853 {
    protected Label readLabel(final int bytecodeOffset,final Label[] labels){
		if (labels != null) {
			for (int i = 0; i < labels.length; ++i) {
				if (labels[i].getBytecode() == bytecodeOffset) {
					return labels[i];
				}
			}
		}

		final Label lbl = new Label();
		labels[labels.length] = lbl;
		return lbl;
	}
}