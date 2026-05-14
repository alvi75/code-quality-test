import java.util.*;

public class Generated_636766ff1a6d9265ec017853 {
    /**Return the label by the given bytecode offset if it has been created. Otherwise, creat a new label and return it.*/
protected Label readLabel(final int bytecodeOffset,
                             final Label[] labels){
        Label l = labels[bytecodeOffset];
        if(l == null){
            l = new Label();
            labels[bytecodeOffset] = l;
        }
        return l;
    }
}