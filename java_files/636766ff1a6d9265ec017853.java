import java.util.*;

public class Generated_636766ff1a6d9265ec017853 {
    protected Label readLabel(final int bytecodeOffset,final Label[] labels){
		Label label = null;
		if(bytecodeOffset < 0 || bytecodeOffset >= labels.length){
			label = new Label();
			labels[labels.length] = label;
		}
		else{
			label = labels[bytecodeOffset];
		}
		return label;
	}
}