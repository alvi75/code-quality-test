import java.util.*;

public class Generated_636766ff1a6d9265ec017853 {
    protected Label readLabel(final int bytecodeOffset,final Label[] labels){
		if(bytecodeOffset>=0 && bytecodeOffset<labels.length && labels[bytecodeOffset]!=null)
			return labels[bytecodeOffset];
		final Label l=new Label();
		labels[bytecodeOffset]=l;
		return l;
	}
}