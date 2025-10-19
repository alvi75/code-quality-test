import java.util.*;

public class Generated_636766ff1a6d9265ec017853 {
    protected Label readLabel(final int bytecodeOffset,final Label[] labels){
		if(labels!=null && (labels.length>0) && (labels[0].getBytecodeOffset()==bytecodeOffset)){
			return labels[0];
		}
		else{
			final Label l=new Label();
			l.setBytecodeOffset(bytecodeOffset);
			labels=ArrayUtils.add(labels,l);
			return l;
		}
	}
}