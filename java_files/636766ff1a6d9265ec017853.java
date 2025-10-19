import java.util.*;

public class Generated_636766ff1a6d9265ec017853 {
    /**Return the label by the given bytecode offset if it has been created. Otherwise, creat a new label and return it.*/
    protected Label readLabel(final int bytecodeOffset,final Label[] labels){
        Label label = null;
        if(labels != null && bytecodeOffset >= 0 && bytecodeOffset < labels.length){
            label = labels[bytecodeOffset];
        }
        if(label == null){
            label = new Label();
            labels[bytecodeOffset] = label;
        }
        return label;
    }
}